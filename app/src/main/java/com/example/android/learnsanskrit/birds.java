package com.example.android.learnsanskrit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;

import java.io.IOException;

public class birds extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        ImageView back = (ImageView)findViewById(R.id.backbird);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView peacock, sparrow, parrot, eagle, crow, bat, falcon, stork, kite, cock, dove, swan, vulture, crane, kingfisher, owl,duck, hen;

        peacock = (ImageView) findViewById(R.id.peacock);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fpeacock.png?alt=media&token=1a7dd6ac-d0d5-4c9f-8b59-fd2b378964f2")
                .placeholder(R.drawable.blankblue)
                .into(peacock);

        sparrow = (ImageView) findViewById(R.id.sparrow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fsparrow.png?alt=media&token=ef0abbf6-7d70-4753-ac8c-8b8ef9d91116")
                .placeholder(R.drawable.blankblue)
                .into(sparrow);

        parrot = (ImageView) findViewById(R.id.parrot);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fparrot.png?alt=media&token=95a6d401-97e6-420b-8bc4-83af49791498")
                .placeholder(R.drawable.blankblue)
                .into(parrot);

        eagle = (ImageView) findViewById(R.id.eagle);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Feagle.png?alt=media&token=d30b1f42-6abd-49fc-a246-5c7cf0a35b08")
                .placeholder(R.drawable.blankblue)
                .into(eagle);

        crow = (ImageView) findViewById(R.id.crow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fcrow.png?alt=media&token=768e7fee-378e-4653-ad0a-b1eb9c706d85")
                .placeholder(R.drawable.blankblue)
                .into(crow);

        bat = (ImageView) findViewById(R.id.bat);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fbat.png?alt=media&token=670ed4d7-7949-4684-ab90-780bf6517721")
                .placeholder(R.drawable.blankblue)
                .into(bat);

        falcon = (ImageView)findViewById(R.id.falcon);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Ffalcon.png?alt=media&token=707413d5-2644-4484-896b-3475a45b1191")
                .placeholder(R.drawable.blankblue)
                .into(falcon);

        stork = (ImageView)findViewById(R.id.stork);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fstork.png?alt=media&token=523b4a9c-0d41-423a-a396-1f6984bd2f4f")
                .placeholder(R.drawable.blankblue)
                .into(stork);

        kite = (ImageView)findViewById(R.id.kite);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fkite.png?alt=media&token=195e0379-efa4-4a5b-bd19-ad9a2488dd06")
                .placeholder(R.drawable.blankblue)
                .into(kite);

        cock = (ImageView)findViewById(R.id.cock);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fcock.png?alt=media&token=29f3e58c-62ca-4523-8a5a-7041089de1f6")
                .placeholder(R.drawable.blankblue)
                .into(cock);

        dove = (ImageView)findViewById(R.id.dove);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fdove.png?alt=media&token=1d422e16-c133-4294-8491-634c18976c4b")
                .placeholder(R.drawable.blankblue)
                .into(dove);

        swan = (ImageView)findViewById(R.id.swan);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fswan.png?alt=media&token=94300f2e-9426-4ea3-aca9-6b7a18c9d611")
                .placeholder(R.drawable.blankblue)
                .into(swan);

        vulture = (ImageView)findViewById(R.id.vulture);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fvulture.png?alt=media&token=a1a97c4a-b678-49a4-ad47-4b0fdca0546c")
                .placeholder(R.drawable.blankblue)
                .into(vulture);

        crane = (ImageView)findViewById(R.id.crane);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fcrane.png?alt=media&token=1cf33948-7537-4917-ab99-b01f8142fe92")
                .placeholder(R.drawable.blankblue)
                .into(crane);

        kingfisher = (ImageView)findViewById(R.id.kingfisher);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fkingfisher.png?alt=media&token=64d76704-7236-43a8-8ae4-7d0cd4eb60b0")
                .placeholder(R.drawable.blankblue)
                .into(kingfisher);

        owl = (ImageView)findViewById(R.id.owl);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fowl.png?alt=media&token=fc8c9154-f5d3-448d-993b-53bb0a4fd3ea")
                .placeholder(R.drawable.blankblue)
                .into(owl);

        duck = (ImageView)findViewById(R.id.duck);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fduck.png?alt=media&token=1f2ad5ab-3f35-433f-8f96-19547688a14b")
                .placeholder(R.drawable.blankblue)
                .into(duck);

        hen = (ImageView)findViewById(R.id.hen);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fhen.png?alt=media&token=34ccb61a-8b4b-4697-9074-0b1a42b6a567")
                .placeholder(R.drawable.blankblue)
                .into(hen);

        ImageButton peacockA, sparrowA, parrotA, eagleA, duckA, owlA, crowA, batA, falconA, storkA, doveA, swanA, vultureA, craneA, kingfisherA, henA, kiteA, cockA;
        peacockA = findViewById(R.id.peacockA);
        sparrowA = findViewById(R.id.sparrowA);
        eagleA = findViewById(R.id.eagleA);
        parrotA = findViewById(R.id.parrotA);
        duckA = findViewById(R.id.duckA);
        owlA = findViewById(R.id.owlA);
        crowA = findViewById(R.id.crowA);
        batA = findViewById(R.id.batA);
        falconA = findViewById(R.id.falconA);
        storkA = findViewById(R.id.storkA);
        doveA = findViewById(R.id.doveA);
        swanA = findViewById(R.id.swanA);
        vultureA = findViewById(R.id.vultureA);
        craneA = findViewById(R.id.craneA);
        kingfisherA = findViewById(R.id.kingfisherA);
        henA = findViewById(R.id.henA);
        kiteA = findViewById(R.id.kiteA);
        cockA = findViewById(R.id.cockA);

        peacockA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2FPeacock_denoised.mp3?alt=media&token=5314681a-77f5-415b-a878-5f75110f8214");
            }
        });
        peacockA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2FPeacock_denoised.mp3?alt=media&token=5314681a-77f5-415b-a878-5f75110f8214");
            }
        });
        peacockA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2FPeacock_denoised.mp3?alt=media&token=5314681a-77f5-415b-a878-5f75110f8214");
            }
        });
        sparrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fsparrow_denoised.MP3?alt=media&token=337f931d-fbce-48c4-a7f5-eead17c2371d");
            }
        });
        parrotA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fparoot_denoised.MP3?alt=media&token=80ec9fcd-209b-4ace-9eca-3d03cb5aba51");
            }
        });
        eagleA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Feagle_denoised.MP3?alt=media&token=e344a1a4-d396-4321-a564-93e9dcabd594");

            }
        });
        duckA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fduck_denoised.MP3?alt=media&token=3b917e4f-f43e-472b-b97f-262ea11ef1d3");
            }
        });
        owlA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fowl_denoised.MP3?alt=media&token=39135dfa-ed56-4ec6-98b1-42453ca70493");
            }
        });
        crowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fcrow_denoised.MP3?alt=media&token=12a9091a-f27f-4f18-9ae4-125cf5bf91f6");
            }
        });
        batA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fbat_denoised.MP3?alt=media&token=f61a046e-ed93-4fe9-b9f9-639594849ac1");
            }
        });
        falconA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Ffalcon_denoised.MP3?alt=media&token=2bc7e9d5-39d6-4869-ac53-7fb9bae71e6a");
            }
        });
        storkA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fstork_denoised.MP3?alt=media&token=a3189a3e-969a-4283-adb5-97e7c707bd0c");
            }
        });
        doveA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fdove_denoised.MP3?alt=media&token=86026e00-fc18-4b01-8ba6-2e302220c395");
            }
        });
        swanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fswan_denoised.MP3?alt=media&token=1c6cb341-b91c-4851-a617-ee82b91651fe");
            }
        });
        vultureA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fvulture_denoised.MP3?alt=media&token=ac60f76b-b36f-42c6-8672-a6e4aba06e52");
            }
        });
        craneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fcrane_denoised.MP3?alt=media&token=1f920c00-9dc7-4634-b03b-df3d9e8b7d33");
            }
        });
        kingfisherA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fkingfisher_denoised.MP3?alt=media&token=2d7a4652-b463-4d06-b7f7-37b9a892d6f2");
            }
        });
        henA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fhen_denoised.MP3?alt=media&token=11714b78-6659-4889-a7c6-be52e1865b54");
            }
        });
        kiteA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fkite_denoised.MP3?alt=media&token=40b46c59-8838-42b1-af88-f20cae1aa1a4");
            }
        });

        cockA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Audio", Toast.LENGTH_LONG).show();
                playAudio("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FAudio%2Fcock_denoised.MP3?alt=media&token=f6309d78-2885-497f-8f8b-0e5f558ead90");
            }
        });



    }

    private void playAudio(String audioUrl)
    {
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

}