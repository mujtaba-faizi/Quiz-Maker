package com.example.mujtaba.quizzer.Activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mujtaba.quizzer.Model.Numeric;
import com.example.mujtaba.quizzer.Model.Quiz;
import com.example.mujtaba.quizzer.R;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class NumericActivity extends AppCompatActivity {
    private Button end;
    private TextView ques;
    private TextView ans;
    private Numeric num=new Numeric();
    private String url = "http://192.168.8.102:8080/questions";
    RestTemplate restTemplate = new RestTemplate();
    private class HttpRequestQuestion extends AsyncTask<Void, Void, Numeric> {
        @Override
        protected Numeric doInBackground(Void... params) {
            try {

                int answer=Integer.parseInt(ans.getText().toString());
                num.setQuestion(ques.getText().toString());
                num.setAns(answer);
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                num = restTemplate.postForObject(url + "/addnumeric/", num, Numeric.class);
                return num;

            } catch (Exception e) {
                Log.e("Question not added", e.getMessage(), e);
            }
            return null;
        }
            @Override
            protected void onPostExecute (Numeric num){

            }
        }
            protected void onCreate (Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_numeric);

                ques = (TextView) findViewById(R.id.numques);
                ans = (TextView) findViewById(R.id.numans);
                end = (Button) findViewById(R.id.endnum);
            }

        public void End_Numeric(View v) {
            new HttpRequestQuestion().execute();
                finish();
        }

    }
