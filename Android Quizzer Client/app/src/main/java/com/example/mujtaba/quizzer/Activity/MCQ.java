package com.example.mujtaba.quizzer.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mujtaba.quizzer.R;

public class MCQ extends AppCompatActivity {
    private Button end;
    private TextView ques;
    private TextView M1;
    private TextView M2;
    private TextView M3;
    private TextView M4;
    private Spinner option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);

        M1=(TextView) findViewById(R.id.m1);
        M2=(TextView) findViewById(R.id.m2);
        M3=(TextView) findViewById(R.id.m3);
        M4=(TextView) findViewById(R.id.m4);
        end=(Button) findViewById(R.id.mcq_end);
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
        finish();
    }

    }
