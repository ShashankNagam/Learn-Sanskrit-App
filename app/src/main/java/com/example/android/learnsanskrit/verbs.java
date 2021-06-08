package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class verbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs);


        ImageView verb = (ImageView) findViewById(R.id.backverbs);
        verb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbs.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageView bgn = (ImageView)findViewById(R.id.verbbg);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/bgnoun.png?alt=media&token=7c0b8be6-50cd-4110-b198-360c508c1ec7")
                .into(bgn);
    }
}