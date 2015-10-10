package com.example.medhigh.meetmd.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.medhigh.meetmd.AdapterDoctor;
import com.example.medhigh.meetmd.ApointmentsActivity;
import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.SearchDoctor;
import com.example.medhigh.meetmd.SurveyActivity;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 07.10.15.
 */
public class NewsActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    @Bind(R.id.list_item)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        ButterKnife.bind(this);
        initToolbar();
        initNavigationView();
        ArrayList<Fragment> fragList = new ArrayList<Fragment>();
        for (int i = 0; i < 10; i++) {
            fragList.add(new NewsFragment());
        }
        AdapterDoctor adapter = new AdapterDoctor(this, fragList, R.layout.fragment_news);
        listView.setAdapter(adapter);
    }

    public void initToolbar() {
    }

    public void initNavigationView() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.appointments:
                        startActivity(new Intent(getApplicationContext(), ApointmentsActivity.class));
                        break;
                    case R.id.search_doctor:
                        startActivity(new Intent(getApplicationContext(), SearchDoctor.class));
                        break;
                    case R.id.surveys:
                        startActivity(new Intent(getApplicationContext(), SurveyActivity.class));
                        break;
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(), NewsActivity.class));
                        break;
                    case R.id.reminder:
                        break;
                }
                return true;
            }
        });
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
