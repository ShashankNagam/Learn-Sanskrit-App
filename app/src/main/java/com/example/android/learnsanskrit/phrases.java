package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class phrases extends AppCompatActivity {

    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        //Prevent User from Taking screenshots or recording screen
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        ImageView backph = (ImageView) findViewById(R.id.backph);
        backph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView phrase_video_button = (TextView) findViewById(R.id.phrase_video_button);
        LinearLayout phrase_video = (LinearLayout) findViewById(R.id.phrase_video);
        phrase_video.setVisibility(View.VISIBLE);
        phrase_video_button.setOnClickListener(new View.OnClickListener() {
            Boolean z = false;
            public void onClick(View v) {
                if (!z){
                    phrase_video_button.setText("Show Video");
                    phrase_video.setVisibility(View.GONE);
                    z = true;

                }
                else {
                    phrase_video_button.setText("Hide Video");
                    phrase_video.setVisibility(View.VISIBLE);
                    z = false;
                }
            }
        });


        VideoView videoView = findViewById(R.id.videoViewPhr);
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Videos%2FPhrases.mp4?alt=media&token=a9acc8f0-ef87-4a36-96b0-5970c203f0be");

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Button play = (Button) findViewById(R.id.playVidPhr);

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