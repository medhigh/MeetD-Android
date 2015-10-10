package com.example.medhigh.meetmd;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.medhigh.meetmd.news.NewsActivity;

/**
 * Created by medhigh on 10.10.15.
 */
public class NavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    AppCompatActivity activity;

    public NavigationItemSelectedListener(DrawerLayout dl,AppCompatActivity ac) {
        drawerLayout = dl;
        activity = ac;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        drawerLayout.closeDrawers();
        switch (menuItem.getItemId()) {
            case R.id.appointments:
                activity.startActivity(new Intent(activity.getApplicationContext(), ApointmentsActivity.class));
                break;
            case R.id.search_doctor:
                activity.startActivity(new Intent(activity.getApplicationContext(), SearchDoctor.class));
                break;
            case R.id.surveys:
                activity.startActivity(new Intent(activity.getApplicationContext(), SurveyActivity.class));
                break;
            case R.id.news:
                activity.startActivity(new Intent(activity.getApplicationContext(), NewsActivity.class));
                break;
            case R.id.reminder:
                break;
        }
        return true;
    }
}
