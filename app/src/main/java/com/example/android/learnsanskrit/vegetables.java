package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class vegetables extends AppCompatActivity {

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



    }
}