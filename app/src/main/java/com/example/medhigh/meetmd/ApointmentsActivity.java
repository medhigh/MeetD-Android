package com.example.medhigh.meetmd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import butterknife.Bind;
import butterknife.ButterKnife;


public class ApointmentsActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    @Bind(R.id.list_item)
    ListView listView;

    List<DoctorAppointmentFragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apointments);
        ButterKnife.bind(this);
        initToolbar();
        initNavigationView();
        listView.setItemsCanFocus(true);
        ArrayList<Fragment> fragList = new ArrayList<Fragment>();
        for (int i = 0; i < 10; i++) {
            fragList.add(new DoctorAppointmentFragment());
        }
        AdapterDoctor adapter = new AdapterDoctor(this, fragList, R.layout.fragment_doctor_apointment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(), AppointmentDetailsActivity.class));
                Toast.makeText(getApplicationContext(), "dfgfg", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setAdapter(adapter);
    }
    public void onClick(View view){
        startActivity(new Intent(getApplicationContext(), AppointmentDetailsActivity.class));
        Toast.makeText(getApplicationContext(), "dfgfg", Toast.LENGTH_SHORT).show();
    }
    public void onClickAppointments(View view){
        startActivity(new Intent(getApplicationContext(), AppointmentDetailsActivity.class));
    }
    public void onClickSearchDoctor(View view){
        startActivity(new Intent(getApplicationContext(), SearchDoctor.class));
    }
    public void onClickSurvey(View view){
        startActivity(new Intent(getApplicationContext(), SurveyActivity.class));
    }

    public void initToolbar() {}

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
}
