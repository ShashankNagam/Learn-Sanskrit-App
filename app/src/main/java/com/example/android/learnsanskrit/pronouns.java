package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class pronouns extends AppCompatActivity {
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronouns);

        ImageView noun = (ImageView) findViewById(R.id.backpro);
        noun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView pronoun_video_button = (TextView) findViewById(R.id.pronoun_video_button);
        LinearLayout pronoun_video = (LinearLayout) findViewById(R.id.pronoun_video);
        pronoun_video.setVisibility(View.VISIBLE);
        pronoun_video_button.setOnClickListener(new View.OnClickListener() {
            Boolean z = false;
            public void onClick(View v) {
                if (!z){
                    pronoun_video_button.setText("Show Video");
                    pronoun_video.setVisibility(View.GONE);
                    z = true;

                }
                else {
                    pronoun_video_button.setText("Hide Video");
                    pronoun_video.setVisibility(View.VISIBLE);
                    z = false;
                }
            }
        });

        VideoView videoView = findViewById(R.id.videoViewPro);

        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
        {

            videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Videos%2Fpronoun1.mp4?alt=media&token=9770a83a-f2a5-4111-ba28-a36caa76c54c");

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
        }



        Button play = (Button) findViewById(R.id.playVidPro);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                if(currentUser != null)
                {
                    if(haveNetwork())
                    {
                        Toast.makeText(getApplicationContext(), "Loading Video...", Toast.LENGTH_LONG).show();
                        videoView.start();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Check your internet connection", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Sign In to access Video", Toast.LENGTH_LONG).show();
                }
            }
        });

        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });
    }
    private boolean haveNetwork(){
        boolean have_WIFI= false;
        boolean have_MobileData = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();
        for(NetworkInfo info:networkInfos){
            if (info.getTypeName().equalsIgnoreCase("WIFI"))if (info.isConnected())have_WIFI=true;
            if (info.getTypeName().equalsIgnoreCase("MOBILE DATA"))if (info.isConnected())have_MobileData=true;
        }
        return have_WIFI||have_MobileData;

    }
}