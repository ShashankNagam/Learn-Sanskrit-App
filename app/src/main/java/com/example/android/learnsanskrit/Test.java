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
import android.util.TypedValue;
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
import java.util.Random;

public class Test extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;
    double temp;
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


        Random no = new Random();
        int randomnumber = no.nextInt(4-1+1)+1;
        int randomnumber2 = no.nextInt(4-1+1)+1;
        int randomnumber3 = no.nextInt(4-1+1)+1;
        int randomnumber4 = no.nextInt(4-1+1)+1;


        LinearLayout que1 = (LinearLayout) findViewById(R.id.que1);
        LinearLayout que2 = (LinearLayout) findViewById(R.id.que2);
        LinearLayout que3 = (LinearLayout) findViewById(R.id.que3);
        LinearLayout que4 = (LinearLayout) findViewById(R.id.que4);
        LinearLayout que5 = (LinearLayout) findViewById(R.id.que5);
        LinearLayout que6 = (LinearLayout) findViewById(R.id.que6);
        LinearLayout que7 = (LinearLayout) findViewById(R.id.que7);
        LinearLayout que8 = (LinearLayout) findViewById(R.id.que8);


        TextView cScore = (TextView) findViewById(R.id.cScore);




        Button ans1 = (Button) findViewById(R.id.correct1);
        Button answ1 = (Button) findViewById(R.id.wrong1);
        ImageView q1 = (ImageView) findViewById(R.id.Q1);


        // Questions for Q1

        switch (randomnumber)
        {
            case 1:
                q1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fwater_denoised.MP3?alt=media&token=8c5b1f40-12dd-4759-895b-57dddfd4bf21");
                    }
                });
                break;


            case 2:
                q1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fmoon_denoised.MP3?alt=media&token=421da591-c28b-4dc0-9faa-0db59b4785c5");
                    }
                });
                ans1.setText("वारि");
                answ1.setText("चन्द्रमस्");
                break;

            case 3:
                q1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fcloths_denoised.MP3?alt=media&token=e6350331-164c-454c-b85e-d16ffe494bc3");
                    }
                });
                ans1.setText("वस्त्र");
                break;
            case 4:
                q1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fgrass_denoised.MP3?alt=media&token=63edc131-8c30-4397-932f-7633d4d41146");
                    }
                });
                ans1.setText("वस्त्र");
                answ1.setText("तृणम्");
                break;

        }

        //Setting score and color for Q1

        if (randomnumber==2 || randomnumber==4)
        {
            ans1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;
                    //score.setText(String.valueOf(temp));
                    ans1.setEnabled(false);
                    answ1.setEnabled(false);
                    cScore.setText("Current score: " + String.valueOf(temp));
                    que1.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans1.setBackgroundColor(getResources().getColor(R.color.red));
                    //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                }
            });

            answ1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans1.setEnabled(false);
                    answ1.setEnabled(false);
                    que1.setBackgroundColor(Color.parseColor("#50008000"));
                    answ1.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }




        Button ans2 = (Button) findViewById(R.id.correct2);
        Button answ2 = (Button) findViewById(R.id.wrong2);
        ImageView q2 = (ImageView) findViewById(R.id.Q2);

        //Question for Q2

        switch (randomnumber2)
        {
            case 1:
                q2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftosit_denoised.MP3?alt=media&token=28df9183-e346-4e00-9b63-fd7f9332847d");
                    }
                });
                break;
            case 2:
                q2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftosing_denoised.MP3?alt=media&token=77b94c67-f0a9-42c5-ad75-73afd9e988ff");
                    }
                });
                ans2.setText("to sing");
                answ2.setText("to move");
                ans2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                answ2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                break;

            case 3:
                q2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftomove_denoised.MP3?alt=media&token=7c4247d8-95f7-4f66-8aea-a9912f45fb4d");
                    }
                });
                ans2.setText("to sing");
                answ2.setText("to move");
                ans2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                answ2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                break;

            case 4:
                q2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftowrite_denoised.MP3?alt=media&token=1f7d9367-1857-4882-a8f7-57ae258a808b");
                    }
                });
                ans2.setText("to write");
                answ2.setText("to move");
                ans2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                answ2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                break;
        }

        if (randomnumber2==3)
        {
            ans2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;
                    ans2.setEnabled(false);
                    answ2.setEnabled(false);
                    cScore.setText("Current score: " + String.valueOf(temp));
                    //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                    que2.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans2.setBackgroundColor(getResources().getColor(R.color.red));
                }
            });

            answ2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans2.setEnabled(false);
                    answ2.setEnabled(false);
                    que2.setBackgroundColor(Color.parseColor("#50008000"));
                    answ2.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }



        Button ans3 = (Button) findViewById(R.id.correct3);
        Button answ3 = (Button) findViewById(R.id.wrong3);
        TextView q3 = (TextView) findViewById(R.id.Q3);

        switch (randomnumber3)
        {
            case 1:
                break;
            case 2:
                q3.setText("Where are you from?");
                break;
            case 3:
                q3.setText("Good Morning");
                ans3.setText("सुप्रभातम्");
                answ3.setText("शुभरात्रिः");
                break;
            case 4:
                q3.setText("Good Night");
                ans3.setText("सुप्रभातम्");
                answ3.setText("शुभरात्रिः");
                break;
        }




        if (randomnumber3==2 || randomnumber3==4)
        {
            ans3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;
                    ans3.setEnabled(false);
                    answ3.setEnabled(false);
                    cScore.setText("Current score: " + String.valueOf(temp));
                    //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                    que3.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans3.setBackgroundColor(getResources().getColor(R.color.red));
                }
            });

            answ3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans3.setEnabled(false);
                    answ3.setEnabled(false);
                    que3.setBackgroundColor(Color.parseColor("#50008000"));
                    answ3.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }







        Button ans4 = (Button) findViewById(R.id.correct4);
        Button answ4 = (Button) findViewById(R.id.wrong4);
        TextView q4 = (TextView) findViewById(R.id.Q4);

        switch (randomnumber)
        {
            case 1:
                break;
            case 2:
                q4.setText("तस्य नाम राहुल।");
                ans4.setText("His name is Rahul");
                answ4.setText("Her name is Rahul");
                break;
            case 3:
                q4.setText("अहं विद्यालयम् गच्छामि।");
                ans4.setText("I am going to school.");
                answ4.setText("I am studying in school.");
                break;
            case 4:
                break;
        }

        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + 2.5;
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
                cScore.setText("Current score: "+String.valueOf(temp));
            }
        });

        Button ans5 = (Button) findViewById(R.id.correct5);
        Button answ5 = (Button) findViewById(R.id.wrong5);
        TextView q5_1 = (TextView) findViewById(R.id.Q5_1);
        TextView q5_2 = (TextView) findViewById(R.id.Q5_2);

        switch (randomnumber2)
        {
            case 1:
                q5_1.setText("Mother - माता");
                q5_2.setText("Father - पिता");
                break;
            case 2:
                q5_1.setText("Son - पुत्री");
                q5_2.setText("Daughter - पुत्र:");
                break;
            case 3:
                q5_1.setText("Husband - पति");
                q5_2.setText("Wife - पत्नी");
                break;
            case 4:
                q5_1.setText("Mother - माता");
                q5_2.setText("Father - पिता");
                break;
        }

        if (randomnumber2==2)
        {
            ans5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;
                    ans5.setEnabled(false);
                    answ5.setEnabled(false);
                    cScore.setText("Current score: " + String.valueOf(temp));
                    //answ2.setBackgroundColor(getResources().getColor(R.color.bd));
                    que5.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans5.setBackgroundColor(getResources().getColor(R.color.red));
                }
            });

            answ5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans5.setEnabled(false);
                    answ5.setEnabled(false);
                    que5.setBackgroundColor(Color.parseColor("#50008000"));
                    answ5.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans2.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }






        Button ans6 = (Button) findViewById(R.id.correct6);
        Button answ6 = (Button) findViewById(R.id.wrong6);
        ImageView q6 = (ImageView) findViewById(R.id.Q6);


        switch (randomnumber3)
        {
            case 1:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fpeacock.png?alt=media&token=1a7dd6ac-d0d5-4c9f-8b59-fd2b378964f2")
                        .placeholder(R.drawable.blankblue)
                        .into(q6);
                break;
            case 2:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fparrot.png?alt=media&token=95a6d401-97e6-420b-8bc4-83af49791498")
                        .placeholder(R.drawable.blankblue)
                        .into(q6);
                break;
            case 3:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Feagle.png?alt=media&token=d30b1f42-6abd-49fc-a246-5c7cf0a35b08")
                        .placeholder(R.drawable.blankblue)
                        .into(q6);
                ans6.setText("श्येनः");
                answ6.setText("जतुका");
                break;
            case 4:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fbat.png?alt=media&token=670ed4d7-7949-4684-ab90-780bf6517721")
                        .placeholder(R.drawable.blankblue)
                        .into(q6);
                ans6.setText("श्येनः");
                answ6.setText("जतुका");
                break;
        }

        if (randomnumber3==2 || randomnumber3==4)
        {
            ans6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;
                    ans6.setEnabled(false);
                    answ6.setEnabled(false);
                    cScore.setText("Current score: " + String.valueOf(temp));
                    que6.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans6.setBackgroundColor(getResources().getColor(R.color.red));
                    //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                }
            });

            answ6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans6.setEnabled(false);
                    answ6.setEnabled(false);
                    que6.setBackgroundColor(Color.parseColor("#50008000"));
                    answ6.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }




        Button ans7 = (Button) findViewById(R.id.correct7);
        Button answ7 = (Button) findViewById(R.id.wrong7);
        ImageView q7 = (ImageView) findViewById(R.id.Q7);


        switch (randomnumber)
        {
            case 1:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fhorse.png?alt=media&token=8d828c35-b921-4883-b354-92b745b122cb")
                        .placeholder(R.drawable.blankblue)
                        .into(q7);
                break;
            case 2:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fgoat.png?alt=media&token=2a43d154-e772-4810-9463-7d1c370fbfae")
                        .placeholder(R.drawable.blankblue)
                        .into(q7);
                break;
            case 3:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fwolf.png?alt=media&token=c2e17249-af35-490e-8448-b85934b6c09f")
                        .placeholder(R.drawable.blankblue)
                        .into(q7);
                ans7.setText("वृकः");
                answ7.setText("हरिणः");
                break;
            case 4:
                Glide.with(this)
                        .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fdeer.png?alt=media&token=7e465aee-8a2e-4ebc-844f-761e5cdef43e")
                        .placeholder(R.drawable.blankblue)
                        .into(q7);
                ans7.setText("वृकः");
                answ7.setText("हरिणः");
                break;
        }

        if (randomnumber==2 || randomnumber==4)
        {
            ans7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;;
                    ans7.setEnabled(false);
                    answ7.setEnabled(false);
                    que7.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans7.setBackgroundColor(getResources().getColor(R.color.red));
                    //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });

            answ7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans7.setEnabled(false);
                    answ7.setEnabled(false);
                    que7.setBackgroundColor(Color.parseColor("#50008000"));
                    answ7.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }

        Button ans8 = (Button) findViewById(R.id.correct8);
        Button answ8 = (Button) findViewById(R.id.wrong8);
        ImageView q8 = (ImageView) findViewById(R.id.Q8);

        switch (randomnumber4)
        {
            case 1:
                q8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Color%2Fpink_denoised.MP3?alt=media&token=aff4eed0-044c-4046-b60e-c726cffc596e");
                    }
                });
                ans8.setText("Pink");
                answ8.setText("Red");

                break;
            case 2:
                q8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Color%2Fred_denoised.MP3?alt=media&token=a14768b3-977f-4f98-a712-dda08d6172d9");
                    }
                });
                ans8.setText("Pink");
                answ8.setText("Red");
                break;
            case 3:
                q8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Color%2Fblack_denoised.MP3?alt=media&token=c5d598f2-ead2-4e3f-ac93-01eb438941a3");
                    }
                });
                ans8.setText("Purple");
                answ8.setText("Black");
                break;
            case 4:
                q8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Color%2Fpurple_denoised.MP3?alt=media&token=fa35ac38-2b80-4351-ba12-ec71293ae0f9");
                    }
                });
                ans8.setText("Purple");
                answ8.setText("Black");
                break;
        }

        if (randomnumber4==2 || randomnumber4==3)
        {
            ans8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 0;;
                    ans8.setEnabled(false);
                    answ8.setEnabled(false);
                    que8.setBackgroundColor(Color.parseColor("#50FF0000"));
                    ans8.setBackgroundColor(getResources().getColor(R.color.red));
                    //answ1.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });

            answ8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;
                    ans8.setEnabled(false);
                    answ8.setEnabled(false);
                    que8.setBackgroundColor(Color.parseColor("#50008000"));
                    answ8.setBackgroundColor(getResources().getColor(R.color.green));
                    //ans1.setBackgroundColor(getResources().getColor(R.color.bd));
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }
        else
        {
            ans8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    temp = temp + 2.5;;
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
                    cScore.setText("Current score: "+String.valueOf(temp));
                }
            });
        }



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
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-YYYY/HH:MM");
                String currentDate = simpleDateFormat.format(calendar.getTime());
                String PF;

                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                String x = currentUser.getEmail();

                if (temp >= 8){
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
                String z = String.valueOf(temp);
                String a = String.valueOf(currentDate);

                map.put("Time",a);
                map.put("Score",z);
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

                if (temp < 8){
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





        Button quit = (Button) findViewById(R.id.quit);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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