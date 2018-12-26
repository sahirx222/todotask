package com.example.alii.todotask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
Button login, signup;
EditText emailid, passid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        emailid=findViewById(R.id.emailid);
        passid=findViewById(R.id.passid);
    }
}
