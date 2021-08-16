package com.example.android.learnsanskrit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Historyquiz extends AppCompatActivity {

    private RecyclerView recyclerView;
    DatabaseReference database;
    historyAdapter historyAdapter;
    private FirebaseAuth mAuth;
    ArrayList<testHistory> list;
    private TextView statusHistory;
    String x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historyquiz);


        recyclerView = findViewById(R.id.historyList);

        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        x = currentUser.getEmail();

        database = FirebaseDatabase.getInstance().getReference("Test");
        Query query = database.orderByChild("User").equalTo(x);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        historyAdapter = new historyAdapter(this,list);
        recyclerView.setAdapter(historyAdapter);


        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    testHistory testHistory = dataSnapshot.getValue(testHistory.class);
                    list.add(testHistory);
                }
                historyAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });


    }

}













