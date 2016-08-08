package com.example.shoya.muadv.CarInfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.shoya.muadv.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Arion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arion);PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("arion.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void Glade(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("arion.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void Shogen(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("arion_s.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void Soubi(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("arison_so.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void GladeSoubi(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("arion_gs.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }

}

