package com.example.covid19alerts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.covid19alerts.Adopter.RecyclerviewAdopterSymptoms;
import com.example.covid19alerts.Model.symptomsModel;

import java.util.ArrayList;
import java.util.List;

public class Symptoms extends AppCompatActivity {
    Toolbar toolbar;
    List<symptomsModel> modelListMost=new ArrayList<>();
    List<symptomsModel> modelListLess=new ArrayList<>();
    List<symptomsModel> modelListSever=new ArrayList<>();

    RecyclerviewAdopterSymptoms adopterSymptoms, adopterSymptoms2, adopterSymptoms3;
    RecyclerView recyclerView, recyclerView2 , recyclerView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView2=findViewById(R.id.recyclerView2);
        recyclerView3=findViewById(R.id.recyclerView3);
        modelListMost.add(new symptomsModel(1, "Fever" ));
        modelListMost.add(new symptomsModel(2, "Cough" ));
        modelListMost.add(new symptomsModel(3, "Tiredness" ));
        adopterSymptoms=new RecyclerviewAdopterSymptoms(Symptoms.this, modelListMost);
        recyclerView.setLayoutManager(new LinearLayoutManager(Symptoms.this));
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(adopterSymptoms);
        modelListLess.add(new symptomsModel(1,"Aches and Pains"));
        modelListLess.add(new symptomsModel(1,"Sore throat"));
        modelListLess.add(new symptomsModel(1,"Diarrhea"));
        modelListLess.add(new symptomsModel(1,"Headache"));
        adopterSymptoms2= new RecyclerviewAdopterSymptoms(Symptoms.this,modelListLess);
        recyclerView2.setLayoutManager(new LinearLayoutManager(Symptoms.this));
        recyclerView2.hasFixedSize();
        recyclerView2.setAdapter(adopterSymptoms2);

        modelListSever.add(new symptomsModel(1,"Difficulty in breathing"));
        modelListSever.add(new symptomsModel(1,"Chest pain and Pressure"));
        modelListSever.add(new symptomsModel(1,"Lost of Speech or Movement"));
        adopterSymptoms3= new RecyclerviewAdopterSymptoms(Symptoms.this,modelListSever);
        recyclerView3.setLayoutManager(new LinearLayoutManager(Symptoms.this));
        recyclerView3.hasFixedSize();
        recyclerView3.setAdapter(adopterSymptoms3);

    }
}