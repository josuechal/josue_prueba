package com.getbyte.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);

        int[] images = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
        String[] motivo = {getString(R.string.motivo_a),getString(R.string.motivo_b),getString(R.string.motivo_c)};
        String[] tiempo ={getString(R.string.tiempo_a),getString(R.string.tiempo_b),getString(R.string.tiempo_c)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){

            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i],motivo[i],tiempo[i]);
            viewPagerItemArrayList.add(viewPagerItem);
        }
        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList);

        viewPager2.setAdapter(vpAdapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
    }
}