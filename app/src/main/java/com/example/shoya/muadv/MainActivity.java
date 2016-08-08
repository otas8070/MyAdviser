package com.example.shoya.muadv;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.shoya.muadv.Kamishibai_Prius.RecallMain;
import com.example.shoya.muadv.ToyotaSS.ToyotaSafetySense;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //今設定の名前を出す。
        TextView textView = (TextView) findViewById(R.id.staffname);
        SharedPreferences sp = getSharedPreferences("setting", MODE_PRIVATE);
        if(sp.getString("staff", "未設定").equals("スタッフ名")){
            textView.setText("設定してください");
        } else if (sp.getString("staff", "未設定").equals("izumi")) {
            textView.setText("泉店長");
        } else if (sp.getString("staff", "未設定").equals("yoshiki")) {
            textView.setText("吉木スタッフ");
        } else if (sp.getString("staff", "未設定").equals("staff2")) {
            textView.setText("末次スタッフ");
        } else if (sp.getString("staff", "未設定").equals("okuma")) {
            textView.setText("大隈スタッフ");
        } else if (sp.getString("staff", "未設定").equals("inatomi")) {
            textView.setText("稲富スタッフ");
        } else if (sp.getString("staff", "未設定").equals("koga")) {
            textView.setText("古賀スタッフ");
        } else if (sp.getString("staff", "未設定").equals("toita")) {
            textView.setText("砥板スタッフ");
        } else if (sp.getString("staff", "未設定").equals("mizuta")) {
            textView.setText("水田スタッフ");
        } else {
            textView.setText("設定してください");
        }



    }
    @Override
    public void onBackPressed() {
    }
    public void kamishibai(View view) {
        Intent intent = new Intent(getApplication(), RecallMain.class);
        startActivity(intent);
    }
    public void setting(View view) {
        Intent intent = new Intent(getApplication(),Demo.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void drink(View view) {
        Intent intent = new Intent(getApplication(),DrinkMenu.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void Ref(View view) {
        Intent intent = new Intent(getApplication(),RefMain.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void tssgo(View view) {
        Intent intent = new Intent(getApplication(),ToyotaSafetySense.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
