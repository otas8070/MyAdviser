package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;

import com.example.shoya.muadv.R;

public class AHBandBSM extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahband_bsm);
    }
    public void back(View view) {
        Intent intent = new Intent(getApplication(),PCSandLCC.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), Please_RideMotion.class);
        startActivity(intent);
    }

    public void close(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video2);
        Student.stopPlayback();
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.GONE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(true);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(true);
    }

    public void pcs(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video2);
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.ahb);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(false);
        Student.start();
    }

    public void lcc(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video2);
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.rda);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(false);
        Student.start();
    }
    public void onBackPressed() {
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        if(overlay.getVisibility()==View.VISIBLE){
            VideoView Student = (VideoView)findViewById(R.id.video2);
            Student.stopPlayback();
            overlay.setVisibility(View.GONE);
            ImageView pcs = (ImageView) findViewById(R.id.pcs);
            pcs.setEnabled(true);
            ImageView lcc = (ImageView) findViewById(R.id.lcc);
            lcc.setEnabled(true);
        }
        else{
            finish();
        }
    }
}

