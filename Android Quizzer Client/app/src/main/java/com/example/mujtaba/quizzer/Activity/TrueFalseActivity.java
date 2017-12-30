package com.example.mujtaba.quizzer.Activity;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mujtaba.quizzer.Model.TrueFalse;
import com.example.mujtaba.quizzer.R;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class TrueFalseActivity extends AppCompatActivity {
    private Button end;
    private TextView ques;
    private Spinner option;
    private TrueFalse tf=new TrueFalse();
    private String url = "http://192.168.8.102:8080/questions";
    RestTemplate restTemplate = new RestTemplate();

    private class HttpRequestQuestion extends AsyncTask<Void, Void, TrueFalse> {
        @Override
        protected TrueFalse doInBackground(Void... params) {
            try {
                tf.setQuestion(ques.getText().toString());
                tf.setAns(option.getSelectedItem().toString());
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                tf = restTemplate.postForObject(url + "/addtruefalse/", tf, TrueFalse.class);
                return tf;

            } catch (Exception e) {
                Log.e("Question not added", e.getMessage(), e);
            }
            return null;
        }
        @Override
        protected void onPostExecute (TrueFalse tf){

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false);

        ques=(TextView) findViewById(R.id.TFques);
        end=(Button) findViewById(R.id.end_TF);
        option = (Spinner) findViewById(R.id.TFans);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.TF_ans, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        option.setAdapter(adapter);
    }

    public void End_TF(View v){
        new HttpRequestQuestion().execute();
        finish();
    }
}
