package com.example.medhigh.meetmd.appointments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.control.keepers.Controller;
import com.example.medhigh.meetmd.control.navigation.NavigationItemSelectedListener;
import com.example.medhigh.meetmd.timeChooseFragment.DoctorChooseTimeActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Class to show user appointment details, and cancel/move appointment
 */
public class AppointmentDetailsActivity extends AppCompatActivity {
    private static String[] onCancel = new String[2]; //onCancel AlertDialog strings
    @Bind(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation)
    NavigationView navigationView;
    private String apID = "0"; // Temporary initialization for Dummy content
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

    /**
     * Dialog to request user about mistake of cancelling appointment.
     * If not, onConfirmCancel() calls.
     *
     * @param view
     */
    public void onClickCancel(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(AppointmentDetailsActivity.this);
        builder.setTitle(R.string.cancel_appointment)
                .setMessage(R.string.cancel_request)
                .setNegativeButton(R.string.no,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                ).setPositiveButton(R.string.yes,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        onConfirmCancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    /**
     * Dialog window for cancel appointment. Use Controller class to get core.
     * User gets toast with notification if appointment not cancelling
     */
    public void onConfirmCancel() {
        AlertDialog.Builder builder = new AlertDialog.Builder(AppointmentDetailsActivity.this);
        builder.setTitle(R.string.choose_reason_of_cancel);
        onCancel[0] = getResources().getString(R.string.i_dont_need_a_doctor);
        onCancel[1] = getResources().getString(R.string.i_have_choosen_another_doctor);
        builder.setItems(onCancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        if (!Controller.cancelAppointment(apID, Controller.Reason.REASON_DONT_NEED_A_DOCTOR)) {
                            onCancelReturnFalse(); //Make Text
                            dialog.cancel();
                        } else {
                            dialog.cancel();
                            startActivity(new Intent(getApplicationContext(), AppointmentsActivity.class)
                                    .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                        }
                        break;
                    case 1:
                        if (!Controller.cancelAppointment(apID, Controller.Reason.REASON_HAVE_CHOOSEN_ANOTHER_DOCTOR)) {
                            onCancelReturnFalse(); //Make Text
                            dialog.cancel();
                        } else {
                            dialog.cancel();
                            startActivity(new Intent(getApplicationContext(), AppointmentsActivity.class)
                                    .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                        }
                        break;
                }
            }

            //Notification to user
            private void onCancelReturnFalse() {
                Toast.makeText(getApplicationContext(),
                        (getApplicationContext().getResources().getString(R.string.appointment_not_cancelled)),
                        Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    /**
     *Pushes user to service provider calendar to change time of appointment
     */
    public void onClickChange(View view) {
        startActivity(new Intent(this, DoctorChooseTimeActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                                //set appointment ID to intent forward to change
                        .putExtra("AppointmentID", "")
        );
    }
}
