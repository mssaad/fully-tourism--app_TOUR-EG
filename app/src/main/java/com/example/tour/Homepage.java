package com.example.tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.sdsmdg.tastytoast.TastyToast;

public class Homepage extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;


    private TextView hotaltext;
    private TextView textView5;
    private TextView textView6;
    private TextView places;

    private ActionBar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_homepage);
        setContentView (R.layout.activity_homepage);



        Toolbar toolbar2=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);

        nav=(NavigationView)findViewById(R.id.navmenu);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar2,R.string.open,R.string.close);

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.menu_home :
                        Intent intent=new Intent(Homepage.this,Homepage.class);
                        startActivity(intent);
                        break;

                    case R.id.menu_music :
                        Intent intent2=new Intent(Homepage.this,Musicpage.class);
                        startActivity(intent2);
                        break;

                    case R.id.menu_setting :
                        Intent intent3=new Intent(Homepage.this,setting.class);
                        startActivity(intent3);
                        break;

                    case R.id.menu_Rate:
                        Intent intent4=new Intent(Homepage.this,rate.class);
                        startActivity(intent4);
                        break;


                    case R.id.About_Us :
                        Intent intent6=new Intent(Homepage.this,AboutActivity.class);
                        startActivity(intent6);
                        break;

                    case R.id.LOG_OUT :
                        FirebaseAuth.getInstance ().signOut ();//logout
                        TastyToast.makeText(getApplicationContext(), "logged in successfully", TastyToast.LENGTH_LONG, TastyToast.WARNING);

                        startActivity (new Intent (getApplicationContext () ,Login.class));

                        finish ();
                        break;

                }

                return true;
            }
        });






        toolbar = getSupportActionBar();

        BottomNavigationView navigation = findViewById(R.id.nav_view);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);




        hotaltext=findViewById (R.id.hotaltext);

        textView5=findViewById (R.id.textView5);
        places=findViewById (R.id.places);

        hotaltext=findViewById (R.id.hotaltext);
        hotaltext.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Homepage.this ,hotalbooking.class));

            }
        });
        textView5=findViewById (R.id.textView5);
        textView5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Homepage.this ,food.class));

            }
        });
        places=findViewById (R.id.places);
        places.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Homepage.this ,sliderimageActivity.class));



            }
        });
        textView6=findViewById (R.id.textView6);
        textView6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Homepage.this ,airplane.class));



            }
        });


    }




    private Button button;

    public void logout(View view) {

        FirebaseAuth.getInstance ().signOut ();//logout
        TastyToast.makeText(getApplicationContext(), "logged in successfully", TastyToast.LENGTH_LONG, TastyToast.WARNING);

        startActivity (new Intent (getApplicationContext () ,Login.class));

        finish ();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Home:
                    Intent intent=new Intent(Homepage.this,Homepage.class);
                    startActivity(intent);
                    return true;
                case R.id.Setting:
                    Intent intent1=new Intent(Homepage.this,setting.class);
                    startActivity(intent1);
                    return true;
                case R.id.Music:
                    Intent intent2=new Intent(Homepage.this,Musicpage.class);
                    startActivity(intent2);
                    return true;
                case R.id.Rate:
                    Intent intent3=new Intent(Homepage.this,rate.class);
                    startActivity(intent3);
                    return true;
            }
            return false;
        }
    };



}









