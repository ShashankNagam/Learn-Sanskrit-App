package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

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

public class Vowels_1 extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowels1);

        ImageView backvowels = (ImageView) findViewById(R.id.backvowels);
        backvowels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView vowel_video_button = (TextView) findViewById(R.id.vowel_video_button);
        LinearLayout vowel_video = (LinearLayout) findViewById(R.id.vowel_video);
        vowel_video.setVisibility(View.VISIBLE);
        vowel_video_button.setOnClickListener(new View.OnClickListener() {
            Boolean z = false;
            public void onClick(View v) {
                if (!z){
                    vowel_video_button.setText("Show Video");
                    vowel_video.setVisibility(View.GONE);
                    z = true;

                }
                else {
                    vowel_video_button.setText("Hide Video");
                    vowel_video.setVisibility(View.VISIBLE);
                    z = false;
                }
            }
        });

        //Prevent User from Taking screenshots or recording screen
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        VideoView videoView = findViewById(R.id.videoViewV);

        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
        {
            videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/Videos%2Fmyvowels.mp4?alt=media&token=19fe2a3e-bb30-4a24-b4e6-4b0b14c2d328");
        }

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Button play = (Button) findViewById(R.id.playVidV);

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