package com.example.medhigh.meetmd.search;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.control.navigation.NavigationItemSelectedListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Main View Class Controller for Search Service Provider
 * Contains of fragment search by name/location/speciality
 */
public class SearchDoctorActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serarch_doctor);
        ButterKnife.bind(this);
        initTabLayout();
        initNavigationView();
    }

    public void initTabLayout() {
        TabsPagerFragmentAdapterSingleton adapter = TabsPagerFragmentAdapterSingleton.getInstance(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.computeScroll();
    }

    public void initNavigationView() {
        NavigationItemSelectedListener listener = new NavigationItemSelectedListener(drawerLayout,this);
        navigationView.setNavigationItemSelectedListener(listener);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //SearchModel.clearLinks();
    }
}
