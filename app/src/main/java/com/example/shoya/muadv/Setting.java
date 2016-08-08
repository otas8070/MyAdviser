package com.example.shoya.muadv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.widget.AdapterView.*;
import android.view.*;
import android.util.*;
import android.content.SharedPreferences;

public class Setting extends Activity {

    private Spinner nSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        nSpinner = (Spinner)findViewById(R.id.name);
        nSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            //　アイテムが選択された時
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                Spinner spinner = (Spinner) parent;
                String item = (String) spinner.getSelectedItem();

                SharedPreferences sp = getSharedPreferences("setting", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                if(item.equals("スタッフ名")){
                } else if (item.equals("吉木")) {
                    editor.putString("staff", "yoshiki");
                } else if (item.equals("末次")) {
                    editor.putString("staff", "staff2");
                } else if (item.equals("大隈")) {
                    editor.putString("staff", "okuma");
                } else if (item.equals("稲富")) {
                    editor.putString("staff", "inatomi");
                } else if (item.equals("古賀")) {
                    editor.putString("staff", "koga");
                } else if (item.equals("砥板")) {
                    editor.putString("staff", "toita");
                } else if (item.equals("水田")) {
                    editor.putString("staff", "mizuta");
                } else if (item.equals("鬼塚")) {
                    editor.putString("staff", "onitsuka");
                } else if (item.equals("泉店長")) {
                    editor.putString("staff", "izumi");
                } else if (item.equals("豊田")) {
                    editor.putString("staff", "toyoda");
                } else if (item.equals("鬼塚")) {
                    editor.putString("staff", "onitsuka");
                } else {

                }

                editor.commit();
            }

            //　アイテムが選択されなかった
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

}
