package com.example.mujtaba.quizzer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mujtaba.quizzer.R;

public class QuizMaking extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button end;
    private TextView title;
    private TextView desc;

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
        Intent i = new Intent(getBaseContext(), MCQ.class);
        startActivity(i);
    }


    public void Numeric(View v) {
        Intent j = new Intent(getBaseContext(), Numeric.class);
        startActivity(j);
    }


    public void TF(View v) {
        Intent k = new Intent(getBaseContext(), TrueFalse.class);
        startActivity(k);
    }

    public void Finish(View v) {
        finish();    //closes the current activity
    }
}
