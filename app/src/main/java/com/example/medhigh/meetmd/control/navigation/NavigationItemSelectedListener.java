package com.example.medhigh.meetmd.control.navigation;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.appointments.AppointmentsActivity;
import com.example.medhigh.meetmd.news.NewsActivity;
import com.example.medhigh.meetmd.search.SearchDoctorActivity;
import com.example.medhigh.meetmd.survey.SurveyActivity;

/**
 * NavigationDrawer content class which inflates menu icons text and links
 */
public class NavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    AppCompatActivity activity;

    public NavigationItemSelectedListener(DrawerLayout dl,AppCompatActivity ac) {
        drawerLayout = dl;
        activity = ac;
        drawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                InputMethodManager inputMethodManager = (InputMethodManager) activity
                        .getSystemService(Activity.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(
                        activity.getCurrentFocus().getWindowToken(),0);
            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        drawerLayout.closeDrawers();
        switch (menuItem.getItemId()) {
            case R.id.appointments:
                activity.startActivity(new Intent(activity.getApplicationContext(), AppointmentsActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
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
