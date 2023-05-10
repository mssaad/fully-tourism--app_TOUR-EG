package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class shramelsheikhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shramelsheikh);

        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view222);
        getLifecycle().addObserver(youTubePlayerView2);
    }
    }

