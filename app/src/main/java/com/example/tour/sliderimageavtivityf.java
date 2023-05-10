package com.example.tour;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class sliderimageavtivityf extends AppCompatActivity {

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









    ViewPager viewPager;



    //add images from drawable to array
    int images[] = {R.drawable.foodfeast, R.drawable.foodfeast, R.drawable.foods_image};

    int currentPageCunter = 0;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliderimadeactivityfood_main);

        //find view by id
        viewPager = findViewById(R.id.viewpager);
        //add adapter
        viewPager.setAdapter(new SliderAdapterfood2(images,sliderimageavtivityf.this));

        //auto change image
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                if (currentPageCunter == images.length) {
                    currentPageCunter = 0;

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

    }

}

