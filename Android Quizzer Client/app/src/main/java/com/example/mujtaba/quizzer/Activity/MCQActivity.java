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

import com.example.mujtaba.quizzer.Model.MCQ;
import com.example.mujtaba.quizzer.R;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MCQActivity extends AppCompatActivity {
    private Button end;
    private TextView ques;
    private TextView M1;
    private TextView M2;
    private TextView M3;
    private TextView M4;
    private Spinner option;

    private MCQ mcq=new MCQ();
    private String url = "http://192.168.8.102:8080/questions";
    RestTemplate restTemplate = new RestTemplate();
    private class HttpRequestMCQQuestion extends AsyncTask<Void, Void, MCQ> {
        @Override
        protected MCQ doInBackground(Void... params) {
            try {
                int answer=Integer.parseInt(option.getSelectedItem().toString());
                mcq.setQuestion(ques.getText().toString());
                mcq.setMCQ1(M1.getText().toString());
                mcq.setMCQ2(M2.getText().toString());
                mcq.setMCQ3(M3.getText().toString());
                mcq.setMCQ4(M4.getText().toString());
                mcq.setAns(answer);
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                mcq = restTemplate.postForObject(url + "/addmcqs/", mcq, MCQ.class);
                return mcq;

            } catch (Exception e) {
                Log.e("Question not added", e.getMessage(), e);
            }
            return null;
        }
        @Override
        protected void onPostExecute (MCQ mcq){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);

        ques=(TextView)findViewById(R.id.mcq_mcq);
        M1=(TextView) findViewById(R.id.m1);
        M2=(TextView) findViewById(R.id.m2);
        M3=(TextView) findViewById(R.id.m3);
        M4=(TextView) findViewById(R.id.m4);
        option = (Spinner) findViewById(R.id.mcqans);
        end=(Button) findViewById(R.id.mcq_end);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.mcq_ans, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        option.setAdapter(adapter);
    }

    public void CloseMCQ(View v) {
        new HttpRequestMCQQuestion().execute();
        finish();
    }

    }
