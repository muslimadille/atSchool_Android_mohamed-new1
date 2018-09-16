package com.atschoolPioneerSchool;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.atschoolPioneerSchool.adapter.Ma3refa_viewPager_adapter;

public class Ma3refa extends AppCompatActivity {
    private Toolbar mToolbar;
    private ActionBar actionBar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma3refa);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        Ma3refa_viewPager_adapter ma3refa_viewPager_adapter=new Ma3refa_viewPager_adapter(getSupportFragmentManager());
        //add fragments
        ma3refa_viewPager_adapter.AddFragment(new Fragment_subjects(), String.valueOf(R.string.subjects));
        ma3refa_viewPager_adapter.AddFragment(new Fragment_exams(),"Exams");
        //setup adapter
        viewPager.setAdapter(ma3refa_viewPager_adapter);
        tabLayout.setupWithViewPager(viewPager);
        initToolbar();



    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
