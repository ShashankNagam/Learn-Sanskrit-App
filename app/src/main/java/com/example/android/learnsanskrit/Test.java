package com.example.android.learnsanskrit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

import java.io.IOException;
import java.util.ArrayList;

public class Test extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;
    int temp;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference rootRef, demoRef;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        Button ans1 = (Button) findViewById(R.id.correct1);
        Button answ1 = (Button) findViewById(R.id.wrong1);
        ImageView q1 = (ImageView) findViewById(R.id.Q1);
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fwater_denoised.MP3?alt=media&token=8c5b1f40-12dd-4759-895b-57dddfd4bf21");
            }
        });
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                //score.setText(String.valueOf(temp));
                ans1.setEnabled(false);
                answ1.setEnabled(false);
                ans1.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        answ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans1.setEnabled(false);
                answ1.setEnabled(false);
                answ1.setBackgroundColor(getResources().getColor(R.color.red));
                //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans2 = (Button) findViewById(R.id.correct2);
        Button answ2 = (Button) findViewById(R.id.wrong2);
        ImageView q2 = (ImageView) findViewById(R.id.Q2);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftosit_denoised.MP3?alt=media&token=28df9183-e346-4e00-9b63-fd7f9332847d");
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                ans2.setEnabled(false);
                answ2.setEnabled(false);
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                ans2.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans2.setEnabled(false);
                answ2.setEnabled(false);
                answ2.setBackgroundColor(getResources().getColor(R.color.red));
                //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans3 = (Button) findViewById(R.id.correct3);
        Button answ3 = (Button) findViewById(R.id.wrong3);
        TextView q3 = (TextView) findViewById(R.id.Q3);

        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                ans3.setEnabled(false);
                answ3.setEnabled(false);
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                ans3.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans3.setEnabled(false);
                answ3.setEnabled(false);
                answ3.setBackgroundColor(getResources().getColor(R.color.red));
                //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans4 = (Button) findViewById(R.id.correct4);
        Button answ4 = (Button) findViewById(R.id.wrong4);
        TextView q4 = (TextView) findViewById(R.id.Q4);

        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                ans4.setEnabled(false);
                answ4.setEnabled(false);
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                ans4.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans4.setEnabled(false);
                answ4.setEnabled(false);
                answ4.setBackgroundColor(getResources().getColor(R.color.red));
                //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans5 = (Button) findViewById(R.id.correct5);
        Button answ5 = (Button) findViewById(R.id.wrong5);

        ans5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                ans5.setEnabled(false);
                answ5.setEnabled(false);
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                ans5.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans5.setEnabled(false);
                answ5.setEnabled(false);
                answ5.setBackgroundColor(getResources().getColor(R.color.red));
                //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans6 = (Button) findViewById(R.id.correct6);
        Button answ6 = (Button) findViewById(R.id.wrong6);
        ImageView q6 = (ImageView) findViewById(R.id.Q6);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fpeacock.png?alt=media&token=1a7dd6ac-d0d5-4c9f-8b59-fd2b378964f2")
                .placeholder(R.drawable.blankblue)
                .into(q6);
        ans6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                ans6.setEnabled(false);
                answ6.setEnabled(false);
                ans6.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        answ6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans6.setEnabled(false);
                answ6.setEnabled(false);
                answ6.setBackgroundColor(getResources().getColor(R.color.red));
                //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans7 = (Button) findViewById(R.id.correct7);
        Button answ7 = (Button) findViewById(R.id.wrong7);
        ImageView q7 = (ImageView) findViewById(R.id.Q7);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fhorse.png?alt=media&token=8d828c35-b921-4883-b354-92b745b122cb")
                .placeholder(R.drawable.blankblue)
                .into(q7);
        ans7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;;
                ans7.setEnabled(false);
                answ7.setEnabled(false);
                ans7.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                TextView cScore = (TextView) findViewById(R.id.cScore);
                cScore.setText(String.valueOf(temp));
            }
        });

        answ7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans7.setEnabled(false);
                answ7.setEnabled(false);
                answ7.setBackgroundColor(getResources().getColor(R.color.red));
                //ans1.setBackgroundColor(getResources().getColor(R.color.bd));

            }
        });


        submit = findViewById(R.id.submit);

        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        rootRef = FirebaseDatabase.getInstance().getReference();
        String currentuser = FirebaseAuth.getInstance().getCurrentUser().getUid();
        demoRef = rootRef.child(currentuser);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView cScore = (TextView) findViewById(R.id.cScore);
                cScore.setText("Current score: " + String.valueOf(temp));

                String value = String.valueOf(temp);

                // Push creates a unique id in database
                demoRef.setValue(value);
            }
        });

        TextView pScore = findViewById(R.id.pScore);
        demoRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                pScore.setText("Previous score: "+ value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                pScore.setText("--");
            }
        });
    }



















    private void playAudio(String audioUrl)
    {
        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
        {
            if(haveNetwork())
            {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try{
                    mediaPlayer.setDataSource(audioUrl);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Check your internet connection", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Sign In to access audio", Toast.LENGTH_LONG).show();
        }
    }

    private boolean haveNetwork(){
        boolean have_WIFI= false;
        boolean have_MobileData = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();
        for(NetworkInfo info:networkInfos){
            if (info.getTypeName().equalsIgnoreCase("WIFI"))if (info.isConnected())have_WIFI=true;
            if (info.getTypeName().equalsIgnoreCase("MOBILE DATA"))if (info.isConnected())have_MobileData=true;
        }
        return have_WIFI||have_MobileData;
    }
}