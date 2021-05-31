package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class animals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        ImageView backanimals = (ImageView) findViewById(R.id.backanimals);

        backanimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView cow, horse, lion, tiger, goat, dog, cat;

        cow = (ImageView)findViewById(R.id.cow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2Fcow2.png?alt=media&token=0aac41a9-4a1f-49fa-9de8-11881e5f487a")
                .into(cow);

        horse = (ImageView)findViewById(R.id.horse);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2Fhorse2.png?alt=media&token=a77d9a59-7d7e-48ba-b228-d35ba9928aac")
                .into(horse);

        lion = (ImageView)findViewById(R.id.lion);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2Flion.png?alt=media&token=4a446596-066c-40a3-8bcb-11bdad53a194")
                .into(lion);

        tiger = (ImageView)findViewById(R.id.tiger);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2Flion.png?alt=media&token=4a446596-066c-40a3-8bcb-11bdad53a194")
                .into(tiger);

        goat = (ImageView)findViewById(R.id.goat);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Animals%2Fgoat.png?alt=media&token=0a3372a1-0c67-459e-b712-d332870e69b5")
                .into(goat);

        

    }
}