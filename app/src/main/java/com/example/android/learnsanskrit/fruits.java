package com.example.android.learnsanskrit;


import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.bumptech.glide.Glide;

import java.io.IOException;

public class fruits extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        //Prevent User from Taking screenshots or recording screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

        //Add image from database
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


        //add audio from database
        ImageButton aCoconut = findViewById(R.id.aCoconut);
        ImageButton aOrange = findViewById(R.id.aOrange);
        ImageButton aGrape = findViewById(R.id.aGrape);
        ImageButton aApple = findViewById(R.id.aApple);
        ImageButton aCherry = findViewById(R.id.aCherry);
        ImageButton aBanana = findViewById(R.id.aBanana);
        ImageButton aPineapple = findViewById(R.id.aPineapple);
        ImageButton aMango = findViewById(R.id.aMango);
        ImageButton aPomegranate = findViewById(R.id.aPomegranate);
        ImageButton aJackfruit = findViewById(R.id.aJackfruit);
        ImageButton aDates = findViewById(R.id.aDates);
        ImageButton aLemon = findViewById(R.id.aLemon);
        ImageButton aGuava = findViewById(R.id.aGuava);
        ImageButton aStrawberry = findViewById(R.id.aStrawberry);
        ImageButton aFig = findViewById(R.id.aFig);

        aCoconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fcoconut_denoised.MP3?alt=media&token=d73a541b-7d95-4d37-99ec-26ee01cfd442");
            }
        });

        aOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Forange_denoised.MP3?alt=media&token=27a12b75-80bf-41c7-b57f-2b5ec97fabf2");
            }
        });

        aGrape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fgrapes_denoised.MP3?alt=media&token=8cd7402c-ae95-42b0-ab92-3482fdacb03a");
            }
        });

        aApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fapple_denoised.MP3?alt=media&token=42b37a27-26ab-4c74-ba24-46a806a8ee71");
            }
        });

        aCherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fapple_denoised.MP3?alt=media&token=42b37a27-26ab-4c74-ba24-46a806a8ee71");
            }
        });

        aBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fbanana_denoised.MP3?alt=media&token=4776cbe0-f592-4742-a001-f825dd2eb6d5");
            }
        });

        aPineapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fpineapple_denoised.MP3?alt=media&token=33ebcfd3-9b70-4a22-a3fc-6258f022939e");
            }
        });

        aMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fmango_denoised.MP3?alt=media&token=ae9b264a-142f-483a-87d9-1ce5124d5ed6");
            }
        });

        aPomegranate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fpromegrante_denoised.MP3?alt=media&token=b0f86ada-52ed-4e2b-9691-6161c00e34bd");
            }
        });

        aJackfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fjackfruit_denoised.MP3?alt=media&token=793de005-6da0-43cb-8e7b-112b0087c0a1");
            }
        });

        aDates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fdates_denoised.MP3?alt=media&token=83d80f88-b259-4268-9c39-731635625d7f");
            }
        });

        aLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Flemon_denoised.MP3?alt=media&token=403b40ba-0563-4c26-b7bc-8efbe363d4df");
            }
        });

        aGuava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fguava_denoised.MP3?alt=media&token=ec40ae07-86f4-4435-b31e-dba3aaee0dfb");
            }
        });

        aStrawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Fstrawberry_denoised.MP3?alt=media&token=0fdbb9df-9421-4833-ad83-386ab81737ee");
            }
        });

        aFig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Fruits%2FAudio%2Ffig_denoised_1.MP3?alt=media&token=fc1a5e66-dd02-4a49-a08e-1bc6e6cd7231");
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