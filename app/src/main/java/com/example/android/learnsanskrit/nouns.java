package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
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

public class nouns extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns);

        //Prevent User from Taking screenshots or recording screen
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        ImageView noun = (ImageView) findViewById(R.id.backnouns);
        noun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView water, moon, sun, tree, stone, house, cloths, wind, self, book, grass, school, god, world, shoes, road, honey, forest, river;
        water = findViewById(R.id.water);
        moon = findViewById(R.id.moon);
        sun = findViewById(R.id.sun);
        tree = findViewById(R.id.tree);
        stone = findViewById(R.id.stone);
        house = findViewById(R.id.house);
        cloths = findViewById(R.id.cloths);
        wind = findViewById(R.id.wind);
        self = findViewById(R.id.self);
        book = findViewById(R.id.book);
        grass = findViewById(R.id.grass);
        school = findViewById(R.id.school);
        god = findViewById(R.id.god);
        world = findViewById(R.id.world);
        shoes = findViewById(R.id.shoes);
        road = findViewById(R.id.road);
        honey = findViewById(R.id.honey);
        forest = findViewById(R.id.forest);
        river = findViewById(R.id.river);

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fwater_denoised.MP3?alt=media&token=8c5b1f40-12dd-4759-895b-57dddfd4bf21");
            }
        });
        moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fmoon_denoised.MP3?alt=media&token=421da591-c28b-4dc0-9faa-0db59b4785c5");
            }
        });
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fsun_denoised.MP3?alt=media&token=1f762bb9-06c0-4d59-859f-9681a4590246");
            }
        });
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Ftree_denoised.MP3?alt=media&token=a3782aed-9f26-45bb-bccb-edd741476ef9");
            }
        });
        stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("");
            }
        });
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fhouse_denoised.MP3?alt=media&token=6996afd6-8bac-4672-87aa-12a263623b6a");
            }
        });
        cloths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fcloths_denoised.MP3?alt=media&token=e6350331-164c-454c-b85e-d16ffe494bc3");
            }
        });
        wind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fwind_denoised.MP3?alt=media&token=7d6719a1-2808-49cd-ae90-3ab74cc380de");
            }
        });
        self.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fself_denoised.MP3?alt=media&token=0622fcbf-f3b9-43ab-beda-506853e1ac45");
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fbook_denoised.MP3?alt=media&token=70459de0-c9b6-4d78-84bc-fba405083d05");
            }
        });
        grass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fgrass_denoised.MP3?alt=media&token=63edc131-8c30-4397-932f-7633d4d41146");
            }
        });
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fschool_denoised.MP3?alt=media&token=9c8fd9cc-4d78-4d5f-95de-052b7a610140");
            }
        });
        god.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fgod_denoised.MP3?alt=media&token=138b8ab9-7faf-47c4-9903-a43ce8557caf");
            }
        });
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fworld_denoised.MP3?alt=media&token=6931863b-d6e9-4545-a604-c8503290a73b");
            }
        });
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("");
            }
        });
        road.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Froad_denoised.MP3?alt=media&token=1ad17b96-f361-4527-b98d-315b0d7c08ef");
            }
        });
        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fhoney_denoised.MP3?alt=media&token=2920ce61-e345-42fe-adc0-eb7505dfb894");
            }
        });
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Fforest_denoised.MP3?alt=media&token=181a91e1-e250-4cfe-8d1f-7d3b9e033357");
            }
        });
        river.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Words%2FNouns%2Friver_denoised.MP3?alt=media&token=5ae8a939-5017-4ba0-8be8-3a584c773ccd");
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