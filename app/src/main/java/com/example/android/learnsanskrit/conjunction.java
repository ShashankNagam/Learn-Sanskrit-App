package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class conjunction extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conjunction);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);

        ImageView con = (ImageView) findViewById(R.id.backcon);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        ImageView and, or, not, but, because, before, after, when, whenever, until, once;

        and = findViewById(R.id.aand);
        or = findViewById(R.id.aor);
        not = findViewById(R.id.anot);
        but = findViewById(R.id.abut);
        because = findViewById(R.id.acoz);
        before = findViewById(R.id.abefore);
        after = findViewById(R.id.aafter);
        when = findViewById(R.id.awhen);
        whenever = findViewById(R.id.awhenever);
        until = findViewById(R.id.auntil);
        once = findViewById(R.id.aonce);

        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_and_denoised.MP3?alt=media&token=16317a2a-619c-4734-ba6c-472209557b06");
            }
        });

        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_or_denoised.MP3?alt=media&token=87c6ecdb-fdf8-4d03-8f39-472c0d59dd2c");
            }
        });

        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_not_denoised.MP3?alt=media&token=d3158622-083c-4177-9cde-ee80a2baaf27");
            }
        });

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_but_denoised.MP3?alt=media&token=b80eadec-9bc6-4927-a703-de161fddb211");

            }
        });

        because.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_beacuse_denoised.MP3?alt=media&token=240c0950-4a9c-4ee7-b700-3a0ab7355653");
            }
        });

        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_before_denoised.MP3?alt=media&token=71caeb76-1f9b-4943-a3a4-4e6196e9cae4");
            }
        });

        after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_after_denoised.MP3?alt=media&token=db4e16d8-9fec-4836-b4f1-0fe8f5ea682a");
            }
        });

        when.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_when_denoised.MP3?alt=media&token=b3b7c3f1-37d7-455f-a75e-83e5d21fedab");
            }
        });

        whenever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_whenever_denoised.MP3?alt=media&token=727de5ec-f034-41c9-bf0e-84e1b79f937a");
            }
        });

        until.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_until_denoised.MP3?alt=media&token=2c65ab1b-0928-4def-a165-675bd2d94646");

            }
        });

        once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FConjunctions%2Fcon_once_denoised.MP3?alt=media&token=1c11b9b7-4350-4511-b79b-9a2959c4f2f4");
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