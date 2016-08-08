package com.example.shoya.muadv;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;
import org.w3c.dom.Text;
import android.view.View.*;

public class HVChange extends Activity {

    private Spinner nSpinner;
    private Spinner yearSpinner;
    private Spinner nenpiSpinner;
    private Spinner gasSpinner;
    private Spinner teiangasSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hvchange);

        ImageView setting = (ImageView)findViewById(R.id.setting);
        setting.setOnClickListener(open);

        nSpinner = (Spinner) findViewById(R.id.hvcar);
        nSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //　アイテムが選択された時
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                Spinner spinner = (Spinner) parent;
                String item = (String) spinner.getSelectedItem();
                ImageView car = (ImageView)findViewById(R.id.car);
                ImageView logo = (ImageView)findViewById(R.id.logo);
                ImageView car2 = (ImageView)findViewById(R.id.car2);
                ImageView logo2 = (ImageView)findViewById(R.id.logo2);
                TextView km = (TextView) findViewById(R.id.kml2);
                if (item.equals("プリウス")) {
                    car.setImageResource(R.mipmap.prius);
                    logo.setImageResource(R.mipmap.p_impossible);
                    car2.setImageResource(R.mipmap.prius);
                    logo2.setImageResource(R.mipmap.p_impossible);
                } else if (item.equals("アクア")) {
                    car.setImageResource(R.mipmap.aqua);
                    logo.setImageResource(R.mipmap.aqualogo);
                    car2.setImageResource(R.mipmap.aqua);
                    logo2.setImageResource(R.mipmap.aqualogo);
                } else if (item.equals("シエンタ")) {
                    car.setImageResource(R.mipmap.sienta);
                    logo.setImageResource(R.mipmap.sientalogo);
                    car2.setImageResource(R.mipmap.sienta);
                    logo2.setImageResource(R.mipmap.sientalogo);
                } else if (item.equals("エスティマ")) {
                    car.setImageResource(R.mipmap.estima);
                    logo.setImageResource(R.mipmap.estimalogo);
                    car2.setImageResource(R.mipmap.estima);
                    logo2.setImageResource(R.mipmap.estimalogo);
                } else if (item.equals("SAI")) {
                    car.setImageResource(R.mipmap.sai);
                    logo.setImageResource(R.mipmap.sailogo);
                    car2.setImageResource(R.mipmap.sai);
                    logo2.setImageResource(R.mipmap.sailogo);
                } else if (item.equals("古賀")) {

                } else if (item.equals("砥板")) {

                } else if (item.equals("水田")) {

                } else {

                }
            }
            //　アイテムが選択されなかった
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        yearSpinner = (Spinner) findViewById(R.id.year);
        yearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                TextView year = (TextView) findViewById(R.id.km);
                TextView year2 = (TextView) findViewById(R.id.km2);
                SpinnerChange((Spinner) parent,year);
                SpinnerChange((Spinner) parent,year2);
                calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
                calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
                resultcal();
            }
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        nenpiSpinner = (Spinner) findViewById(R.id.nenpi);
        nenpiSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                TextView year = (TextView) findViewById(R.id.kml);
                SpinnerChange((Spinner) parent,year);
                calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
                calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
                resultcal();
            }
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        nenpiSpinner = (Spinner) findViewById(R.id.nenpi2);
        nenpiSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                TextView year = (TextView) findViewById(R.id.kml2);
                SpinnerChange((Spinner) parent,year);
                calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
                calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
                resultcal();
            }
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        gasSpinner = (Spinner) findViewById(R.id.gas);
        gasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                TextView year = (TextView) findViewById(R.id.en);
                SpinnerChange((Spinner) parent,year);
                calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
                calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
                resultcal();
            }
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        teiangasSpinner = (Spinner) findViewById(R.id.teiangas);
        teiangasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View viw, int arg2, long arg3) {
                TextView year = (TextView) findViewById(R.id.en2);
                SpinnerChange((Spinner) parent,year);
                calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
                calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
                resultcal();
            }
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
        calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
        resultcal();
    }

    public void back(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        startActivity(intent);
    }

    public void SpinnerChange(Spinner spinner, TextView text){
        String str = (String) spinner.getSelectedItem();
        text.setText(str);
    }

    OnClickListener close = new OnClickListener() {
        @Override
        public void onClick(View view) {
            LinearLayout overlay = (LinearLayout)findViewById(R.id.set);
            overlay.setVisibility(View.GONE);
            ImageView setting = (ImageView)findViewById(R.id.setting);
            setting.setOnClickListener(open);
            calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
            calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
            resultcal();
        }
    };
    OnClickListener open = new OnClickListener() {
        @Override
        public void onClick(View view) {
            LinearLayout overlay = (LinearLayout)findViewById(R.id.set);
            overlay.setVisibility(View.VISIBLE);
            ImageView setting = (ImageView)findViewById(R.id.setting);
            setting.setOnClickListener(close);
        }
    };
    public void calsum(TextView nenpi,TextView gas,TextView result,TextView result2){
        TextView year = (TextView) findViewById(R.id.km);
        String value1 = year.getText().toString();
        String value2 = gas.getText().toString();
        String value3 = nenpi.getText().toString();
        Integer sum = (int) (Float.parseFloat(value1) / Float.parseFloat(value3) * Float.parseFloat(value2) * 2 );
        result.setText(Integer.toString(sum));
        result2.setText(Integer.toString(sum));
    }
    public void resultcal(){
        TextView year = (TextView) findViewById(R.id.nowcar);
        TextView gas = (TextView) findViewById(R.id.teiancar);
        TextView result = (TextView) findViewById(R.id.majiresult);
        String value1 = year.getText().toString();
        String value2 = gas.getText().toString();
        Integer sum = Integer.parseInt(value1) - Integer.parseInt(value2);
        result.setText(Integer.toString(sum));
    }
    @Override
    public void onBackPressed() {
        LinearLayout overlay = (LinearLayout)findViewById(R.id.set);
        if(overlay.getVisibility()==View.VISIBLE){
            overlay.setVisibility(View.GONE);
            ImageView setting = (ImageView)findViewById(R.id.setting);
            setting.setOnClickListener(open);
            calsum((TextView) findViewById(R.id.kml),(TextView) findViewById(R.id.en),(TextView) findViewById(R.id.sum),(TextView) findViewById(R.id.nowcar));
            calsum((TextView) findViewById(R.id.kml2),(TextView) findViewById(R.id.en2),(TextView) findViewById(R.id.result),(TextView) findViewById(R.id.teiancar));
            resultcal();
        }
        else{
            finish();
        }
    }

}
