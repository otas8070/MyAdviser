package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shoya.muadv.Kamishibai_Prius.AHBandBSM;
import com.example.shoya.muadv.Kamishibai_Prius.LetTryPrius;
import com.example.shoya.muadv.MainActivity;
import com.example.shoya.muadv.R;

public class Please_RideMotion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_please__ride_motion);

        SharedPreferences preferences = getSharedPreferences("setting", MODE_PRIVATE);
        String staff = preferences.getString("staff","lcc");

        ImageView staffface = (ImageView)findViewById(R.id.staff);
        staffface.setImageResource(getResources().getIdentifier(
                staff, "mipmap",  this.getPackageName()));
    }
    public void back(View view) {
        Intent intent = new Intent(getApplication(), AHBandBSM.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), LetTryPrius.class);
        startActivity(intent);
    }
}
