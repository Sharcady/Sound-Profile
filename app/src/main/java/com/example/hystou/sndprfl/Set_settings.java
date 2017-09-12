package com.example.hystou.sndprfl;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Set_settings extends AppCompatActivity implements View.OnClickListener {

    SeekBar alarm;
    SeekBar music;
    SeekBar ring;
    SeekBar system;
    SeekBar voice;
    AudioManager AdMngr;
    SharedPreferences sPref;
    Button SaveBut;
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_VOLUME = "volume";
    public boolean ButPressed;

    private void setButPressed (boolean ButPressed)
    {
        ButPressed = false;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_settings);

        ButPressed = false;

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

        this.SaveBut = (Button) findViewById(R.id.SaveBtn);
        this.SaveBut.setOnClickListener(this);

        sPref = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        setButPressed(false);

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

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.SaveBtn:
                saveAlarm();
                saveMusic();
                saveRing();
                saveSystem();
                saveVoice();
                break;
            default:
                break;
        }

        setButPressed(true);
    }



    private void saveAlarm()
    {
        this.sPref = getSharedPreferences(APP_PREFERENCES,MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt(APP_PREFERENCES_VOLUME,AudioManager.STREAM_ALARM);
        ed.commit();
    }
    private void saveMusic()
    {
        this.sPref = getSharedPreferences(APP_PREFERENCES,MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt(APP_PREFERENCES_VOLUME,AudioManager.STREAM_MUSIC);
        ed.commit();
    }
    private void saveRing()
    {
        this.sPref = getSharedPreferences(APP_PREFERENCES,MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt(APP_PREFERENCES_VOLUME,AudioManager.STREAM_RING);
        ed.commit();
    }
    private void saveSystem()
    {
        this.sPref = getSharedPreferences(APP_PREFERENCES,MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt(APP_PREFERENCES_VOLUME,AudioManager.STREAM_SYSTEM);
        ed.commit();
    }
    private void saveVoice()
    {
        this.sPref = getSharedPreferences(APP_PREFERENCES,MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt(APP_PREFERENCES_VOLUME,AudioManager.STREAM_VOICE_CALL);
        ed.commit();
        Toast.makeText(this, "Preferences saved", Toast.LENGTH_SHORT).show();
    }
}

