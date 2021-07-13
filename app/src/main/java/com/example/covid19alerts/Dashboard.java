package com.example.covid19alerts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class Dashboard extends AppCompatActivity {
    Toolbar toolbar;
    CardView cardSymptom;
    CardView cardPrecaution;
    CardView cardTreatment;
    CardView cardMentalHealth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cardSymptom = findViewById(R.id.cardSymtopms);
        cardPrecaution = findViewById(R.id.cardPrecautions);
        cardTreatment = findViewById(R.id.cardTreatments);
        cardMentalHealth = findViewById(R.id.cardMentalhealth);
        cardSymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, Symptoms.class));

            }
        });


        cardPrecaution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, Precautions.class));
            }
        });

        cardTreatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, Treatments.class));
            }
        });
        cardMentalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this, MentalHealth.class));
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if(id==R.id.locationicon){
            startActivity(new Intent(Dashboard.this, MapActivity.class));
        }
        return true;
    }
}


