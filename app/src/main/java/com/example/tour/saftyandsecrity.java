package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class saftyandsecrity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saftyandsecrity);

        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view9);
        getLifecycle().addObserver(youTubePlayerView2);


    }
}
