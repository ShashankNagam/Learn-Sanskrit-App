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

public class animals extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

        ImageView backanimals = (ImageView) findViewById(R.id.backanimals);

        backanimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView cow, horse, lion, tiger, goat, dog, cat, jackal, leopard, wolf, deer, elephant, pig, buffalo, bull, camel, bear;

        cow = (ImageView)findViewById(R.id.cow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fcow.png?alt=media&token=225a871a-9079-402f-baaf-a14683f69f46")
                .placeholder(R.drawable.blankblue)
                .into(cow);

        horse = (ImageView)findViewById(R.id.horse);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fhorse.png?alt=media&token=8d828c35-b921-4883-b354-92b745b122cb")
                .placeholder(R.drawable.blankblue)
                .into(horse);

        lion = (ImageView)findViewById(R.id.lion);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Flion.png?alt=media&token=476e4836-503a-4498-8dea-7d118b98ed05")
                .placeholder(R.drawable.blankblue)
                .into(lion);

        tiger = (ImageView)findViewById(R.id.tiger);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Ftiger.png?alt=media&token=08f58d21-d88d-4ed3-ba05-c06d8d460192")
                .placeholder(R.drawable.blankblue)
                .into(tiger);

        goat = (ImageView)findViewById(R.id.goat);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fgoat.png?alt=media&token=2a43d154-e772-4810-9463-7d1c370fbfae")
                .placeholder(R.drawable.blankblue)
                .into(goat);

        dog = (ImageView)findViewById(R.id.dog);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fdog.png?alt=media&token=328604cc-b7f2-4558-ba3e-d83c59aad10f")
                .placeholder(R.drawable.blankblue)
                .into(dog);

        cat = (ImageView)findViewById(R.id.cat);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fcat.png?alt=media&token=7197b2f1-c958-421b-b801-e0018e9219eb")
                .placeholder(R.drawable.blankblue)
                .into(cat);

        jackal = (ImageView)findViewById(R.id.jackal);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fjackal.png?alt=media&token=62281b74-fc9a-4aec-b63e-95a7ed38c197")
                .placeholder(R.drawable.blankblue)
                .into(jackal);

        leopard = (ImageView)findViewById(R.id.leopard);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fleopard.png?alt=media&token=d2282da0-c8ab-4600-93fd-30db27d56a22")
                .placeholder(R.drawable.blankblue)
                .into(leopard);

        wolf = (ImageView)findViewById(R.id.wolf);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fwolf.png?alt=media&token=c2e17249-af35-490e-8448-b85934b6c09f")
                .placeholder(R.drawable.blankblue)
                .into(wolf);

        deer = (ImageView)findViewById(R.id.deer);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fdeer.png?alt=media&token=7e465aee-8a2e-4ebc-844f-761e5cdef43e")
                .placeholder(R.drawable.blankblue)
                .into(deer);

        elephant = (ImageView)findViewById(R.id.elephant);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Felephant.png?alt=media&token=d44a49a5-e522-4a15-97f0-5028ae845f1f")
                .placeholder(R.drawable.blankblue)
                .into(elephant);

        pig = (ImageView)findViewById(R.id.pig);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fpig.png?alt=media&token=7657d861-61a3-40ac-b243-0789ea9efb47")
                .placeholder(R.drawable.blankblue)
                .into(pig);

        buffalo = (ImageView)findViewById(R.id.buffalo);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fbuffalo.png?alt=media&token=319c8142-0223-441a-a86e-2a348d04264f")
                .placeholder(R.drawable.blankblue)
                .into(buffalo);

        bull = (ImageView)findViewById(R.id.bull);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fbull.png?alt=media&token=1a5b2342-8b7c-4e21-b971-87b945bb74a4")
                .placeholder(R.drawable.blankblue)
                .into(bull);

        camel = (ImageView)findViewById(R.id.camel);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fcamel.png?alt=media&token=3f6febe1-1715-4809-b7aa-04c36798d8ae")
                .placeholder(R.drawable.blankblue)
                .into(camel);

        bear = (ImageView)findViewById(R.id.bear);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FImages%2Fbear.png?alt=media&token=76bb9e16-8966-416b-bdc0-7bed37887da3")
                .placeholder(R.drawable.blankblue)
                .into(bear);

        ImageButton aCow = findViewById(R.id.aCow);
        ImageButton aHorse = findViewById(R.id.aHorse);
        ImageButton aLion = findViewById(R.id.aLion);
        ImageButton aTiger = findViewById(R.id.aTiger);
        ImageButton aGoat = findViewById(R.id.aGoat);
        ImageButton aDog = findViewById(R.id.aDog);
        ImageButton aCat = findViewById(R.id.aCat);
        ImageButton aJackal = findViewById(R.id.aJackal);
        ImageButton aLeopard = findViewById(R.id.aLeopard);
        ImageButton aWolf = findViewById(R.id.aWolf);
        ImageButton aDeer = findViewById(R.id.aDeer);
        ImageButton aElephant = findViewById(R.id.aElephant);
        ImageButton aPig = findViewById(R.id.aPig);
        ImageButton aBuffalo = findViewById(R.id.aBuffalo);
        ImageButton aBull = findViewById(R.id.aBull);
        ImageButton aCamel = findViewById(R.id.aCamel);
        ImageButton aBear = findViewById(R.id.aBear);

        aCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fcow_denoised-incre.mp3?alt=media&token=2edc9681-8336-4d60-9e18-7aa268ec8413");
            }
        });

        aHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fhorse_denoised-incre.mp3?alt=media&token=f78d11fb-303b-4bf9-8801-f3ce11f6e1cb");
            }
        });

        aLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Flion_denoised-incre.mp3?alt=media&token=86cbbf02-a949-4ff1-9fc6-d92bbba652be");
            }
        });

        aTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Ftiger_denoised-incre.mp3?alt=media&token=55fae740-fbcd-4978-9cac-4e92477ee1a0");
            }
        });

        aGoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fgoat_denoised-incre.mp3?alt=media&token=164f2b9a-f95c-4766-ba6e-b58550baa209");
            }
        });

        aDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fdog_denoised-incre.mp3?alt=media&token=b7c0477c-a22e-40e4-ab1b-d156d172e8b6");
            }
        });

        aCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fcat_denoised-incre.mp3?alt=media&token=52dea491-2cfe-444d-ab1c-0945fd3b043e");
            }
        });

        aJackal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fjackal_denoised-incre.mp3?alt=media&token=f50c2e46-0a7a-4d1c-a338-6d64b7e125c4");
            }
        });

        aLeopard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fleopard_denoised-incre.mp3?alt=media&token=858b7767-a335-4137-b061-65f9a9e50799");
            }
        });

        aWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fwolf_denoised-incre.mp3?alt=media&token=6059799c-ea99-4129-be09-5f42e2e47870");
            }
        });

        aDeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fdeer_denoised-incre.mp3?alt=media&token=6985fe17-3dff-4706-be9a-4a7df0f78511");
            }
        });

        aElephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Felephant_denoised-incre.mp3?alt=media&token=3c8b4d4e-bdd7-4d39-bddf-83365925f492");
            }
        });

        aPig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fpig_denoised-incre.mp3?alt=media&token=5b914f8a-baca-4c19-8ed2-831c8e3d2311");
            }
        });

        aBuffalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fbuffalo_denoised-incre.mp3?alt=media&token=8295e85c-d887-4c5f-9635-23ffffb7448a");
            }
        });

        aBull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fbull_denoised-incre.mp3?alt=media&token=61f7951b-89ae-4b81-b0d4-d2c51b18241d");
            }
        });

        aCamel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fcamel_denoised-incre.mp3?alt=media&token=bef17c94-3884-4a52-9b0a-efc90dae92f3");
            }
        });

        aBear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2FAudio%2Fbear_denoised-incre.mp3?alt=media&token=be88ea88-5a1e-418b-8493-d9b40a9bd50b");

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