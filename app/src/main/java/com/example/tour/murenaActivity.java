package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class murenaActivity extends AppCompatActivity {
private Button launch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murena);

        launch=findViewById(R.id.launch);
        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:30.777755,28.9967523,12z"));
                Intent chosser=Intent.createChooser(intent,"Launch Map");
                startActivity(chosser);
            }
        });



    }
}