package com.example.medhigh.meetmd.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.control.adapters.AdapterServiceProvider;
import com.example.medhigh.meetmd.control.keepers.Controller;
import com.example.medhigh.meetmd.control.navigation.NavigationItemSelectedListener;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Default Survey View Activity Class
 * Contains list of Fragment view, with service Providers with witch User already met.
 */
public class SurveyActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    @Bind(R.id.list_item)
    ListView listView;

    List<SurveyDoctorFragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        ButterKnife.bind(this);
        initToolbar();
        initNavigationView();
        AdapterServiceProvider adapter = new AdapterServiceProvider(this, Controller.getSurveyDoctorFragments(), R.layout.fragment_survey_doctor);
        listView.setAdapter(adapter);
    }

    public void initToolbar() {
    }
    public void onClick(View view){
        startActivity(new Intent(this, SurveyRatingActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
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
