package com.example.tour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Contactus extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public void Call(View v)
    {  Intent dial = new Intent();
        String PhoneNo="01060822922";
        dial.setAction("android.intent.action.DIAL");
        dial.setData(Uri.parse("tel:"+PhoneNo));
        startActivity(dial);

        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + PhoneNo));
        startActivity(dial);


    }
    public void SMS(View v)
    { String PhoneNo="+216 11 111 111";
        Uri smsUri = Uri.parse(PhoneNo);
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra("address",PhoneNo);
        intent.setType("text/plain");
        startActivity(intent);


    }

    public void Findus(View v)
    {
        String geoCode ="geo:36.800287, 10.185343";
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(geoCode));
        startActivity(intent);

    }

}
