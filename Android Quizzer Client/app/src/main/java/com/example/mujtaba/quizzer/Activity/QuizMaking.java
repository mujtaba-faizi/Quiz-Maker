package com.example.mujtaba.quizzer.Activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mujtaba.quizzer.Model.Quiz;
import com.example.mujtaba.quizzer.Model.User;
import com.example.mujtaba.quizzer.R;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class QuizMaking extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button end;
    private TextView title;
    private TextView desc;
    private String url = "http://192.168.8.102:8080/quizzes";
    private Quiz quiz=new Quiz();
    private int score;

    private final String TAG="Error in logging in";
    RestTemplate restTemplate = new RestTemplate();

    private class HttpRequestQuizMaking extends AsyncTask<Void, Void, Quiz> {
        @Override
            protected Quiz doInBackground(Void... params) {
                try {
                    int userID = getIntent().getIntExtra("userid",0);
                    User user=new User();
                    user.setId(userID);
                    quiz.setTitle(title.getText().toString());
                    quiz.setDescription(desc.getText().toString());
                    quiz.setUser(user);
                    restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                    quiz = restTemplate.postForObject(url + "/makequiz/", quiz, Quiz.class);
                    return quiz;

                } catch (Exception e) {
                    Log.e(TAG, e.getMessage(), e);
                }

                return null;
            }
        @Override
        protected void onPostExecute(Quiz quiz) {
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_making);

        title=(TextView) findViewById(R.id.title);
        desc=(TextView) findViewById(R.id.desc);
        button1=(Button) findViewById(R.id.mcq);
        button2=(Button) findViewById(R.id.numeric);
        button3=(Button) findViewById(R.id.TF);
    }

    public void MCQ(View v) {
        score=+5;   //add 5 more marks
        Intent i = new Intent(getBaseContext(), MCQActivity.class);
        i.putExtra("quizid", quiz.getID());
        startActivity(i);
    }


    public void Numeric(View v) {
        score=+5;
        Intent j = new Intent(getBaseContext(), NumericActivity.class);
        startActivity(j);
    }


    public void TF(View v) {
        score=+5;
        Intent k = new Intent(getBaseContext(), TrueFalseActivity.class);
        startActivity(k);
    }

    public void Finish(View v) {

        new HttpRequestQuizMaking().execute();
        finish();
        //closes the current activity
    }
}
