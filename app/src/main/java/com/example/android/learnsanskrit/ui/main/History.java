package com.example.android.learnsanskrit.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android.learnsanskrit.R;
import com.example.android.learnsanskrit.historyAdapter;
import com.example.android.learnsanskrit.testHistory;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class History extends AppCompatActivity {

    private RecyclerView recyclerView;
    private historyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = (RecyclerView) findViewById(R.id.historyList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<testHistory> options =
                new FirebaseRecyclerOptions.Builder<testHistory>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Test"), testHistory.class)
                        .build();

        adapter = new historyAdapter(options);
        recyclerView.setAdapter(adapter);

    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}