package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


import com.example.shoya.muadv.R;

public class PCSandLCC extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcsand_lcc);
    }

    public void back(View view) {
        Intent intent = new Intent(getApplication(),TSSOverView_Prius.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), AHBandBSM.class);
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
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.pcs);
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
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.tss_lcc);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(false);
        Student.start();
    }
    @Override
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
