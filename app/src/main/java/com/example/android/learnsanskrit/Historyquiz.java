package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;

public class Historyquiz extends AppCompatActivity {

    private RecyclerView recyclerView;
    private historyAdapter adapter;
    /*private StorageReference storageReference;
    private DatabaseReference databaseReference;
    List<testHistory> modelHistory;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historyquiz);

        /*
        recyclerView = findViewById(R.id.historyList);
        storageReference = FirebaseStorage.getInstance().getReference("Test");
        databaseReference = FirebaseDatabase.getInstance().getReference("Test");

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new historyAdapter(Historyquiz.this,modelHistory);
        */


        recyclerView = findViewById(R.id.historyList);

        FirebaseRecyclerOptions<testHistory> options =
                new FirebaseRecyclerOptions.Builder<testHistory>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Test"),testHistory.class)
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