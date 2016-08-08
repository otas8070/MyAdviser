package com.example.shoya.muadv;

import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by SHOYA on 2016/07/17.
 */
public class ImageViewHighlighter implements View.OnTouchListener {


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                ((ImageView) v).setColorFilter(Color.argb(100, 255, 255, 255));
                break;
            case MotionEvent.ACTION_UP:
                ((ImageView) v).setColorFilter(null);
                break;
            case MotionEvent.ACTION_CANCEL:
                ((ImageView) v).setColorFilter(null);
                break;
        }
        return true;
    }


}
