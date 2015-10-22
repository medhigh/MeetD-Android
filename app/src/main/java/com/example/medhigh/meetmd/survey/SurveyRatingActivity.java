package com.example.medhigh.meetmd.survey;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
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
 * Class for inner rating choose Activity by Patient wish.
 * Contains Information about Service Provider, Meet and list of rating bars
 */
public class SurveyRatingActivity extends AppCompatActivity{
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_rating);
        ButterKnife.bind(this);
        initToolbar();
        initNavigationView();
    }

    public void initToolbar() {
    }

    public void initNavigationView() {
        navigationView.setNavigationItemSelectedListener(new NavigationItemSelectedListener(drawerLayout,this));
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
}
