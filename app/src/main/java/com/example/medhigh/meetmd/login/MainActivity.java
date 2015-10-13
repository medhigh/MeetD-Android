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
                //TODO INTENT FORWARD HERE
                //if user not exist yet
                startActivity(new Intent(this, NewPasswordActivity.class));
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

    private boolean ifINCorrect() {
        //TODO new threading logic for EN rules
        return true;
    }

    private boolean ifSMSCorrect() {
        //TODO new threading logic for SMS rules
        return true;
    }
}
