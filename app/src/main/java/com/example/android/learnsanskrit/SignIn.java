package com.example.android.learnsanskrit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import android.text.Html;
public class SignIn extends AppCompatActivity {

    private EditText email, psw;
    private Button sgnin;
    private TextView fgp, sgnup, skip;
    private FirebaseAuth mAuth;
    private String mail, pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);




        sgnin = (Button)findViewById(R.id.button2);
        sgnin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = (EditText)findViewById(R.id.editTextTextEmailAddress2);
                psw = (EditText)findViewById(R.id.editTextTextPassword);

                mail = email.getText().toString();
                pass = psw.getText().toString();

                mAuth = FirebaseAuth.getInstance();

                if(verify(mail, pass))
                {
                    sign_in(mail,pass);
                }

            }
        });

        sgnup = findViewById(R.id.sign_up);
        sgnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(SignIn.this, Signup.class);
                startActivity(a);
            }
        });

        String str = "New here?<b> Sign Up</b>";
        sgnup.setText(Html.fromHtml(str));

        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(SignIn.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });

        fgp = findViewById(R.id.textView3);
        fgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(SignIn.this, ForegetPassword.class);
                startActivity(d);
            }
        });

    }

    private boolean verify(String mail, String pw)
    {
        if (TextUtils.isEmpty(mail))
        {
            Toast.makeText(getApplicationContext(), "Enter email-id", Toast.LENGTH_LONG).show();
            return false;
        }
        else if (TextUtils.isEmpty(pw))
        {
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();
            return false;
        }
        else if (pw.length()<6)
        {
            Toast.makeText(getApplicationContext(), "Password should contain minimum 6 characters", Toast.LENGTH_LONG).show();
            return false;
        }
        else
        {
            return true;
        }
    }

    private void sign_in(String email,String password)
    {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(), "Signed in successfully", Toast.LENGTH_LONG).show();
                            Intent b = new Intent(SignIn.this, MainActivity.class);
                            startActivity(b);
                            finish();
                        } else
                        {
                            Toast.makeText(getApplicationContext(), "Incorrect email-id or password", Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }

}