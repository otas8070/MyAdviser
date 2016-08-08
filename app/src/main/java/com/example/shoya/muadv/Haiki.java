package com.example.shoya.muadv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Haiki extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haiki);
    }
    public void Ref(View view) {
        Intent intent = new Intent(getApplication(),RefMain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
