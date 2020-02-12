package com.example.eggtimer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alarm);
        Intent intent = getIntent();
        String timer = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final TextView textView = findViewById(R.id.textView2);

        int timeInSeconds = Integer.parseInt(timer) * 1000;

        new CountDownTimer(timeInSeconds + 1000, 1000) {
            public void onTick(long msUntilFinished) {
                textView.setText("" + msUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                mediaPlayer.start();
                //finish();
            }
        }.start();
    }
}
