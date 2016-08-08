package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shoya.muadv.Kamishibai_Prius.PCSandLCC;
import com.example.shoya.muadv.Kamishibai_Prius.Prius_to_Prius;
import com.example.shoya.muadv.Main2Activity;
import com.example.shoya.muadv.MainActivity;
import com.example.shoya.muadv.R;

public class TSSOverView_Prius extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tssover_view__prius);
    }
    public void back(View view) {
        Intent intent = new Intent(getApplication(),Prius_to_Prius.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), PCSandLCC.class);
        startActivity(intent);
    }
}
