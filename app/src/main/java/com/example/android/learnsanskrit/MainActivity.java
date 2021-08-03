package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button sout, da, button;
    Dialog dialog;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);


        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.delete_popup);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.delete_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        TextView cancle = dialog.findViewById(R.id.cancle_popup);
        TextView delete1 = dialog.findViewById(R.id.delete_popup);

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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


        //Prevent User from Taking screenshots or recording screen
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);


        ImageView nevsign = (ImageView) findViewById(R.id.sign);
        TextView textout = (TextView) findViewById(R.id.textout);
        nevsign.setOnClickListener(new View.OnClickListener() {
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
                    Intent a = new Intent(MainActivity.this, SignIn.class);
                    a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(a);
                }
            }
        });


        ImageView delete = (ImageView) findViewById(R.id.delete);
        TextView del = (TextView) findViewById(R.id.textdelete);
        TextView acc = (TextView) findViewById(R.id.textdelete1);
        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
        {
            delete.setVisibility(View.VISIBLE);
            del.setVisibility(View.VISIBLE);
            acc.setVisibility(View.VISIBLE);
            nevsign.setImageResource(R.drawable.nev_signout);
            textout.setText("SignOut");
        }
        else
        {
            delete.setVisibility(View.GONE);
            del.setVisibility(View.GONE);
            acc.setVisibility(View.GONE);
            nevsign.setImageResource(R.drawable.nev_signout);
            textout.setText("SignIn");
        }


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
        ImageButton color = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton familyrelation = (ImageButton) findViewById(R.id.imageButton6);

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

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, colors.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        familyrelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, family_relation.class);
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

        RelativeLayout parag = (RelativeLayout) findViewById(R.id.paragraph);
        parag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, paragraphs.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        TextView pr = (TextView) findViewById(R.id.pronouns);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pronouns.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        RelativeLayout test = (RelativeLayout) findViewById(R.id.Rtest);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                if(currentUser != null) {

                    Intent intent = new Intent(MainActivity.this, Test.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Sign in to access test", Toast.LENGTH_LONG).show();
                }
            }
        });

        /*
        ImageView nevbhome = (ImageView) findViewById(R.id.home);
        nevbhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                abc.setVisibility(View.GONE);
                Ex1.setVisibility(View.GONE);
                Ex2.setVisibility(View.GONE);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_LONG).show();
            }
        });*/

        ImageView nevshare = (ImageView) findViewById(R.id.share);
        nevshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Install this app : https://drive.google.com/drive/folders/1YSSIEwGbgN0DF7-iqKVK6eo8USrHa5Pw?usp=sharing");
                sendIntent.setType("text/plain");
                Intent.createChooser(sendIntent,"Share via");
                startActivity(sendIntent);
                Toast.makeText(getApplicationContext(), "Share this app", Toast.LENGTH_LONG).show();
            }
        });

        ImageView nevexit = (ImageView) findViewById(R.id.exit);
        nevexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
                System.exit(0);
            }
        });

        ImageView dele = (ImageView) findViewById(R.id.delete);
        dele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });





        ImageView alphabets, words, phrases, grammar, quiz;
        alphabets = (ImageView) findViewById(R.id.imgletter);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Falpha.png?alt=media&token=af13eca5-be45-4818-8137-1f49a46e4f58")
                .placeholder(R.drawable.blankblue)
                .into(alphabets);

        words = (ImageView)findViewById(R.id.words);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fwords.png?alt=media&token=d7ed3a8f-6e4a-4ac7-8982-8d71fdd94e80")
                .placeholder(R.drawable.blankblue)
                .into(words);

        phrases = (ImageView)findViewById(R.id.phrases);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fphrases.png?alt=media&token=08a08b1e-1dd6-429a-ae4e-bd3d88512a37")
                .placeholder(R.drawable.blankblue)
                .into(phrases);

        grammar = (ImageView)findViewById(R.id.grammar);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fcoverpurp.png?alt=media&token=35d740b9-2fcf-4851-99d2-70409486a5e8")
                .placeholder(R.drawable.blankblue)
                .into(grammar);

        quiz = (ImageView)findViewById(R.id.itest);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Fquiz.png?alt=media&token=c1eb93f8-5583-472e-aede-1dba982b29cd")
                .placeholder(R.drawable.blankblue)
                .into(quiz);

        /*family = (ImageView)findViewById(R.id.family);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/learnsanskrit-af209.appspot.com/o/MainActivity%2Ffamily.png?alt=media&token=daa48800-bf8c-45b6-8c49-3c0cf3c8432e")
                .into(family);*/
    }
}