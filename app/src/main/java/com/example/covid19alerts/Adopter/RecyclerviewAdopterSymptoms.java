package com.example.covid19alerts.Adopter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid19alerts.Model.symptomsModel;

import java.util.List;

public class RecyclerviewAdopterSymptoms extends RecyclerView.Adapter<RecyclerviewAdopterSymptoms.ViewHolder> {
Context context;
List<symptomsModel> modellist;

    public RecyclerviewAdopterSymptoms(Context context, List<symptomsModel> modellist) {
        this.context = context;
        this.modellist = modellist;
    }

    @NonNull

    @Override
    public RecyclerviewAdopterSymptoms.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdopterSymptoms.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
        }
    }
}
