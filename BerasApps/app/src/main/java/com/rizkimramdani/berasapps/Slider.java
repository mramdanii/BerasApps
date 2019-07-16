package com.rizkimramdani.berasapps;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Slider extends AppCompatActivity {
    private ViewPager pager;
    private Button button;
    private int[] layouts = {R.layout.fragment_walkthrough1, R.layout.fragment_walkthrough2, R.layout.fragment_walkthrough3};
    private pagerAdaptor mpagerAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        pager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdaptor = new pagerAdaptor(layouts, this);
        pager.setAdapter(mpagerAdaptor);

    }
    public void next(View view) {
        Intent in = new Intent(this, Menu.class);
        startActivity(in);

    }
    }
