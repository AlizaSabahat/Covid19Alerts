package com.example.covid19alerts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {
TextView btnsignup;
TextInputLayout edtName, edtEmail, edtPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);
        btnsignup= findViewById(R.id.btnSignUp);
        edtName= findViewById(R.id.edtxtName);
        edtEmail=findViewById(R.id.edtxtEmail);
        edtPassword=findViewById(R.id.edtxtPasswordName);
        mAuth=FirebaseAuth.getInstance();


        btnsignup.setOnClickListener(v -> {
        //    Intent intent= new Intent(getApplicationContext(),Dashboard.class);
            //startActivity(intent);
            String Name=edtName.getEditText().getText().toString();
            String Email=edtEmail.getEditText().getText().toString();
            String Password= edtPassword.getEditText().getText().toString();
            mAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(Task<AuthResult> task) {
                    if(task.isSuccessful()){
                          Intent intent= new Intent(getApplicationContext(),Dashboard.class);
                        startActivity(intent);

                    }
                    else
                        Toast.makeText(Signup.this, task.getException().getMessage(),Toast.LENGTH_LONG).show();

                }
            });
        });
    }
}