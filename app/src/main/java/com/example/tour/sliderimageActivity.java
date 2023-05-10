package com.example.tour;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class sliderimageActivity extends AppCompatActivity {

    private TextView places;
    private TextView textView6;
    private TextView casteltext;
    private TextView NoarthCoast;
    private TextView Marina;
    private TextView readsea;
    private TextView cairotower;


    private TextView nationalmuseum;

    private TextView almoezstreet;

    private TextView  slahadencastel;
    private TextView hatshepsuttemple ;
    private TextView  highdam;

private ImageView dehab;

       private ImageView sharm;
       private ImageView marsaalma;
     private  ImageView hurghada ;





    ViewPager viewPager;



    //add images from drawable to array
    int images[] = {R.drawable.images, R.drawable.desktop, R.drawable.ss};

    int currentPageCunter = 0;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliderimadeactivity_main);

        //find view by id
        viewPager = findViewById(R.id.viewpager);
        //add adapter
        viewPager.setAdapter(new SliderAdapter(images, sliderimageActivity.this));

        //auto change image
        final Handler handler = new Handler();
        final Runnable update  = new Runnable() {
            @Override
            public void run() {
                if (currentPageCunter == images.length){
                    currentPageCunter = 0 ;

                }

                viewPager.setCurrentItem(currentPageCunter++,true);
            }
        };

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        },2500,2500);

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
                startActivity(new Intent(sliderimageActivity.this ,prymidesActivity.class));





            }
        });
        textView6=findViewById (R.id.textView6);
        textView6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,AbusimbleActivity.class));


            }
        });
        casteltext=findViewById (R.id.casteltext);
        casteltext.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,castelActivity.class));


            }
        });

        NoarthCoast=findViewById (R.id.NoarthCoast);
        NoarthCoast.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,NoarthCoastActivity.class));


            }
        });
        Marina=findViewById (R.id.Marina);
        Marina.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,murenaActivity.class));


            }
        });
        readsea=findViewById (R.id.readsea);
        readsea.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,readseaActivity.class));


            }
        });
        cairotower=findViewById (R.id.cairotower);
        cairotower.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,cairotower.class));


            }
        });
        nationalmuseum =findViewById (R.id.nationalmuseum);
        nationalmuseum.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,museum.class));


            }
        });

        almoezstreet =findViewById (R.id.almoezstreet);
        almoezstreet.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,AlmoezStreet.class));


            }
        });

        slahadencastel =findViewById (R.id.slahadencastel);
        slahadencastel.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,SlahadenCastel.class));


            }
        });
        hatshepsuttemple =findViewById (R.id.hatshepsuttemple);
        hatshepsuttemple.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,HatshepsutTemple.class));


            }
        });
        hatshepsuttemple =findViewById (R.id.hatshepsuttemple);
        hatshepsuttemple.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,HatshepsutTemple.class));


            }
        });
        highdam =findViewById (R.id.highdam);
        highdam.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,HighDam.class));


            }
        });
        dehab =findViewById (R.id.dehab);
        dehab.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,dehabpalceActivity.class));


            }
        });
        sharm =findViewById (R.id.sharm);
        sharm.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,sharmplaceActivity.class));


            }
        });
        marsaalma =findViewById (R.id.marsaalma);
        marsaalma.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,marsaalmplaceActivity.class));


            }
        });
        hurghada  =findViewById (R.id.hurghada);
        hurghada .setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sliderimageActivity.this ,hurgadaActivity.class));


            }
        });
    }
}

