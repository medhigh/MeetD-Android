package com.example.medhigh.meetmd.timeChooseFragment;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

import com.alamkanak.weekview.WeekView;
import com.example.medhigh.meetmd.R;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 08.10.15.
 */
public class DoctorChooseTimeActivity extends AppCompatActivity{

    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    @Bind(R.id.tabLayout)
    TabLayout tabLayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.viewPagerDoctor)
    ViewPager viewPagerDoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_chose_time);
        ButterKnife.bind(this);
        initTabLayout();
        initNavigationView();
    }

    public void initTabLayout() {
        TabsPagerFragmentAdapterSingleton adapter = TabsPagerFragmentAdapterSingleton.getInstance(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        TabsPagerDoctorFragmentAdapterSingleton adapterDoctor = TabsPagerDoctorFragmentAdapterSingleton.getInstance(getSupportFragmentManager());
        viewPagerDoctor.setAdapter(adapterDoctor);
    }

    public void initNavigationView() {
        navigationView.setItemTextAppearance(R.style.TextTheme);
        toolbar.setNavigationIcon(R.drawable.menu);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }
    public void onClickInfo(View view){

    }
}
