package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class SplashScreen extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally{


                    FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                    
                    if(currentUser != null)
                    {
                        Intent a = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(a);
                        finish();
                    }
                    else
                    {
                        Intent intent = new Intent(SplashScreen.this, SignIn.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        finish();
                    }


                }
            }
        };thread.start();
    }
}