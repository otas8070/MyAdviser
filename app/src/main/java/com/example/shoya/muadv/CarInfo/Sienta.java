package com.example.shoya.muadv.CarInfo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.shoya.muadv.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;

public class Sienta extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sienta);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("sienta.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void Glade(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("sienta.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void Shogen(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("sienta_s.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void Soubi(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("sienta_so.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }
    public void GladeSoubi(View v){
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("sienta_gs.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load();
    }

}

