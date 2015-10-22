package com.example.medhigh.meetmd.appointments;

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
 * Class for view list of appointments and payment information
 */
public class AppointmentsActivity extends AppCompatActivity {
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
        AdapterServiceProvider adapter = new AdapterServiceProvider(this, Controller.getDoctorAppointmentFragments(), R.layout.fragment_doctor_apointment);
        listView.setAdapter(adapter);
    }
    public void onClick(View view){
        startActivity(new Intent(getApplicationContext(), AppointmentDetailsActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
    }

    public void initToolbar() {}

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
