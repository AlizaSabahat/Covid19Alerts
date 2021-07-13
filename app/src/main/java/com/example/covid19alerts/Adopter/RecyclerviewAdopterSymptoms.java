package com.example.covid19alerts.Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid19alerts.Model.symptomsModel;
import com.example.covid19alerts.R;

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdopterSymptoms.ViewHolder holder, int position) {
      //holder.imageView.setImageResource();
        holder.txtTitle.setText(modellist.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txtTitle;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imagecommansymptoms);
                    txtTitle= itemView.findViewById(R.id.txtcommanSymptoms);
        }
    }
}
