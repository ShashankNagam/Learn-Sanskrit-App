package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class vegetables extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        ImageView vege = (ImageView) findViewById(R.id.backvegetable);

        vege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView carrot, potato, brinjal, garlic, cabbage, onion, cauliflower, chilli, radish, spinach, bittergourd, ladyfinger;

        carrot = (ImageView)findViewById(R.id.carrot);

        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FCarrot.jpg?alt=media&token=76120a03-9be8-4f67-9487-a12652466b89")
                .placeholder(R.drawable.blankblue)
                .into(carrot);

        potato = (ImageView)findViewById(R.id.potato);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FPotato.jpg?alt=media&token=1b4255ba-f31e-40db-a152-3819aa6f6bc0")
                .placeholder(R.drawable.blankblue)
                .into(potato);

        brinjal = (ImageView)findViewById(R.id.brinjal);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FBrinjal.jpg?alt=media&token=4360d939-086d-4431-bb31-f4afd3623f7e")
                .placeholder(R.drawable.blankblue)
                .into(brinjal);

        garlic = (ImageView)findViewById(R.id.garlic);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FGarlic.jpg?alt=media&token=e629fa6a-b8e6-47f5-93d7-c6d6ae9f4598")
                .into(garlic);

        cabbage = (ImageView)findViewById(R.id.cabbage);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FCabbage.jpg?alt=media&token=cd88138d-e2d1-4f3a-9379-41bdd6588c6c")
                .placeholder(R.drawable.blankblue)
                .into(cabbage);

        onion = (ImageView)findViewById(R.id.onion);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FOnion.jpg?alt=media&token=a323a313-a2b7-495c-a05b-e36a65905f53")
                .placeholder(R.drawable.blankblue)
                .into(onion);

        cauliflower = (ImageView)findViewById(R.id.cauliflower);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FCauliflower.jpg?alt=media&token=838485b2-32ad-4c94-beb7-7fa7169f85c3")
                .placeholder(R.drawable.blankblue)
                .into(cauliflower);

        chilli = (ImageView)findViewById(R.id.chilli);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FChilli.jpg?alt=media&token=ca2d2f4d-23ad-46c6-8d9b-32e5fe690032")
                .placeholder(R.drawable.blankblue)
                .into(chilli);

        radish = (ImageView)findViewById(R.id.radish);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FRadish.jpg?alt=media&token=f7eb19a7-6545-485b-a2b2-09d1b2bb927d")
                .placeholder(R.drawable.blankblue)
                .into(radish);

        spinach = (ImageView)findViewById(R.id.spinach);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FSpinach.jpg?alt=media&token=ae88b8b8-6c14-4382-94ec-1cee8797e4be")
                .placeholder(R.drawable.blankblue)
                .into(spinach);

        bittergourd = (ImageView)findViewById(R.id.bittergourd);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FBittergroud.jpg?alt=media&token=261faf33-0b4c-44f4-80e3-daaac1aa2ba4")
                .placeholder(R.drawable.blankblue)
                .into(bittergourd);

        ladyfinger = (ImageView)findViewById(R.id.ladyfinger);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FLady%20Finger.jpg?alt=media&token=4bcbfc59-39ad-4127-ac71-a711110bd084")
                .placeholder(R.drawable.blankblue)
                .into(ladyfinger);

        ImageButton aCarrot = findViewById(R.id.aCarrot);
        ImageButton aPotato = findViewById(R.id.aPotato);
        ImageButton aBrinjal = findViewById(R.id.aBrinjal);
        ImageButton aGarlic = findViewById(R.id.aGarlic);
        ImageButton aCabbage = findViewById(R.id.aCabbage);
        ImageButton aOnion = findViewById(R.id.aOnion);
        ImageButton aCauliflower = findViewById(R.id.aCauliflower);
        ImageButton aChilli = findViewById(R.id.aChilli);
        ImageButton aRadish = findViewById(R.id.aRadish);
        ImageButton aSpinach = findViewById(R.id.aSpinach);
        ImageButton aBittergourd = findViewById(R.id.aBittergourd);
        ImageButton aLadyFinger = findViewById(R.id.aLadyFinger);

        aCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fcaroot_denoised-incre.mp3?alt=media&token=e88724e6-224d-4a66-a5fb-687125dadd10");
            }
        });

        aPotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fpotato_denoised-incre.mp3?alt=media&token=6846c15b-7752-4e0c-a9b2-10cfde0e0e32");
            }
        });

        aBrinjal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fbrinjal_denoised-incre.mp3?alt=media&token=95911b28-2f5b-4547-ac77-77f2507d2661");
            }
        });

        aGarlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fgarlic_denoised-incre.mp3?alt=media&token=61a68b27-cda9-41d9-9f9d-706a859409b3");
            }
        });

        aCabbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fcabbage_denoised-incre.mp3?alt=media&token=b909b9e3-f9cb-4b5c-af90-3f446fe0e8d1");
            }
        });

        aOnion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fonion_denoised-incre.mp3?alt=media&token=7181b159-9b36-411b-86a4-6ca12b1c6687");
            }
        });

        aCauliflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fcauliflower_denoised-incre.mp3?alt=media&token=41188725-de70-436c-904c-b165d1d04bf4");
            }
        });

        aChilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fchillis_denoised-incre.mp3?alt=media&token=f4649af3-a9c6-4904-8cfb-902cb91045c5");
            }
        });

        aRadish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fradish_denoised-incre.mp3?alt=media&token=1d276347-b4a8-4523-b835-6fc645e7eab5");
            }
        });

        aSpinach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fspinach_denoised-incre.mp3?alt=media&token=c4a46121-d4ea-4081-9efa-aa6a55794271");
            }
        });

        aBittergourd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fbitter%20gourd_denoised-incre.mp3?alt=media&token=c8f8cd6a-0aca-4dc2-bf38-af9031fe4001");
            }
        });

        aLadyFinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Vegetables%2FAudio%2Fladyfinger_denoised-incre.mp3?alt=media&token=e4383730-00c7-465b-aee4-d89e4ddc66a2");
            }
        });
    }

    private void playAudio(String audioUrl)
    {
        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
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
            Toast.makeText(getApplicationContext(), "Sign In to access audio", Toast.LENGTH_LONG).show();
        }
    }
}