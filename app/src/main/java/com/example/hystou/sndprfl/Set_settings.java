package com.example.hystou.sndprfl;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;


public class Set_settings extends AppCompatActivity {

    SeekBar alarm;
    SeekBar music;
    SeekBar ring;
    SeekBar system;
    SeekBar voice;
    AudioManager AdMngr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_settings);

        AdMngr = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        alarm = (SeekBar) findViewById(R.id.alarmBar);
        music = (SeekBar) findViewById(R.id.musicBar);
        ring = (SeekBar) findViewById(R.id.ringBar);
        system = (SeekBar) findViewById(R.id.systBar);
        voice = (SeekBar) findViewById(R.id.voiceBar);

        initBar(alarm, AudioManager.STREAM_ALARM);
        initBar(music, AudioManager.STREAM_MUSIC);
        initBar(ring, AudioManager.STREAM_RING);
        initBar(system, AudioManager.STREAM_SYSTEM);
        initBar(voice, AudioManager.STREAM_VOICE_CALL);

    }
    private void initBar (SeekBar bar, final int stream){
        bar.setMax(AdMngr.getStreamMaxVolume(stream));
        bar.setProgress(AdMngr.getStreamVolume(stream));

        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                AdMngr.setStreamVolume(stream, progress, AudioManager.FLAG_PLAY_SOUND);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}

