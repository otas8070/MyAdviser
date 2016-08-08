package com.example.shoya.muadv.ToyotaSS;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.shoya.muadv.R;

public class TSS_C_HUTAI extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tss__c__hutai);
        VideoView Student = (VideoView) findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.tss_c);
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