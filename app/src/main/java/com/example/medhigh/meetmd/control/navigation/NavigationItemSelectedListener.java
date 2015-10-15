package com.example.medhigh.meetmd.control.navigation;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.appointments.ApointmentsActivity;
import com.example.medhigh.meetmd.news.NewsActivity;
import com.example.medhigh.meetmd.search.SearchDoctorActivity;
import com.example.medhigh.meetmd.survey.SurveyActivity;

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
                activity.startActivity(new Intent(activity.getApplicationContext(), ApointmentsActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                break;
            case R.id.search_doctor:
                activity.startActivity(new Intent(activity.getApplicationContext(), SearchDoctorActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                break;
            case R.id.surveys:
                activity.startActivity(new Intent(activity.getApplicationContext(), SurveyActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                break;
            case R.id.news:
                activity.startActivity(new Intent(activity.getApplicationContext(), NewsActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                break;
            case R.id.reminder:
                break;
        }
        return true;
    }
}
