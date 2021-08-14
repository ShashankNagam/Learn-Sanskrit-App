package com.example.android.learnsanskrit;

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

public class historyAdapter extends FirebaseRecyclerAdapter<testHistory,historyAdapter.testViewHolder> {


    public historyAdapter(@NonNull @NotNull FirebaseRecyclerOptions<testHistory> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull @NotNull testViewHolder Holder, int i, @NonNull @NotNull testHistory testHistory) {
        Holder.dateAndTime.setText(testHistory.getTime());
        Holder.statusHistory.setText(testHistory.getStatus());
        Holder.scoreHistory.setText(testHistory.getScore());
    }

    @NonNull
    @NotNull
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
    }

}
