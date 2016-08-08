package com.example.shoya.muadv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Temp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
    }

    public void back(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        startActivity(intent);
    }
}
