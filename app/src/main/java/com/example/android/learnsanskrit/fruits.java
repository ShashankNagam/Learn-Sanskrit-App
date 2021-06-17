package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class fruits extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        ImageView backfruit = (ImageView) findViewById(R.id.backfruit);
        backfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView coconut, grape, apple, cherry, banana, pineapple, mango, pomegranate, jackfruit, orange, dates, lemon, guava, strawberry, fig;

        coconut = (ImageView)findViewById(R.id.coconut);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fcoconut.png?alt=media&token=7c03fd2a-d068-470f-b91f-e00e1fe29076")
                .placeholder(R.drawable.blankblue)
                .into(coconut);

        grape = (ImageView)findViewById(R.id.grape);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fgrapes.png?alt=media&token=eadf902c-cdde-4f7e-8e49-f2f188603dcc")
                .placeholder(R.drawable.blankblue)
                .into(grape);

        apple = (ImageView)findViewById(R.id.apple);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fapple.png?alt=media&token=53a95320-7275-498d-86e5-dce1a1af6e4e")
                .placeholder(R.drawable.blankblue)
                .into(apple);

        cherry = (ImageView)findViewById(R.id.cherry);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fcherry.png?alt=media&token=1102ba82-82ca-40d5-a0ce-07005d0ac02a")
                .placeholder(R.drawable.blankblue)
                .into(cherry);

        banana = (ImageView)findViewById(R.id.banana);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fbanana.png?alt=media&token=2875c39f-26d7-4636-a4fb-8dfb2279cf6e")
                .placeholder(R.drawable.blankblue)
                .into(banana);

        pineapple = (ImageView)findViewById(R.id.pineapple);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fpineapple.png?alt=media&token=e18e17f8-c61c-4174-9774-d67957310e3e")
                .placeholder(R.drawable.blankblue)
                .into(pineapple);

        mango = (ImageView)findViewById(R.id.mango);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fmango.png?alt=media&token=d747ad79-4509-4efd-aaf4-28b5ae5cc6a1")
                .placeholder(R.drawable.blankblue)
                .into(mango);

        pomegranate = (ImageView)findViewById(R.id.pomegranate);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fpomegranate.png?alt=media&token=05eae9be-e959-44be-8e5c-0734c44cc80d")
                .placeholder(R.drawable.blankblue)
                .into(pomegranate);

        jackfruit = (ImageView)findViewById(R.id.jacjfruit);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fjackfruit.png?alt=media&token=c1f3d28e-2cec-47af-9632-d3a4098917cf")
                .placeholder(R.drawable.blankblue)
                .into(jackfruit);

        orange  = (ImageView)findViewById(R.id.orange);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fjackfruit.png?alt=media&token=c1f3d28e-2cec-47af-9632-d3a4098917cf")
                .placeholder(R.drawable.blankblue)
                .into(orange);

        dates = (ImageView)findViewById(R.id.dates);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fdates.png?alt=media&token=37480955-5e58-4e65-8055-bdef4639ec2e")
                .placeholder(R.drawable.blankblue)
                .into(dates);

        lemon = (ImageView)findViewById(R.id.lemon);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Flemon.png?alt=media&token=74e1200b-d0e0-4829-925e-3ef7b272b307")
                .placeholder(R.drawable.blankblue)
                .into(lemon);

        guava = (ImageView)findViewById(R.id.guava);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fguava.png?alt=media&token=3fb12c11-ef56-41d0-a722-af6c7dd2a6dd")
                .placeholder(R.drawable.blankblue)
                .into(guava);

        strawberry = (ImageView)findViewById(R.id.strawberry);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Fstrawberry.png?alt=media&token=5da1c946-58f5-405c-a3e9-82a8d1f50bad")
                .placeholder(R.drawable.blankblue)
                .into(strawberry);

        fig = (ImageView)findViewById(R.id.fig);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FImages%2Ffig.png?alt=media&token=288c17f1-6cc8-4a4e-88b8-8c26f9fd1ab6")
                .placeholder(R.drawable.blankblue)
                .into(fig);

    }
}