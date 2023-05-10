package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class places extends AppCompatActivity {


    private TextView places;
    private TextView textView6;
    private TextView casteltext;
    private TextView NoarthCoast;
    private TextView Marina;
    private TextView readsea;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        places=findViewById (R.id.places);
        textView6=findViewById (R.id.textView6);
        casteltext=findViewById (R.id.casteltext);
        NoarthCoast=findViewById (R.id.NoarthCoast);
        Marina=findViewById (R.id.Marina);
        readsea=findViewById (R.id.readsea);

        places=findViewById (R.id.places);
        places.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(places.this ,prymidesActivity.class));





            }
        });
        textView6=findViewById (R.id.textView6);
        textView6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(places.this ,AbusimbleActivity.class));


            }
        });
        casteltext=findViewById (R.id.casteltext);
        casteltext.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(places.this ,castelActivity.class));


            }
        });

        NoarthCoast=findViewById (R.id.NoarthCoast);
        NoarthCoast.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(places.this ,NoarthCoastActivity.class));


            }
        });
        Marina=findViewById (R.id.Marina);
        Marina.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(places.this ,murenaActivity.class));


            }
        });
        readsea=findViewById (R.id.readsea);
        readsea.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(places.this ,readseaActivity.class));


            }
        });
    }
}
