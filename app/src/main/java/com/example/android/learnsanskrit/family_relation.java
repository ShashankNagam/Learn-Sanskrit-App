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

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class family_relation extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_relation);

        //Prevent User from Taking screenshots or recording screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        ImageView backff = (ImageView) findViewById(R.id.backff);
        backff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(family_relation.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageButton mother, father, son, daughter, mgp, pgp, mgm, pgm, husband, wife, brother, sister, gts, gdts, gtd, gdtd;
        mother = findViewById(R.id.amother);
        father = findViewById(R.id.afather);
        son = findViewById(R.id.ason);
        daughter = findViewById(R.id.adaughter);
        mgp = findViewById(R.id.aa);
        pgp = findViewById(R.id.aaa);
        mgm = findViewById(R.id.aaaa);
        pgm = findViewById(R.id.aaaaa);
        husband = findViewById(R.id.aaaaaa);
        wife = findViewById(R.id.aaaaaaa);
        brother = findViewById(R.id.aaaaaaaa);
        sister = findViewById(R.id.aaaaaaaaa);
        gts = findViewById(R.id.aaaaaaaaaa);
        gdts = findViewById(R.id.aaaaaaaaaaa);
        gtd = findViewById(R.id.aaaaaaaaaaaa);
        gdtd = findViewById(R.id.aaaaaaaaaaaaa);

        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fmother_denoised.MP3?alt=media&token=64e6207f-06cf-430d-b352-42a9eab97c08");
            }
        });

        father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fmother_denoised.MP3?alt=media&token=64e6207f-06cf-430d-b352-42a9eab97c08");
            }
        });

        son.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fmother_denoised.MP3?alt=media&token=64e6207f-06cf-430d-b352-42a9eab97c08");
            }
        });

        daughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fdaughter_denoised.MP3?alt=media&token=eb0cba21-02a5-48f5-b551-4475ac9fd221");
            }
        });

        mgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fmaternalgrandpa_denoised.MP3?alt=media&token=999df313-2cf0-4551-97e8-3f90a181bb55");
            }
        });

        pgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fpaternalgrandpa_denoised.MP3?alt=media&token=139affb1-3ae7-4521-bab2-e47aca9d7356");
            }
        });

        mgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fmaternalgrandma_denoised.MP3?alt=media&token=8a68a57f-f03f-42b0-9950-9ea916b2f77b");
            }
        });

        pgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fpaternalgrandma_denoised.MP3?alt=media&token=ae18f604-f314-46de-9948-56321d7ddf86");
            }
        });

        husband.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fhusband_denoised.MP3?alt=media&token=06ca5a8b-3e0c-47a0-86f8-3ba8f9de8b57");
            }
        });

        wife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fwife_denoised.MP3?alt=media&token=33497c42-519f-4cbb-be28-48da128da751");
            }
        });

        brother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fbrother_denoised.MP3?alt=media&token=f7394dc6-e2d8-4398-8721-483eb7b66a3d");
            }
        });

        sister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fsister_denoised.MP3?alt=media&token=4c5329ca-64a1-470a-9129-38ca74238fac");
            }
        });

        gts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fgrandson%20to%20son_denoised.MP3?alt=media&token=180abc3f-6e16-41d6-996c-dd1a3bddf47e");
            }
        });

        gdts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fgranddaughter%20to%20son_denoised.MP3?alt=media&token=51fea5fe-9bca-4b91-b95e-5e0276996f8f");
            }
        });

        gtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fgrandson%20to%20daughter_denoised.MP3?alt=media&token=6879ec31-b3c4-4b39-9f69-108cd6f7f007");
            }
        });

        gdtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Family%20Relations%2Fgranddaughter%20to%20daughter_denoised.MP3?alt=media&token=ec64760a-0aa4-427d-835c-6adef1a80874");
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