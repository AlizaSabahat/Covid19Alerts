package com.example.covid19alerts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
TextView btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_signup);
        btnsignup= findViewById(R.id.btnSignUp);
        btnsignup.setOnClickListener(v -> {
            Intent intent= new Intent(getApplicationContext(),Dashboard.class);
            startActivity(intent);
        });
    }
}