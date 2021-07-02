package com.example.covid19alerts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogIn extends AppCompatActivity {
TextView txtSignUp;
 Button btnlogin;
    TextInputLayout  edtEmail, edtPassword;
    private FirebaseAuth mAuth;
    ProgressDialog progressDialog;



    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_log_in);
        txtSignUp=  findViewById(R.id.txtCreateAcc);
        edtEmail=findViewById(R.id.emailid);
        edtPassword=findViewById(R.id.passwordName);
        progressDialog= new ProgressDialog(LogIn.this);
        mAuth= FirebaseAuth.getInstance();
        txtSignUp.setOnClickListener(v -> {
            Intent intent= new Intent(getApplicationContext(),Signup.class);
            startActivity(intent);

        });

        btnlogin=  findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(v -> {

            String Email=edtEmail.getEditText().getText().toString();
            String Password= edtPassword.getEditText().getText().toString();
            progressDialog.setTitle("Please Wait");
            progressDialog.setMessage("We are checking your credentials");
            progressDialog.show();
            mAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(Task<AuthResult> task) {
                    progressDialog.dismiss();
                    if(task.isSuccessful()){
                        Intent intent= new Intent(getApplicationContext(),Dashboard.class);
                        startActivity(intent);

                    }
                    else
                       // Toast.makeText(LogIn.this, task.getException().getMessage(),Toast.LENGTH_LONG);
                        Snackbar.make(v, task.getException().getMessage(), Snackbar.LENGTH_LONG).show();

                }
            });
        });

    }
}