package com.example.shoya.muadv;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import com.example.shoya.muadv.Kamishibai_Prius.RecallMain;

/**
 * Created by SHOYA on 2016/07/18.
 */
public class fragmentPagerAdapter extends FragmentPagerAdapter {
    public fragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new fragment1();
            case 1:
                return new RefMain();
            case 2:
                return new TSS();
            case 3:
                return new fragment2();
            case 4:
                return new Main_setting();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position){
        String shoya="no_title";
        if(position==0){ shoya="説明ツール";}
        else if(position==1){shoya="資料ツール";}
        else if(position==2){shoya="ToyotaSafetySense";}
        else if(position==3){shoya="ドリンクメニュー";}
        else if(position==4){shoya="その他(設定等)";}
        return shoya;
    }
}
