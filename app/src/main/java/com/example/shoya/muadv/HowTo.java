package com.example.shoya.muadv;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.VideoView;

public class HowTo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);

        VideoView Student = (VideoView) findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.myadviser_1);
        Student.start();
        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                // 先頭に戻す
                VideoView Student = (VideoView) findViewById(R.id.tssoverview);
                Student.seekTo(0);
                // 再生開始
                Student.start();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        VideoView Student = (VideoView) findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.myadviser_1);
        Student.start();
        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                // 先頭に戻す
                VideoView Student = (VideoView) findViewById(R.id.tssoverview);
                Student.seekTo(0);
                // 再生開始
                Student.start();
            }
        });

    }
}