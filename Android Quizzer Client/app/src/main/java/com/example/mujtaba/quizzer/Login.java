package com.example.mujtaba.quizzer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.session.MediaSessionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.example.mujtaba.quizzer.Activity.QuizMaking;
import com.example.mujtaba.quizzer.Activity.QuizTaking;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

import static com.android.volley.toolbox.Volley.newRequestQueue;

public class Login extends AppCompatActivity {
    private Button button;
    private TextView username;
    private TextView password;
    private Spinner role;
    private String url = "http://localhost:8080/users/signup";
    private RequestQueue queue;

private final String TAG=this.getClass().getSimpleName();

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

    public void Quiz(View v) {   //select a new activity on the basis of role

// Instantiate the cache
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
