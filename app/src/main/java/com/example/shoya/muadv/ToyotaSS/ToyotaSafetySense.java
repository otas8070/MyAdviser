package com.example.shoya.muadv.ToyotaSS;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import com.example.shoya.muadv.R;

public class ToyotaSafetySense extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota_safety_sense);

        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.slide_movie);
        Student.start();
        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                // 先頭に戻す
                VideoView Student = (VideoView)findViewById(R.id.tssoverview);
                Student.seekTo(0);
                // 再生開始
                Student.start();
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.slide_movie);
        Student.start();
        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                // 先頭に戻す
                VideoView Student = (VideoView)findViewById(R.id.tssoverview);
                Student.seekTo(0);
                // 再生開始
                Student.start();
            }
        });

    }
    public void pcsgo(View view) {
        Intent intent = new Intent(getApplication(),TSS_PCS.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void lccgo(View view) {
        Intent intent = new Intent(getApplication(),TSS_LCC.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void ahbgo(View view) {
        Intent intent = new Intent(getApplication(),TSS_AHB.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void rdago(View view) {
        Intent intent = new Intent(getApplication(),TSS_RDA.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
