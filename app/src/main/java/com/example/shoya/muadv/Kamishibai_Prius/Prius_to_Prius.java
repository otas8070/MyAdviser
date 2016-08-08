package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shoya.muadv.R;

public class Prius_to_Prius extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prius_to__prius);
    }
    public void back(View view) {
        Intent intent = new Intent(getApplication(),PleaseTalkWithMe.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), TSSOverView_Prius.class);
        startActivity(intent);
    }
}
