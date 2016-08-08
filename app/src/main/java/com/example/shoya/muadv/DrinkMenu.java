package com.example.shoya.muadv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DrinkMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);
    }
    public void back(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        startActivity(intent);
    }
}
