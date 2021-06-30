package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class paragraphs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraphs);

        ImageView backpara = (ImageView) findViewById(R.id.backpara);
        backpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        LinearLayout parax1 = (LinearLayout) findViewById(R.id.parax1);
        CardView parax1e = (CardView) findViewById(R.id.parax1e);
        parax1.setVisibility(View.GONE);
        parax1e.setOnClickListener(new View.OnClickListener() {
            Boolean b = false;
            public void onClick(View v) {
                if (!b){
                    parax1e.setRotation(180);
                    parax1.setVisibility(View.VISIBLE);
                    b = true;
                }
                else {
                    parax1e.setRotation(360);
                    parax1.setVisibility(View.GONE);
                    b = false;
                }
            }
        });

        LinearLayout parax2 = (LinearLayout) findViewById(R.id.parax2);
        CardView parax2e = (CardView) findViewById(R.id.parax2e);
        parax2.setVisibility(View.GONE);
        parax2e.setOnClickListener(new View.OnClickListener() {
            Boolean c = false;
            public void onClick(View v) {
                if (!c){
                    parax2e.setRotation(180);
                    parax2.setVisibility(View.VISIBLE);
                    c = true;
                }
                else {
                    parax2e.setRotation(360);
                    parax2.setVisibility(View.GONE);
                    c = false;
                }
            }
        });

        LinearLayout parax3 = (LinearLayout) findViewById(R.id.parax3);
        CardView parax3e = (CardView) findViewById(R.id.parax3e);
        parax3.setVisibility(View.GONE);
        parax3e.setOnClickListener(new View.OnClickListener() {
            Boolean d = false;
            public void onClick(View v) {
                if (!d){
                    parax3e.setRotation(180);
                    parax3.setVisibility(View.VISIBLE);
                    d = true;
                }
                else {
                    parax3e.setRotation(360);
                    parax3.setVisibility(View.GONE);
                    d = false;
                }
            }
        });

        LinearLayout parax4 = (LinearLayout) findViewById(R.id.parax4);
        CardView parax4e = (CardView) findViewById(R.id.parax4e);
        parax4.setVisibility(View.GONE);
        parax4e.setOnClickListener(new View.OnClickListener() {
            Boolean e = false;
            public void onClick(View v) {
                if (!e){
                    parax4e.setRotation(180);
                    parax4.setVisibility(View.VISIBLE);
                    e = true;
                }
                else {
                    parax4e.setRotation(360);
                    parax4.setVisibility(View.GONE);
                    e = false;
                }
            }
        });

        LinearLayout parax5 = (LinearLayout) findViewById(R.id.parax5);
        CardView parax5e = (CardView) findViewById(R.id.parax5e);
        parax5.setVisibility(View.GONE);
        parax5e.setOnClickListener(new View.OnClickListener() {
            Boolean f = false;
            public void onClick(View v) {
                if (!f){
                    parax5e.setRotation(180);
                    parax5.setVisibility(View.VISIBLE);
                    f = true;
                }
                else {
                    parax5e.setRotation(360);
                    parax5.setVisibility(View.GONE);
                    f = false;
                }
            }
        });

        LinearLayout parax6 = (LinearLayout) findViewById(R.id.parax6);
        CardView parax6e = (CardView) findViewById(R.id.parax6e);
        parax6.setVisibility(View.GONE);
        parax6e.setOnClickListener(new View.OnClickListener() {
            Boolean g = false;
            public void onClick(View v) {
                if (!g){
                    parax6e.setRotation(180);
                    parax6.setVisibility(View.VISIBLE);
                    g = true;
                }
                else {
                    parax6e.setRotation(360);
                    parax6.setVisibility(View.GONE);
                    g = false;
                }
            }
        });

        LinearLayout parax7 = (LinearLayout) findViewById(R.id.parax7);
        CardView parax7e = (CardView) findViewById(R.id.parax7e);
        parax7.setVisibility(View.GONE);
        parax7e.setOnClickListener(new View.OnClickListener() {
            Boolean h = false;
            public void onClick(View v) {
                if (!h){
                    parax7e.setRotation(180);
                    parax7.setVisibility(View.VISIBLE);
                    h = true;
                }
                else {
                    parax7e.setRotation(360);
                    parax7.setVisibility(View.GONE);
                    h = false;
                }
            }
        });
    }
}