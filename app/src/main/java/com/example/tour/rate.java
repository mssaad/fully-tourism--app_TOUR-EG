package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.sdsmdg.tastytoast.TastyToast;

public class rate extends AppCompatActivity {
 RatingBar ratingBar;
 Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        ratingBar=findViewById(R.id.rating_bar);
        submit_button=findViewById(R.id.submit_button);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= String.valueOf(ratingBar.getRating());
                TastyToast.makeText(getApplicationContext(),s+"Star",TastyToast.LENGTH_LONG, TastyToast.SUCCESS).show();


            }
        });

    }
}
