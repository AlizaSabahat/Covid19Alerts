package com.example.covid19alerts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
TextView txtSignUp,btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_log_in);
        txtSignUp=  findViewById(R.id.txtCreateAcc);
        txtSignUp.setOnClickListener(v -> {
            Intent intent= new Intent(getApplicationContext(),Signup.class);
            startActivity(intent);
        });
        btnlogin=  findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(v -> {
            Intent intent= new Intent(getApplicationContext(),Dashboard.class);
            startActivity(intent);
        });

    }
}