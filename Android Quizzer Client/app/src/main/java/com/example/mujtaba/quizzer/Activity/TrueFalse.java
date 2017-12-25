package com.example.mujtaba.quizzer.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mujtaba.quizzer.R;

public class TrueFalse extends AppCompatActivity {
    private Button end;
    private TextView ques;
    private Spinner option;

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
        finish();
    }
}
