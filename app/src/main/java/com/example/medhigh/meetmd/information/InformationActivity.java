package com.example.medhigh.meetmd.information;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.RatingBar;

import com.example.medhigh.meetmd.control.navigation.NavigationItemSelectedListener;
import com.example.medhigh.meetmd.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 07.10.15.
 */
public class InformationActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    @Bind(R.id.rating0)
    RatingBar ratingBar0;
    @Bind(R.id.rating1)
    RatingBar ratingBar1;
    @Bind(R.id.rating2)
    RatingBar ratingBar2;
    @Bind(R.id.rating3)
    RatingBar ratingBar3;
    @Bind(R.id.rating4)
    RatingBar ratingBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_information);
        ButterKnife.bind(this);
        initRatingBar();
        initNavigationView();
    }

    public void initRatingBar() {
        starsSetColor(ratingBar0);
        starsSetColor(ratingBar1);
        starsSetColor(ratingBar2);
        starsSetColor(ratingBar3);
        starsSetColor(ratingBar4);
    }
    private void starsSetColor(RatingBar ratingBar){
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.parseColor("#26ce61"),
                PorterDuff.Mode.SRC_ATOP); // for filled stars
        stars.getDrawable(1).setColorFilter(Color.parseColor("#FFFF00"),
                PorterDuff.Mode.SRC_ATOP); // for half filled stars
        stars.getDrawable(0).setColorFilter(Color.CYAN,
                PorterDuff.Mode.SRC_ATOP); // for empty stars
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
