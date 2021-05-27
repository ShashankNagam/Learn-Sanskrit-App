package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class birds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        ImageView backbirds = (ImageView) findViewById(R.id.backbirds);

        backbirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birds.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView peacock, sparrow, parrot, eagle, crow, bat, falcon, stork, kite, cock, dove, swan, vulture, crane, kingfisher, owl,duck, hen;

        peacock = (ImageView) findViewById(R.id.peacock);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fpeacock.png?alt=media&token=9fbe5171-d2cf-48ce-95b8-1daa0863ebcf")
                .into(peacock);

        sparrow = (ImageView) findViewById(R.id.sparrow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fsparrow.png?alt=media&token=e93a7731-f92a-407a-b412-46b0d04a37fd")
                .into(sparrow);

        parrot = (ImageView) findViewById(R.id.parrot);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fparrot.png?alt=media&token=343ce0ac-c275-46bc-9b4b-e77a62ac5e9a")
                .into(parrot);

        eagle = (ImageView) findViewById(R.id.eagle);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Feagle.png?alt=media&token=6ee9ad04-09a6-4333-a926-5f3a915e568b")
                .into(eagle);

        crow = (ImageView) findViewById(R.id.crow);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fcrow.png?alt=media&token=75fc04fd-d072-499a-b5cc-0cd8077fc0ca")
                .into(crow);

        bat = (ImageView) findViewById(R.id.bat);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FBat.png?alt=media&token=240614f9-ae7a-4859-8c85-76f9fea2fe22")
                .into(bat);

        falcon = (ImageView)findViewById(R.id.falcon);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2FFalcon.png?alt=media&token=9dca04e5-8942-473b-903d-983e4e52e555")
                .into(falcon);

        stork = (ImageView)findViewById(R.id.stork);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fstork.png?alt=media&token=926b564f-6e91-4e79-8125-4aaab14cb6a2")
                .into(stork);

        kite = (ImageView)findViewById(R.id.kite);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fkite.png?alt=media&token=e92c1b53-8049-4efa-8681-ac39fee4f8d2")
                .into(kite);

        cock = (ImageView)findViewById(R.id.cock);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fcock.png?alt=media&token=48d792d1-5349-4a8a-85a9-bc14149e8101")
                .into(cock);

        dove = (ImageView)findViewById(R.id.dove);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fdove.png?alt=media&token=9aeddf9d-134c-4f02-a2ad-11813de30b0a")
                .into(dove);

        swan = (ImageView)findViewById(R.id.swan);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fswan.png?alt=media&token=f8183d90-f2fe-48e3-8d64-6eda82a2c725")
                .into(swan);

        vulture = (ImageView)findViewById(R.id.vulture);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fvulture.png?alt=media&token=456cfae4-ba1f-4e01-ae61-2f9d37a1c4ee")
                .into(vulture);

        crane = (ImageView)findViewById(R.id.crane);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fcrane.png?alt=media&token=79e18b1e-8641-4997-9975-da825455a00f")
                .into(crane);

        kingfisher = (ImageView)findViewById(R.id.kingfisher);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fkingfisher.png?alt=media&token=dbd52dce-f04a-4036-883e-9639ae591c7e")
                .into(kingfisher);

        owl = (ImageView)findViewById(R.id.owl);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fowl.png?alt=media&token=7b575f13-4ae8-49d2-b201-7fa8eefd2782")
                .into(owl);

        duck = (ImageView)findViewById(R.id.duck);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fduck.png?alt=media&token=41f6f6a1-2bbb-481c-9995-7e56e29a95c2")
                .into(duck);

        hen = (ImageView)findViewById(R.id.hen);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Birds%2FPhotos%2Fhen.png?alt=media&token=fd186e65-5ee5-4b61-866b-6048e63701e1")
                .into(hen);


    }
}