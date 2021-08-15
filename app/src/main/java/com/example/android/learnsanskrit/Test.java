package com.example.android.learnsanskrit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Test extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;
    int temp;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference rootRef, demoRef;
    Button submit;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

/*
        delete11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(SignIn.this, MainActivity.class);
                c.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(c);
                finish();
            }
        });
        */


        LinearLayout que1 = (LinearLayout) findViewById(R.id.que1);
        LinearLayout que2 = (LinearLayout) findViewById(R.id.que2);
        LinearLayout que3 = (LinearLayout) findViewById(R.id.que3);
        LinearLayout que4 = (LinearLayout) findViewById(R.id.que4);
        LinearLayout que5 = (LinearLayout) findViewById(R.id.que5);
        LinearLayout que6 = (LinearLayout) findViewById(R.id.que6);
        LinearLayout que7 = (LinearLayout) findViewById(R.id.que7);
        LinearLayout que8 = (LinearLayout) findViewById(R.id.que8);
        LinearLayout que9 = (LinearLayout) findViewById(R.id.que9);
        LinearLayout que10 = (LinearLayout) findViewById(R.id.que10);


        TextView cScore = (TextView) findViewById(R.id.cScore);

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
                cScore.setText("Current score: " + String.valueOf(temp));
                que1.setBackgroundColor(Color.parseColor("#50008000"));
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
                que1.setBackgroundColor(Color.parseColor("#50FF0000"));
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
                cScore.setText("Current score: " + String.valueOf(temp));
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                que2.setBackgroundColor(Color.parseColor("#50008000"));
                ans2.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans2.setEnabled(false);
                answ2.setEnabled(false);
                que2.setBackgroundColor(Color.parseColor("#50FF0000"));
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
                cScore.setText("Current score: " + String.valueOf(temp));
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                que3.setBackgroundColor(Color.parseColor("#50008000"));
                ans3.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans3.setEnabled(false);
                answ3.setEnabled(false);
                que3.setBackgroundColor(Color.parseColor("#50FF0000"));
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
                cScore.setText("Current score: " + String.valueOf(temp));
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                que4.setBackgroundColor(Color.parseColor("#50008000"));
                ans4.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans4.setEnabled(false);
                answ4.setEnabled(false);
                que4.setBackgroundColor(Color.parseColor("#50FF0000"));
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
                cScore.setText("Current score: " + String.valueOf(temp));
                //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                que5.setBackgroundColor(Color.parseColor("#50008000"));
                ans5.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans5.setEnabled(false);
                answ5.setEnabled(false);
                que5.setBackgroundColor(Color.parseColor("#50FF0000"));
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
                cScore.setText("Current score: " + String.valueOf(temp));
                que6.setBackgroundColor(Color.parseColor("#50008000"));
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
                que6.setBackgroundColor(Color.parseColor("#50FF0000"));
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
                que7.setBackgroundColor(Color.parseColor("#50008000"));
                ans7.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                cScore.setText("Current score: "+String.valueOf(temp));
            }
        });

        answ7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans7.setEnabled(false);
                answ7.setEnabled(false);
                que7.setBackgroundColor(Color.parseColor("#50FF0000"));
                answ7.setBackgroundColor(getResources().getColor(R.color.red));
                //ans1.setBackgroundColor(getResources().getColor(R.color.bd));

            }
        });

        Button ans8 = (Button) findViewById(R.id.correct8);
        Button answ8 = (Button) findViewById(R.id.wrong8);

        ans8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;;
                ans8.setEnabled(false);
                answ8.setEnabled(false);
                que8.setBackgroundColor(Color.parseColor("#50008000"));
                ans8.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                cScore.setText("Current score: "+String.valueOf(temp));
            }
        });

        answ8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans8.setEnabled(false);
                answ8.setEnabled(false);
                que8.setBackgroundColor(Color.parseColor("#50FF0000"));
                answ8.setBackgroundColor(getResources().getColor(R.color.red));
                //ans1.setBackgroundColor(getResources().getColor(R.color.bd));

            }
        });

        Button ans9 = (Button) findViewById(R.id.correct9);
        Button answ9 = (Button) findViewById(R.id.wrong9);
        ImageView q9 = (ImageView) findViewById(R.id.Q9);
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fhusband_denoised.MP3?alt=media&token=06ca5a8b-3e0c-47a0-86f8-3ba8f9de8b57");
            }
        });
        ans9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                //score.setText(String.valueOf(temp));
                ans9.setEnabled(false);
                answ9.setEnabled(false);
                cScore.setText("Current score: " + String.valueOf(temp));
                que9.setBackgroundColor(Color.parseColor("#50008000"));
                ans9.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        answ9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans9.setEnabled(false);
                answ9.setEnabled(false);
                que9.setBackgroundColor(Color.parseColor("#50FF0000"));
                answ9.setBackgroundColor(getResources().getColor(R.color.red));
                //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        Button ans10 = (Button) findViewById(R.id.correct10);
        Button answ10 = (Button) findViewById(R.id.wrong10);
        ImageView q10 = (ImageView) findViewById(R.id.Q10);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fgrapes.png?alt=media&token=eadf902c-cdde-4f7e-8e49-f2f188603dcc")
                .placeholder(R.drawable.blankblue)
                .into(q10);

        ans10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 1;
                //score.setText(String.valueOf(temp));
                ans10.setEnabled(false);
                answ10.setEnabled(false);
                cScore.setText("Current score: " + String.valueOf(temp));
                que10.setBackgroundColor(Color.parseColor("#50008000"));
                ans10.setBackgroundColor(getResources().getColor(R.color.green));
                //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
            }
        });

        answ10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 0;
                ans10.setEnabled(false);
                answ10.setEnabled(false);
                que10.setBackgroundColor(Color.parseColor("#50FF0000"));
                answ10.setBackgroundColor(getResources().getColor(R.color.red));
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
                String value = String.valueOf(temp);
                // Push creates a unique id in database
                demoRef.setValue(value);
                Calendar calendar = Calendar.getInstance();
                //String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM YYYY  HH:MM");
                String currentDate = simpleDateFormat.format(calendar.getTime());
                String PF;

                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                String x = currentUser.getEmail();

                if (temp >= 4){
                    PF = "PASS";
                }else{
                    PF = "FAILED";
                }

                /*
                pass/failed
                score
                date/time
                */
                HashMap<String,Object> map = new HashMap<>();

                map.put("Time",currentDate.toString());
                map.put("Score",temp);
                map.put("Status",PF.toString());
                map.put("User",x.toString());

                FirebaseDatabase.getInstance().getReference().child("Test").push()
                        .setValue(map)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull @NotNull Task<Void> task) {
                                Toast.makeText(getApplicationContext(), "Test Submitted Successfully", Toast.LENGTH_LONG).show();
                                Log.i("Pass","onComplete");
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull @NotNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Test submission Failed", Toast.LENGTH_LONG).show();
                        Log.i("Failed","onCompleteFailed");
                    }
                });


                dialog = new Dialog(Test.this);
                dialog.setContentView(R.layout.test_popup);
                dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.delete_background));
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(true);
                TextView ok = dialog.findViewById(R.id.ok_popup);
                TextView gr = dialog.findViewById(R.id.greeting);
                TextView scr = dialog.findViewById(R.id.scorepopup);
                TextView datee = dialog.findViewById(R.id.popupdate);

                CardView bkcr = dialog.findViewById(R.id.testpopupcolor);
                ImageView popupImage = dialog.findViewById(R.id.popupImage);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Intent a = new Intent(Test.this, MainActivity.class);
                        a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(a);
                        finish();
                    }
                });

                if (temp < 4){
                    popupImage.setImageResource(R.drawable.popupwrong);
                    bkcr.setCardBackgroundColor(Color.parseColor("#D10000"));
                    gr.setText("Oops!!! \n You Failed \n Try again");
                }
                else {
                    popupImage.setImageResource(R.drawable.popupright);
                    bkcr.setCardBackgroundColor(Color.parseColor("#008000"));
                    gr.setText("Congratulations 🎉 \n You Pass");
                }
                scr.setText("Your Score : " + temp);
                datee.setText(currentDate);

                dialog.show();
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
    @Override
    public void onBackPressed(){

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