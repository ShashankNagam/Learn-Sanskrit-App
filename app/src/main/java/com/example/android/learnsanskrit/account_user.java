package com.example.android.learnsanskrit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class account_user extends AppCompatActivity {

    private FirebaseAuth mAuth;
    String x;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_user);

        ImageView backacc = (ImageView) findViewById(R.id.backaccount);
        backacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dialog = new Dialog(account_user.this);
        dialog.setContentView(R.layout.delete_popup);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.delete_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        TextView cancle = dialog.findViewById(R.id.cancle_popup);
        TextView delete1 = dialog.findViewById(R.id.delete_popup);
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ///*android:fontFamily="@font/adamina"*/

        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
                if(currentUser != null)
                {
                    FirebaseUser currentUser1 = mAuth.getInstance().getCurrentUser();
                    currentUser1.delete();
                    Toast.makeText(getApplicationContext(), "Account deleted", Toast.LENGTH_LONG).show();
                    Intent x = new Intent(account_user.this, SignIn.class);
                    startActivity(x);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Not Signed in", Toast.LENGTH_LONG).show();
                }
            }
        });


        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
        {
            TextView signid = (TextView) findViewById(R.id.account_id);
            x = currentUser.getEmail();
            signid.setText(x);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Please Sign In", Toast.LENGTH_LONG).show();
        }

        TextView forget_acc_id = (TextView) findViewById(R.id.forget_acc_id);
        forget_acc_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(account_user.this, ForegetPassword.class);
                d.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(d);
            }
        });
    }

    public void signoutacc(View view) {
        FirebaseUser currentUser = mAuth.getInstance().getCurrentUser();
        if(currentUser != null)
        {
            FirebaseAuth.getInstance().signOut();
            Toast.makeText(getApplicationContext(), "Signed out successfully", Toast.LENGTH_LONG).show();
            //mAuth.GoogleSignInApi.signOut(apiClient);
            Intent a = new Intent(account_user.this, SignIn.class);
            startActivity(a);
            finish();
        }
        else
        {
            Intent a = new Intent(account_user.this, SignIn.class);
            a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(a);
        }
    }

    public void deleteacc(View view) {
        dialog.show();
    }
}