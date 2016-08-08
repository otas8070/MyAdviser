package com.example.shoya.muadv;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import com.github.barteksc.pdfviewer.PDFView;

public class jaf extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaf);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.setVisibility(View.INVISIBLE);
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.jaf);
        Student.start();
        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                // 先頭に戻す
                VideoView Student = (VideoView)findViewById(R.id.tssoverview);
                Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.jaf);
                // 再生開始
                Student.start();
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.setVisibility(View.INVISIBLE);
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.jaf);
        Student.start();
        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                // 先頭に戻す
                VideoView Student = (VideoView)findViewById(R.id.tssoverview);
                Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.jaf);
                // 再生開始
                Student.start();
            }
        });

    }



    public void Glade(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.setVisibility(View.INVISIBLE);
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.jaf);
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
    public void Shogen(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.setVisibility(View.INVISIBLE);
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.jaf_taiin);
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
    public void Soubi(View v){
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.pause();
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.setVisibility(View.VISIBLE);
        pdfView.fromAsset("jaf.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void GladeSoubi(View v){
        VideoView Student = (VideoView)findViewById(R.id.tssoverview);
        Student.pause();
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.setVisibility(View.VISIBLE);
        pdfView.fromAsset("koga.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }

}

