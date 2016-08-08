package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

import com.example.shoya.muadv.MainActivity;
import com.example.shoya.muadv.R;
import android.content.SharedPreferences;
import android.widget.ImageView;
import android.util.Log;

public class PleaseTalkWithMe extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_please_talk_with_me);
        SharedPreferences preferences = getSharedPreferences("setting", MODE_PRIVATE);
        String staff = preferences.getString("staff","lcc");

        ImageView staffface = (ImageView)findViewById(R.id.staff);
        staffface.setImageResource(getResources().getIdentifier(
                staff, "mipmap",  this.getPackageName()));
        Log.d("xxx",staff);

    }
    public void back(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), Prius_to_Prius.class);
        startActivity(intent);
    }
}
