package com.example.medhigh.meetmd.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medhigh.meetmd.R;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * Main Patient App Activity. Contents of Insurance Number and SMS pass dialog with user.
 */
public class MainActivity extends AppCompatActivity implements EditText.OnEditorActionListener {
    @Bind(R.id.buttonLogin)
    Button loginBtn;
    @Bind(R.id.insuranceEditText)
    EditText insuranceEditText;
    @Bind(R.id.insurence_number)
    TextView insTextView;
    @BindString(R.string.temp_pass)
    String title;
    @BindString(R.string.done)
    String done;
    boolean smsSent;
    String insuranceNumber;
    String smsPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        insuranceEditText.setOnEditorActionListener(this);
        smsSent = false;

    }

    private void setPasswordPage() {
        //setting R.string.temp_pass string to title
        insTextView.setText(title.toCharArray(), 0, title.length());
        //same for button
        loginBtn.setText(done.toCharArray(), 0, done.length());
        //clear editText
        insuranceEditText.clearComposingText();
    }

    /**
     * On click login if insurance number is correct, user gets toast to
     * enter SMS temporary password into appears fields.
     * If IN is incorrect or mismatch, user gets toast to enter IN again.
     * After entering correct SMS code view changes to enter new password
     * activity.
     *
     * @param view
     */
    public void onClickLogin(View view) {

        if (!smsSent) {
            Editable e = insuranceEditText.getText();
            insuranceNumber = e.toString();
            Log.d("LOGIN ", "Ins number: " + e.toString());
            if (ifINCorrect()) {
                smsSent = true;
                Toast.makeText(this, "Please Enter SMS Code", Toast.LENGTH_SHORT).show();
                insuranceEditText.setText("");
            } else {
                Toast.makeText(this, "Incorrect Insurance Number", Toast.LENGTH_SHORT).show();
                return;
            }
            setPasswordPage();
        } else {
            Editable e = insuranceEditText.getText();
            smsPassword = e.toString();
            if (ifSMSCorrect()) {
                //if user not exist yet
                startActivity(new Intent(this, NewPasswordActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
            } else {
                Toast.makeText(this, "Incorrect SMS Code", Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            onClickLogin(loginBtn);
            return true;
    }

    /**
     * Logic for check Insurance Number of user for mistakes
     * @return true if IN is valid
     */
    private boolean ifINCorrect() {
        //TODO new threading logic for IN rules
        return true;
    }

    /**
     * Logic for check SMS password on valid
     * @return true if SMS password matches.
     */
    private boolean ifSMSCorrect() {
        //TODO new threading logic for SMS rules
        return true;
    }
}
