package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.overridePendingTransition(R.anim.fadein,
                R.anim.fadeout);
        /*overridePendingTransition(R.anim.fadein, R.anim.fadeout);*/
        setContentView(R.layout.activity_main2);

        //home
        LinearLayout home = (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        //share
        LinearLayout share = (LinearLayout) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Learn संस्कृत : Download this app : https://drive.google.com/drive/folders/1YSSIEwGbgN0DF7-iqKVK6eo8USrHa5Pw?usp=sharing");
                sendIntent.setType("text/plain");
                Intent.createChooser(sendIntent,"Share via");
                startActivity(sendIntent);
            }
        });


        LinearLayout rm = (LinearLayout) findViewById(R.id.rightsidemenu);
        rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageView bk = (ImageView) findViewById(R.id.backnev);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        //navigation
        LinearLayout them = (LinearLayout) findViewById(R.id.theme_nev);
        them.setVisibility(View.GONE);
        LinearLayout th = (LinearLayout) findViewById(R.id.nev_theme);
        th.setOnClickListener(new View.OnClickListener() {
            Boolean a = false;
            @Override
            public void onClick(View v) {
                if (!a){
                    them.setVisibility(View.VISIBLE);
                    a = true;
                }
                else {
                    them.setVisibility(View.GONE);
                    a = false;
                }
            }
        });
    }
    public void restartApp()
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }

    public void lightTheme(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        restartApp();
    }

    public void DarkTheme(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        restartApp();
    }
}