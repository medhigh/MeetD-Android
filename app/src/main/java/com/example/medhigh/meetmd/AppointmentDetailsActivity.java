package com.example.medhigh.meetmd;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class AppointmentDetailsActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;


    List<DoctorAppointmentFragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_details);
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
    public void onClickCancel(View view){
        Toast.makeText(this,"on click cancel",Toast.LENGTH_SHORT).show();
    }
    public void onClickChange(View view){
        Toast.makeText(this,"on click change",Toast.LENGTH_SHORT).show();
    }
}
