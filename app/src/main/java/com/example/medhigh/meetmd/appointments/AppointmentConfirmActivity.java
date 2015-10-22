package com.example.medhigh.meetmd.appointments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.control.keepers.Controller;
import com.example.medhigh.meetmd.control.navigation.NavigationItemSelectedListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Class for review appointment details and confirm appointment
 */
public class AppointmentConfirmActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    private String timeSlot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_confirm);
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

    public void onClickConfirm(View view){
        if (Controller.PatientCreateAppointment(timeSlot)) {
            startActivity(new Intent(getApplicationContext(), AppointmentsActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
        } else {
            Toast.makeText(this, "Reason", Toast.LENGTH_LONG).show();
        }
    }
}
