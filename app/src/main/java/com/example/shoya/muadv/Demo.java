package com.example.shoya.muadv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.astuetz.PagerSlidingTabStrip;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.example.shoya.muadv.CarInfo.Aqua_info;
import com.example.shoya.muadv.CarInfo.Arion;
import com.example.shoya.muadv.CarInfo.Avensis;
import com.example.shoya.muadv.CarInfo.Century;
import com.example.shoya.muadv.CarInfo.CrownAthlete;
import com.example.shoya.muadv.CarInfo.CrownMajesta;
import com.example.shoya.muadv.CarInfo.CrownRoyal_info;
import com.example.shoya.muadv.CarInfo.Esq;
import com.example.shoya.muadv.CarInfo.Estima;
import com.example.shoya.muadv.CarInfo.FJ;
import com.example.shoya.muadv.CarInfo.Mirai;
import com.example.shoya.muadv.CarInfo.PRADO;
import com.example.shoya.muadv.CarInfo.Porte;
import com.example.shoya.muadv.CarInfo.PriusAlpha;
import com.example.shoya.muadv.CarInfo.RandCruiser;
import com.example.shoya.muadv.CarInfo.SAI;
import com.example.shoya.muadv.CarInfo.Sienta;
import com.example.shoya.muadv.CarInfo.hatiroku;
import com.example.shoya.muadv.CarInfo.isi;
import com.example.shoya.muadv.Kamishibai_Prius.RecallMain;
import com.example.shoya.muadv.ToyotaSS.TSS_C;
import com.example.shoya.muadv.ToyotaSS.ToyotaSafetySense;

public class Demo extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ImageView imageView = (ImageView) findViewById(R.id.gifView);
        GlideDrawableImageViewTarget target = new GlideDrawableImageViewTarget(imageView);
        Glide.with(this).load(R.raw.main).into(target);
        setViews();
    }
    private void setViews(){
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(new fragmentPagerAdapter(getSupportFragmentManager()));

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setViewPager(viewPager);
    }
    public void kamishibai(View view) {
        Intent intent = new Intent(getApplication(), RecallMain.class);
        startActivity(intent);
    }
    public void setting(View view) {
        Intent intent = new Intent(getApplication(),Setting.class);
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
    public void tss_c(View view) {
        Intent intent = new Intent(getApplication(),TSS_C.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void nenipi_shimu(View view) {
        Intent intent = new Intent(getApplication(),HVChange.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void haiki_zeikin(View view) {
        Intent intent = new Intent(getApplication(),Haiki.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void aqua(View view) {
        Intent intent = new Intent(getApplication(),Aqua_info.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void cr(View view) {
        Intent intent = new Intent(getApplication(), CrownRoyal_info.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void sienta(View view) {
        Intent intent = new Intent(getApplication(), Sienta.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void prd(View view) {
        Intent intent = new Intent(getApplication(), PRADO.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void esq(View view) {
        Intent intent = new Intent(getApplication(), Esq.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void Estima(View view) {
        Intent intent = new Intent(getApplication(), Estima.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void rc(View view) {
        Intent intent = new Intent(getApplication(), RandCruiser.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void pa(View view) {
        Intent intent = new Intent(getApplication(), PriusAlpha.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void sai(View view) {
        Intent intent = new Intent(getApplication(), SAI.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void arion(View view) {
        Intent intent = new Intent(getApplication(), Arion.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void ca(View view) {
        Intent intent = new Intent(getApplication(), CrownAthlete.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void cm(View view) {
        Intent intent = new Intent(getApplication(), CrownMajesta.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void centry(View view) {
        Intent intent = new Intent(getApplication(), Century.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void porte(View view) {
        Intent intent = new Intent(getApplication(), Porte.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void fj(View view) {
        Intent intent = new Intent(getApplication(), FJ.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void isis(View view) {
        Intent intent = new Intent(getApplication(), isi.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void ave(View view) {
        Intent intent = new Intent(getApplication(), Avensis.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void hatiroku(View view) {
        Intent intent = new Intent(getApplication(), hatiroku.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void mirai(View view) {
        Intent intent = new Intent(getApplication(), Mirai.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void jaf(View view) {
        Intent intent = new Intent(getApplication(), jaf.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void hoken(View view) {
        Intent intent = new Intent(getApplication(), Hoken.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void how(View view) {
        Intent intent = new Intent(getApplication(), HowTo.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
