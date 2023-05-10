package com.example.tour;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class quran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);


        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view4);
        getLifecycle().addObserver(youTubePlayerView2);
    }
    }

