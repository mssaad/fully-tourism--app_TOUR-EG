package com.example.tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hotalbooking extends AppCompatActivity {
    private TextView textView5;
    private TextView textView8;
    private TextView textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_hotalbooking);


        textView5=findViewById (R.id.textView5);

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (hotalbooking.this ,hotaldetails.class));

            }
        });


        textView8=findViewById (R.id.textView8);

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (hotalbooking.this ,aswanActivity.class));

            }
        });

        textView11=findViewById (R.id.textView11);

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (hotalbooking.this ,luxourActivity.class));

            }
        });

    }
}
