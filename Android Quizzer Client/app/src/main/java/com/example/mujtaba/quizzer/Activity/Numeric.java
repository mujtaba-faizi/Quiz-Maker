package com.example.mujtaba.quizzer.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mujtaba.quizzer.R;

public class Numeric extends AppCompatActivity {
    private Button end;
    private TextView ques;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric);

        ques=(TextView) findViewById(R.id.numques);
        ans=(TextView) findViewById(R.id.numans);
        end=(Button) findViewById(R.id.endnum);
    }

    public void End_Numeric(View v)
    {
        finish();
    }

    }
