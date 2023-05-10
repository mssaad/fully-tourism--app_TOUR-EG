package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prymidesActivity extends AppCompatActivity {
private Button launch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prymides);

        launch=findViewById(R.id.launch);
        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:29.9773008,31.1346842,17z"));
                Intent chosser=Intent.createChooser(intent,"Launch Map");
                startActivity(chosser);
            }
        });



    }
}
