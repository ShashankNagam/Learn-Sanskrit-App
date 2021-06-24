package com.example.android.learnsanskrit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
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

    private Button sout, da;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);

        //Prevent User from Taking screenshots or recording screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);


        sout = (Button)findViewById(R.id.button3);
        sout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                if(currentUser != null)
                {
                    FirebaseAuth.getInstance().signOut();
                    Toast.makeText(getApplicationContext(), "Signed out successfully", Toast.LENGTH_LONG).show();
                    //mAuth.GoogleSignInApi.signOut(apiClient);
                    Intent a = new Intent(MainActivity.this, SignIn.class);
                    startActivity(a);
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Not Signed in", Toast.LENGTH_LONG).show();
                }

            }
        });

        da = (Button)findViewById(R.id.button4);
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                if(currentUser != null)
                {
                    FirebaseUser currentUser1 = mAuth.getInstance().getCurrentUser();
                    currentUser1.delete();
                    Toast.makeText(getApplicationContext(), "Account deleted", Toast.LENGTH_LONG).show();
                    Intent x = new Intent(MainActivity.this, SignIn.class);
                    startActivity(x);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Not Signed in", Toast.LENGTH_LONG).show();
                }

            }
        });


        RelativeLayout abc = (RelativeLayout) findViewById(R.id.abc);
        ImageView menu = (ImageView) findViewById(R.id.menu);
        abc.setVisibility(View.GONE);
        menu.setImageResource(R.drawable.ic_baseline_menu_24);
        menu.setOnClickListener(new View.OnClickListener() {
            Boolean z = false;
            public void onClick(View v) {
                if (!z){
                    menu.setImageResource(R.drawable.arrow);
                    abc.setVisibility(View.VISIBLE);
                    z = true;

                }
                else {
                    menu.setImageResource(R.drawable.ic_baseline_menu_24);
                    abc.setVisibility(View.GONE);
                    z = false;
                }
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

        TextView nouns = (TextView) findViewById(R.id.nouns);
        nouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nouns.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        TextView con = (TextView) findViewById(R.id.conjunction);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, conjunction.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        TextView ver = (TextView) findViewById(R.id.verbs);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, verbs.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        RelativeLayout phr = (RelativeLayout) findViewById(R.id.phrase);
        phr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, phrases.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageView alphabets, words, phrases, grammar, family;
        alphabets = (ImageView) findViewById(R.id.imgletter);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Falpha.png?alt=media&token=af13eca5-be45-4818-8137-1f49a46e4f58")
                .into(alphabets);

        words = (ImageView)findViewById(R.id.words);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fwords.png?alt=media&token=d7ed3a8f-6e4a-4ac7-8982-8d71fdd94e80")
                .into(words);

        phrases = (ImageView)findViewById(R.id.phrases);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fphrases.png?alt=media&token=08a08b1e-1dd6-429a-ae4e-bd3d88512a37")
                .into(phrases);

        grammar = (ImageView)findViewById(R.id.grammar);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fgrammar.png?alt=media&token=03f75b80-acce-4d4f-9855-c23d0d8dd900")
                .into(grammar);

        family = (ImageView)findViewById(R.id.family);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Ffamily.png?alt=media&token=daa48800-bf8c-45b6-8c49-3c0cf3c8432e")
                .into(family);


    }


}

//Adding comment