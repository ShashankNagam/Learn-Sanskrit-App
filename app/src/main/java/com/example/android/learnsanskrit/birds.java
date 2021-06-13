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
    protected void onCreate(Bundle savedInstanceState) {
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
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FPeacock.jpg?alt=media&token=370ec4da-10c3-4cf6-bedb-37bc495b93aa")
                .into(peacock);

        sparrow = (ImageView) findViewById(R.id.sparrow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FSparrow.jpg?alt=media&token=22db7f1d-c54d-4a6e-bfff-08860377677a")
                .into(sparrow);

        parrot = (ImageView) findViewById(R.id.parrot);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FParrot.jpg?alt=media&token=ba1d8c59-0bd3-4dd8-9b1d-b87affb2f98c")
                .into(parrot);

        eagle = (ImageView) findViewById(R.id.eagle);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FEagle.jpg?alt=media&token=adf0686a-8e2e-435a-80ba-c313c873e3f7")
                .into(eagle);

        crow = (ImageView) findViewById(R.id.crow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FCrow.jpg?alt=media&token=919cb913-32af-4e85-9194-8723f3ebb51c")
                .into(crow);

        bat = (ImageView) findViewById(R.id.bat);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FBat.jpg?alt=media&token=3785259b-e7d5-455f-985f-c03d3d9132bb")
                .into(bat);

        falcon = (ImageView)findViewById(R.id.falcon);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FFalcon.jpg?alt=media&token=0b54be80-d26f-464b-8711-6a1c532d9871")
                .into(falcon);

        stork = (ImageView)findViewById(R.id.stork);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FStork.jpg?alt=media&token=0c7d6042-09cf-4929-81e5-ca7c619986cf")
                .into(stork);

        kite = (ImageView)findViewById(R.id.kite);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FKite.jpg?alt=media&token=d55dd9a6-d230-4436-a70f-84a06be26ed6")
                .into(kite);

        cock = (ImageView)findViewById(R.id.cock);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FCock.jpg?alt=media&token=4bea9dcd-a9c8-40a6-9f23-8cedeaba85d3")
                .into(cock);

        dove = (ImageView)findViewById(R.id.dove);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FDove.jpg?alt=media&token=af4c2e6c-6299-42d2-8d74-fc2a176aa14a")
                .into(dove);

        swan = (ImageView)findViewById(R.id.swan);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FSwan.jpg?alt=media&token=dfedc9ce-8972-48c8-beef-c8a36c65be1e")
                .into(swan);

        vulture = (ImageView)findViewById(R.id.vulture);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FVulture.jpg?alt=media&token=7190a512-3421-40f2-a6d1-2d7b49d47e97")
                .into(vulture);

        crane = (ImageView)findViewById(R.id.crane);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FCrane.jpg?alt=media&token=6c9d5de8-a068-4dd2-8233-04f494654bd2")
                .into(crane);

        kingfisher = (ImageView)findViewById(R.id.kingfisher);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FKingfisher.jpg?alt=media&token=138ff516-a6ee-4f2b-a13b-e25bf2794554")
                .into(kingfisher);

        owl = (ImageView)findViewById(R.id.owl);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FOwl.jpg?alt=media&token=14a66219-5dd7-433b-bab8-e71181ec3290")
                .into(owl);

        duck = (ImageView)findViewById(R.id.duck);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FDuck.jpg?alt=media&token=c7ea69f4-9543-46b8-ad71-d7f61e666c9b")
                .into(duck);

        hen = (ImageView)findViewById(R.id.hen);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FHen.jpg?alt=media&token=ea3293ce-a0cb-425d-bc49-0d8819d1c0a4")
                .into(hen);
}
}