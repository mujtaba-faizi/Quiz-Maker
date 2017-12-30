package com.example.mujtaba.quizzer.Activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.mujtaba.quizzer.Model.Quiz;
import com.example.mujtaba.quizzer.R;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizTaking extends AppCompatActivity {
    private Button start;
    private Spinner spinner;
    private List<Quiz> quizList;
    public static final String REST_SERVICE_URI = "http://192.168.8.102:8080/quizzes";
    RestTemplate restTemplate = new RestTemplate();

    /* THREAD FOR REQUESTING QUIZ LIST FROM SERVER */
    private class HttpRequestQuiz extends AsyncTask<Void, Void, List<Quiz>> {

        @Override
        protected List<Quiz> doInBackground(Void... params) {
            try {

                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ResponseEntity<Quiz[]> quizes = restTemplate.getForEntity(REST_SERVICE_URI + "/allquizzes/", Quiz[].class);
                return Arrays.asList(quizes.getBody());

            } catch (Exception e) {
                Log.e("No quiz being shown", e.getMessage(), e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(List<Quiz> quizes) {
            quizList = quizes;

            /* DISPLAYING RETRIEVED QUIZES IN SPINNER */
            List<String> list = new ArrayList<String>();

            for (int i = 0; i < quizes.size(); i++) {
                list.add(quizes.get(i).getTitle());
            }

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(QuizTaking.this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_taking);

        start=(Button) findViewById(R.id.start_quiz);
        spinner = (Spinner) findViewById(R.id.quizzes_id);

        new HttpRequestQuiz().execute();
    }

    public void goto_quiz(View v){
        Intent i = new Intent(getBaseContext(), QuestionActivity.class);
        int quizPos = spinner.getSelectedItemPosition();
        int quizid = quizList.get(quizPos).getID();    //gets the id of quiz selected by the user
        i.putExtra("quizid", quizid);
        startActivity(i);
    }
}
