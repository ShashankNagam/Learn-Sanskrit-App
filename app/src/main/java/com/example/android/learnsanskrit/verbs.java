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
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class verbs extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs);
        //Prevent User from Taking screenshots or recording screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

        ImageView verb = (ImageView) findViewById(R.id.backverbs);
        verb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        ImageView read, write, speak, go, come, fruit, fall, drink, eat, stand, sit, be, wander, sing, graze, move, conquer, chant, wither;

        read = findViewById(R.id.aread);
        write = findViewById(R.id.awrite);
        speak = findViewById(R.id.aspeak);
        go = findViewById(R.id.ago);
        come = findViewById(R.id.acome);
        fruit = findViewById(R.id.afruit);
        fall = findViewById(R.id.afall);
        drink = findViewById(R.id.adrink);
        eat = findViewById(R.id.aeat);
        stand = findViewById(R.id.astand);
        sit = findViewById(R.id.asit);
        be = findViewById(R.id.abe);
        wander = findViewById(R.id.awander);
        sing = findViewById(R.id.asing);
        graze = findViewById(R.id.agraze);
        move = findViewById(R.id.amove);
        conquer = findViewById(R.id.aconquer);
        chant = findViewById(R.id.achant);
        wither = findViewById(R.id.awither);

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftoread_denoised.MP3?alt=media&token=703f6a1c-e19b-4b81-85d2-639dc0c81f48");
            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftowrite_denoised.MP3?alt=media&token=1f7d9367-1857-4882-a8f7-57ae258a808b");
            }
        });

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftospeak_denoised.MP3?alt=media&token=f180a5cb-84b9-4e46-9e6c-518da040059b");
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftogo_denoised.MP3?alt=media&token=f0e3ae9d-9e3d-404b-94d8-9661f75614d4");
            }
        });

        come.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftocome_denoised.MP3?alt=media&token=d609c59d-cca7-4048-8b77-406a497e1f50");
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftofruit_denoised.MP3?alt=media&token=ced41f8c-2853-4d3a-a2e9-68e83dcbc22b");
            }
        });

        fall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftofall_denoised.MP3?alt=media&token=c56e6bc5-11ac-4e92-b643-adaf4bf3e198");
            }
        });

        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftodrink_denoised.MP3?alt=media&token=1248cd70-4354-40a0-92c4-3765bb2dc18b");
            }
        });

        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftoeat_denoised.MP3?alt=media&token=71a61a12-d5b6-45fe-a0ad-8e2a8e506636");
            }
        });

        stand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftostand_denoised.MP3?alt=media&token=ac9dbb64-8cc7-4ca0-aaf5-694fd2b0964a");
            }
        });

        sit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftosit_denoised.MP3?alt=media&token=28df9183-e346-4e00-9b63-fd7f9332847d");
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Fbe_denoised.MP3?alt=media&token=f090ea9c-b810-4969-a9e4-3204ac58295b");
            }
        });

        wander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Fto%20wander_denoised.MP3?alt=media&token=11cb380f-d512-4d6c-bae3-7e2d17237c03");
            }
        });

        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftosing_denoised.MP3?alt=media&token=77b94c67-f0a9-42c5-ad75-73afd9e988ff");
            }
        });

        graze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftograze_denoised.MP3?alt=media&token=b94aa46d-018b-4798-b20e-69657a90c758");
            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftomove_denoised.MP3?alt=media&token=7c4247d8-95f7-4f66-8aea-a9912f45fb4d");
            }
        });

        conquer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftoconqure_denoised.MP3?alt=media&token=b22d6245-999f-4524-8353-498690d4bd02");
            }
        });

        chant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftochant_denoised.MP3?alt=media&token=8387301e-009b-4d06-b886-e05f5040618b");
            }
        });

        wither.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FVerbs%2Ftowither_denoised.MP3?alt=media&token=96200108-0426-4f19-9212-31de7222644d");
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