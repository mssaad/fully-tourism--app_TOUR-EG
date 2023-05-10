package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.sdsmdg.tastytoast.TastyToast;

public class hotalroomActivity extends AppCompatActivity {
    private Button btnlogout;
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotalroom);

        btnlogout = findViewById(R.id.btnlogout);


        btnlogout.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance ().signOut ();//logout
                TastyToast.makeText(getApplicationContext(), "logged in successfully", TastyToast.LENGTH_LONG, TastyToast.WARNING);

                startActivity (new Intent(getApplicationContext () ,Register.class));

                finish ();            }
        });
        btnback = findViewById(R.id.btnback);


        btnback.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                startActivity (new Intent(getApplicationContext () ,Homepage.class));

                             }
        });

    }
    }


