package com.example.android.learnsanskrit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;

public class birds extends AppCompatActivity {

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
    }
}