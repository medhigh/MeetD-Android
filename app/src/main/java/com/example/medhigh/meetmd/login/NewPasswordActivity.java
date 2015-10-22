package com.example.medhigh.meetmd.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.appointments.AppointmentsActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * View for setting up new password
 */
public class NewPasswordActivity extends AppCompatActivity  implements EditText.OnEditorActionListener{

    @Bind(R.id.passEditText)
    EditText passEditText;
    @Bind(R.id.confirmEditText2)
    EditText confirmEditText2;
    @Bind(R.id.buttonLogin)
    Button buttonLogin;
    String pass;
    String passConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_pass);
        ButterKnife.bind(this);
        confirmEditText2.setOnEditorActionListener(this);
    }

    public void onClickLogin(View view) {
        pass = passEditText.getText().toString();
        passConfirm = confirmEditText2.getText().toString();
        if (isPasswordsCorrectAndMatches()) {
            //TODO INTENT FORWARD
            //Toast.makeText(this, "Intent Forward", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, AppointmentsActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
        }
    }

    private boolean isPasswordsCorrectAndMatches() {
        if (pass.length() > 3) {
            if (pass.equals(passConfirm)) {
                return true;
            } else {
                Toast.makeText(this, "Password Mismatch, Try again", Toast.LENGTH_SHORT).show();
                clearFields();
                return false;
            }

        } else {
            Toast.makeText(this, "Password less then 4 character", Toast.LENGTH_SHORT).show();
            clearFields();
            return false;
        }
        //TODO logic for compare
    }

    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        onClickLogin(v);
        return true;
    }

    private void clearFields() {
        passEditText.setText("");
        confirmEditText2.setText("");
        passEditText.requestFocus();
    }
}
