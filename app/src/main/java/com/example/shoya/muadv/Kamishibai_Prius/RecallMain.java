package com.example.shoya.muadv.Kamishibai_Prius;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.*;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import android.media.MediaPlayer;
import com.example.shoya.muadv.MainActivity;
import com.example.shoya.muadv.R;

public class RecallMain extends Activity {


    ViewPager mViewPager;
    int Siya_P = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recall_main);

        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        PagerAdapter mPagerAdapter = new MyPagerAdapter();
        mViewPager.setAdapter(mPagerAdapter );
        mViewPager.addOnPageChangeListener(new OnPageChangeListener() {
            //http://d.hatena.ne.jp/yudetamago_orz/20120927/1348755545
            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            //
            @Override
            public void onPageScrollStateChanged(int state) {
                if(state == ViewPager.SCROLL_STATE_SETTLING) {
                    //ページ数取得
                    int page = mViewPager.getCurrentItem();
                    Log.d("shoya", String.valueOf(page));
                    if (page==1) {
                        staff_face();
                        VideoView Student = (VideoView)findViewById(R.id.priusmov);
                        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.prius_movie);
                        Student.start();
                        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                // TODO Auto-generated method stub
                                // 先頭に戻す
                                VideoView Student = (VideoView)findViewById(R.id.priusmov);
                                Student.seekTo(0);
                                // 再生開始
                                Student.start();
                            }
                        });
                    }
                    else if (page==6) {
                        staff_face();
                        VideoView Student = (VideoView)findViewById(R.id.priusmov3);
                        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.tnga);
                        Student.start();
                        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                // TODO Auto-generated method stub
                                // 先頭に戻す
                                VideoView Student = (VideoView)findViewById(R.id.priusmov3);
                                Student.seekTo(0);
                                // 再生開始
                                Student.start();
                            }
                        });
                    }
                    else if (page==8) {
                        VideoView Student = (VideoView)findViewById(R.id.priusmov2);
                        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.prius_red);
                        Student.start();
                        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                // TODO Auto-generated method stub
                                // 先頭に戻す
                                VideoView Student = (VideoView)findViewById(R.id.priusmov2);
                                Student.seekTo(0);
                                // 再生開始
                                Student.start();
                            }
                        });
                    }
                    else if (page==7) {
                        VideoView Student = (VideoView)findViewById(R.id.priusmov4);
                        Student.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ftone);
                        Student.start();
                        Student.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                // TODO Auto-generated method stub
                                // 先頭に戻す
                                VideoView Student = (VideoView)findViewById(R.id.priusmov4);
                                Student.seekTo(0);
                                // 再生開始
                                Student.start();
                            }
                        });
                    }
                }
            }
        });
        staff_face();
    }

    private class MyPagerAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // レイアウトファイル名を配列で指定します。
            int[] pages = {R.layout.prius_want,R.layout.activity_please_talk_with_me, R.layout.activity_prius_to__prius, R.layout.activity_tssover_view__prius, R.layout.activity_pcsand_lcc, R.layout.activity_ahband_bsm,R.layout.activity_please__ride_motion,R.layout.ftisnoone, R.layout.activity_let_try_prius};

            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View layout ;
            layout = inflater.inflate(pages[position], null);
            ((ViewPager) container).addView(layout);
            return layout;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeView((View)object);
        }

        @Override
        public int getCount() {
            // ページ数を返します。
            return 9;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }



    }

    public void back(View view) {
        Intent intent = new Intent(getApplication(), Please_RideMotion.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(getApplication(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void ahb(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video3);
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.ahb);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay2);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.ahb);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.bsm);
        lcc.setEnabled(false);
        Student.start();
    }
    public void bsm(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video3);
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.rda);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay2);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.ahb);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.bsm);
        lcc.setEnabled(false);
        Student.start();
    }
    public void pcs(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video2);
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.pcs);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(false);
        Student.start();
    }
    public void lcc(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video2);
        Student.setVideoPath("android.resource://" + this.getPackageName() + "/" + R.raw.lcc);
        //Student.setMediaController(new MediaController(this));
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.VISIBLE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(false);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(false);
        Student.start();
    }
    public void close(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video2);
        Student.stopPlayback();
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        overlay.setVisibility(View.GONE);
        ImageView pcs = (ImageView) findViewById(R.id.pcs);
        pcs.setEnabled(true);
        ImageView lcc = (ImageView) findViewById(R.id.lcc);
        lcc.setEnabled(true);
    }
    public void close2(View view) {
        VideoView Student = (VideoView)findViewById(R.id.video3);
        Student.stopPlayback();
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay2);
        overlay.setVisibility(View.GONE);
        ImageView pcs = (ImageView) findViewById(R.id.ahb);
        pcs.setEnabled(true);
        ImageView lcc = (ImageView) findViewById(R.id.bsm);
        lcc.setEnabled(true);
    }
    public void staff_face(){
        SharedPreferences preferences = getSharedPreferences("setting", MODE_PRIVATE);
        String staff = preferences.getString("staff","lcc");
        ImageView staffface = (ImageView)findViewById(R.id.staff);
        if(staffface!=null) {
            staffface.setImageResource(getResources().getIdentifier(
                    staff, "mipmap", this.getPackageName()));
        }
    }
    public void onBackPressed() {
        LinearLayout overlay = (LinearLayout)findViewById(R.id.movielay);
        LinearLayout overlay2 = (LinearLayout)findViewById(R.id.movielay2);
        Log.d("overlay", String.valueOf(overlay));
        Log.d("overlay2", String.valueOf(overlay2));
        if(overlay == null || overlay2==null){
            finish();
        }
        else if(overlay.getVisibility()==View.VISIBLE){
            VideoView Student = (VideoView)findViewById(R.id.video2);
            Student.stopPlayback();
            overlay.setVisibility(View.GONE);
            ImageView pcs = (ImageView) findViewById(R.id.pcs);
            pcs.setEnabled(true);
            ImageView lcc = (ImageView) findViewById(R.id.lcc);
            lcc.setEnabled(true);
        }
        else if(overlay2.getVisibility()==View.VISIBLE){
            VideoView Student = (VideoView)findViewById(R.id.video3);
            Student.stopPlayback();
            overlay2.setVisibility(View.GONE);
            ImageView pcs = (ImageView) findViewById(R.id.ahb);
            pcs.setEnabled(true);
            ImageView lcc = (ImageView) findViewById(R.id.bsm);
            lcc.setEnabled(true);
        }
        else{
            finish();
        }
    }
    public void Siya(View view){
        ImageView siya = (ImageView)findViewById(R.id.priussiya);
        if(Siya_P==1){
            siya.setImageResource(R.mipmap.new_p);
            Siya_P=2;
        }
        else if(Siya_P==2){
            siya.setImageResource(R.mipmap.old_p);
            Siya_P=1;
        }
    }
}
