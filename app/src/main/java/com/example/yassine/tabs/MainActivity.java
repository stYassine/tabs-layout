package com.example.yassine.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.yassine.tabs.fragments.OneFragment;
import com.example.yassine.tabs.fragments.ThreeFragment;
import com.example.yassine.tabs.fragments.TwoFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabs;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabs =(TabLayout) findViewById(R.id.tabs);
        viewPager =(ViewPager) findViewById(R.id.view_pager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");

        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);

    }

}
