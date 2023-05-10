package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Musicpage extends AppCompatActivity {
    private ImageView alexandria;
    private ImageView Luxor;
    private ImageView egyptdiscover;
    private ImageView quran2;
    private ImageView prymides33;
    private ImageView airplan;

    private ImageView marsaalma;

    private ImageView sharm;
    private ImageView  dehab;
    private ImageView  prymides0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicpage);

        alexandria  =findViewById (R.id.alexandria);
        alexandria.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,music.class));

            }
        });
        Luxor  =findViewById (R.id.Luxor);
        Luxor.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,Luxor2.class));

            }
        });
        egyptdiscover  =findViewById (R.id.egyptdiscover);
        egyptdiscover.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,Ramdan.class));

            }
        });
        quran2  =findViewById (R.id.quran2);
        quran2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,quran.class));

            }
        });
        prymides33  =findViewById (R.id.prymides33);
        prymides33.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,prymids2.class));

            }
        });

        airplan  =findViewById (R.id.airplan);
        airplan.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,saftyandsecrity.class));

            }
        });
        marsaalma  =findViewById (R.id.marsaalma);
        marsaalma.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,mmarsaalmaActivity.class));

            }
        });
        sharm  =findViewById (R.id.sharm);
        sharm.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,shramelsheikhActivity.class));

            }
        });
        dehab  =findViewById (R.id.dehab);
        dehab.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,dehabActivity.class));

            }
        });
        prymides0  =findViewById (R.id.prymides0);
        prymides0.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Musicpage.this ,infoBeforcomingegytpActivity.class));

            }
        });
    }
}
