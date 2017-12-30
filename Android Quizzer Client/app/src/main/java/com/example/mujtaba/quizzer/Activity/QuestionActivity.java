package com.example.mujtaba.quizzer.Activity;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mujtaba.quizzer.Model.Question;
import com.example.mujtaba.quizzer.R;

import java.util.List;

public class QuestionActivity extends AppCompatActivity {
    private int score;
    private RadioButton mcq1;
    private RadioButton mcq2;
    private RadioButton mcq3;
    private RadioButton mcq4;
    private RadioButton tru;
    private RadioButton fls;
    private TextView num;
    private RelativeLayout mcq;
    private RelativeLayout tf;
    private RelativeLayout numeric;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mcq1=(RadioButton)findViewById(R.id.m1radio);
        mcq2=(RadioButton)findViewById(R.id.m2radio);
        mcq3=(RadioButton)findViewById(R.id.m3radio);
        mcq4=(RadioButton)findViewById(R.id.m4radio);
        tru=(RadioButton)findViewById(R.id.trueradio);
        fls=(RadioButton)findViewById(R.id.falseradio);
        num=(TextView)findViewById(R.id.usernumericanswer);
        numeric=(RelativeLayout)findViewById(R.id.numericlayout);
        mcq=(RelativeLayout)findViewById(R.id.mcqlayout);
        tf=(RelativeLayout)findViewById(R.id.truefalselayout);
    }

    public void nextQues(View v){

    }

}
