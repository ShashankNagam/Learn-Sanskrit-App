package com.example.android.learnsanskrit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class historyAdapter extends RecyclerView.Adapter<historyAdapter.Myviewholder> {

    Context context;
    ArrayList<testHistory> list;

    public historyAdapter(Context context, ArrayList<testHistory> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @NotNull
    @Override
    public historyAdapter.Myviewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.testhistory,parent,false);
        return new Myviewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull historyAdapter.Myviewholder holder, int position) {
        testHistory testHistory = list.get(position);
        holder.dateAndTime.setText(testHistory.getTime());
        holder.statusHistory.setText(testHistory.getStatus());
        holder.scoreHistory.setText(testHistory.getScore());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder {

        TextView dateAndTime,statusHistory,scoreHistory;

        public Myviewholder(@NonNull @NotNull View itemView) {
            super(itemView);
            dateAndTime = itemView.findViewById(R.id.dateAndTime);
            statusHistory = itemView.findViewById(R.id.statusHistory);
            scoreHistory = itemView.findViewById(R.id.scoreHistory);

        }
    }




    /*
    public historyAdapter(@NonNull @NotNull FirebaseRecyclerOptions<testHistory> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull @NotNull testViewHolder Holder, int i,  @NotNull testHistory testHistory) {
        Holder.dateAndTime.setText(testHistory.getTime());
        Holder.statusHistory.setText(testHistory.getStatus());
        Holder.scoreHistory.setText(testHistory.getScore());
    }

    @NonNull
    @Override
    public testViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.testhistory, parent, false);

        return new testViewHolder(view);
    }

    class testViewHolder extends RecyclerView.ViewHolder {
        TextView dateAndTime,statusHistory,scoreHistory;

        public testViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            dateAndTime = itemView.findViewById(R.id.dateAndTime);
            statusHistory = itemView.findViewById(R.id.statusHistory);
            scoreHistory = itemView.findViewById(R.id.scoreHistory);

        }

     */

}
