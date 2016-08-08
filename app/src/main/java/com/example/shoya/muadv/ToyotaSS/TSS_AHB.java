package com.example.shoya.muadv.ToyotaSS;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.shoya.muadv.R;

public class TSS_AHB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tss__ahb);
        VideoView Student = (VideoView) findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ahb);
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


    public void ChangeImage(View v) {
        ImageView shoya = (ImageView) findViewById(R.id.setsumei2);
        shoya.setImageResource(R.mipmap.ahb);

    }
    public void ChangeImage2(View v) {
        ImageView shoya = (ImageView) findViewById(R.id.setsumei2);
        shoya.setImageResource(R.mipmap.ahb2);

    }
    public void ChangeImage3(View v) {
        ImageView shoya = (ImageView) findViewById(R.id.setsumei2);
        shoya.setImageResource(R.mipmap.ahbtext);

    }
}
