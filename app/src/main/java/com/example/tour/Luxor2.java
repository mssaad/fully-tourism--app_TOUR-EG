package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Luxor2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luxor2);

        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView2);


    }
}
