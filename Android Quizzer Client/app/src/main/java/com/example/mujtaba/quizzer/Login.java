package com.example.mujtaba.quizzer;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mujtaba.quizzer.Activity.QuizMaking;
import com.example.mujtaba.quizzer.Activity.QuizTaking;
import com.example.mujtaba.quizzer.Model.User;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class Login extends AppCompatActivity {
    private Button button;
    private TextView username;
    private TextView password;
    private Spinner role;
    private String url = "http://192.168.8.102:8080/users";
    private User user=new User();

private final String TAG="Error in logging in";
    RestTemplate restTemplate = new RestTemplate();

    private class HttpRequestLogin extends AsyncTask<Void, Void, User> {
        @Override
        protected User doInBackground(Void... params) {
            try {

                user.setUsername(username.getText().toString());
                user.setPassword(password.getText().toString());
                switch (role.getSelectedItem().toString()) {

                    case "Student":
                        user.setRole("Student");
                        break;

                    case "Instructor":
                        user.setRole("Instructor");
                        break;
                }
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                user = restTemplate.postForObject(url+"/signup/" , user , User.class);
                return user;

            } catch (Exception e) {
                Log.e(TAG, e.getMessage(), e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(User user) {

            switch (role.getSelectedItem().toString()) {

                case "Student":
                    Intent i = new Intent(getBaseContext(), QuizTaking.class);
                    startActivity(i);
                    break;

                case "Instructor":
                    Intent j = new Intent(getBaseContext(), QuizMaking.class);
                    startActivity(j);
                    break;
            }

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(TextView) findViewById(R.id.username);
        password=(TextView) findViewById(R.id.password);
        button=(Button) findViewById(R.id.button);
        role = (Spinner) findViewById(R.id.role);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.role_spinner, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        role.setAdapter(adapter);
    }

    public void Quiz(View v) {
// send request to server
        new HttpRequestLogin().execute();
    }



}
