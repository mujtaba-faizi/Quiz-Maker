package com.example.mujtaba.quizzer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.mujtaba.quizzer.R;

import java.util.ArrayList;
import java.util.List;

public class QuizTaking extends AppCompatActivity {
    private Button start;
    private Spinner quizzes;
    private List<String> spinnerArray =  new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_taking);

        start=(Button) findViewById(R.id.start_quiz);

        spinnerArray.add("item1");
        spinnerArray.add("item2");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quizzes = (Spinner) findViewById(R.id.quizzes_id);
        quizzes.setAdapter(adapter);
    }

    public void goto_quiz(View v){
        String text = quizzes.getSelectedItem().toString();
        Intent i = new Intent(getBaseContext(), QuestionActivity.class);
      //  Intent.putExtra("location", text);
        startActivity(i);
    }
}
