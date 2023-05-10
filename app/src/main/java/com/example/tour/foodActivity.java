package com.example.tour;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class foodActivity extends AppCompatActivity {





    private TextView grenfood;
    private TextView rice;
    private TextView koshary;
    private TextView kofta;
    private TextView foodfoul;
    private TextView molokhia;





    ViewPager viewPager;



    //add images from drawable to array
    int images[] = {R.drawable.foods_image, R.drawable.foodfoul, R.drawable.foodfeast, R.drawable.egyptiangreenfood, R.drawable.egyptiankoshary, R.drawable.rice, R.drawable.molokhia,R.drawable.food22222222222};

    int currentPageCunter = 0;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliderimadeactivityfood_main);

        //find view by id
        viewPager = findViewById(R.id.viewpager);
        //add adapter
        viewPager.setAdapter(new SliderAdapterfood2(images,foodActivity.this));

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

        grenfood =findViewById (R.id.grenfood);
        grenfood.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(foodActivity.this ,greenfood.class));


            }
        });

        rice =findViewById (R.id.rice);
        rice.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(foodActivity.this ,Rice.class));


            }
        });
        koshary =findViewById (R.id.koshary);
        koshary.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(foodActivity.this ,koshary.class));


            }
        });

        kofta =findViewById (R.id.kofta);
        kofta.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(foodActivity.this ,kofta.class));


            }
        });
        foodfoul =findViewById (R.id.foodfoul);
        foodfoul.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(foodActivity.this ,foul.class));


            }
        });
        molokhia =findViewById (R.id.molokhia);
        molokhia.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(foodActivity.this ,Molokhia.class));


            }
        });






    }

}

