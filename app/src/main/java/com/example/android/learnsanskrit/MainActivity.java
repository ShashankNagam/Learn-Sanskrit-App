package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceAlignmentEnum;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.OnBoomListener;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;
import com.nightonke.boommenu.Util;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);

        ImageView mu = (ImageView) findViewById(R.id.menu_ic);
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });


        ImageView bird = (ImageView) findViewById(R.id.imageButton1);
        ImageView animal = (ImageView) findViewById(R.id.imageButton2);
        ImageView fruit = (ImageView) findViewById(R.id.imageButton3);
        ImageView vegetable = (ImageView) findViewById(R.id.imageButton4);

        bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, birds.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, animals.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruits.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vegetables.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        RelativeLayout Alfa = (RelativeLayout) findViewById(R.id.Alfa);
        LinearLayout Ex1 = (LinearLayout) findViewById(R.id.alfaexpand);
        View li1 = (View) findViewById(R.id.linee1);
        ImageView im1 = (ImageView) findViewById(R.id.first_arrow);
        Ex1.setVisibility(View.GONE);
        Alfa.setOnClickListener(new View.OnClickListener() {
            Boolean a = false;
            public void onClick(View v) {
                if (!a){
                    im1.setRotation(90);
                    li1.setVisibility(View.GONE);
                    Ex1.setVisibility(View.VISIBLE);
                    a = true;
                }
                else {
                    im1.setRotation(360);
                    Ex1.setVisibility(View.GONE);
                    li1.setVisibility(View.VISIBLE);
                    a = false;
                }
            }
        });

        RelativeLayout wor = (RelativeLayout) findViewById(R.id.word);
        LinearLayout Ex2 = (LinearLayout) findViewById(R.id.alfaexpand2);
        View li2 = (View) findViewById(R.id.linee2);
        ImageView im2 = (ImageView) findViewById(R.id.second_arrow);
        Ex2.setVisibility(View.GONE);
        wor.setOnClickListener(new View.OnClickListener() {
            Boolean b = false;
            public void onClick(View v) {
                if (!b){
                    im2.setRotation(90);
                    li2.setVisibility(View.GONE);
                    Ex2.setVisibility(View.VISIBLE);
                    b = true;
                }
                else {
                    im2.setRotation(360);
                    Ex2.setVisibility(View.GONE);
                    li2.setVisibility(View.VISIBLE);
                    b = false;
                }
            }
        });

        TextView vowels = (TextView) findViewById(R.id.vowel);
        vowels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Vowels_1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        TextView consonants = (TextView) findViewById(R.id.consonant);
        consonants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Consonants_1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

    }


}