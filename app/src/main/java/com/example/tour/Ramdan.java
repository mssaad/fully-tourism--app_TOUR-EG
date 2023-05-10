package com.example.tour;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Ramdan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramdan);

        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view3);
        getLifecycle().addObserver(youTubePlayerView2);
    }
}
