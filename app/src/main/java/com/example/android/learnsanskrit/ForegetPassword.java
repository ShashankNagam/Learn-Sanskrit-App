package com.example.android.learnsanskrit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForegetPassword extends AppCompatActivity {

    private EditText mail;
    private Button sl, nxt;
    private FirebaseAuth mAuth;

    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreget_password);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

        mail = (EditText)findViewById(R.id.editTextTextEmailAddress3);
        sl = (Button)findViewById(R.id.button5);
        //nxt = (Button)findViewById(R.id.button6);

        mAuth = FirebaseAuth.getInstance();

        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email = mail.getText().toString();

                if (TextUtils.isEmpty(email))
                {
                    Toast.makeText(getApplicationContext(), "Enter email", Toast.LENGTH_LONG).show();
                }
                else
                {
                    mAuth.sendPasswordResetEmail(email)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(getApplicationContext(), "Link sent to mail id", Toast.LENGTH_LONG).show();
                                        Intent a = new Intent(ForegetPassword.this, SignIn.class);
                                        startActivity(a);
                                        finish();
                                    }
                                    else
                                    {
                                        Toast.makeText(getApplicationContext(), "Unable to send reset mail", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                }


            }
        });



    }
}