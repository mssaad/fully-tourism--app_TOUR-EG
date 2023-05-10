package com.example.tour;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class prymids2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prymids2);


        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view5);
        getLifecycle().addObserver(youTubePlayerView2);
    }
}
