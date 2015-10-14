package com.example.medhigh.meetmd.trashTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.Wsdl2Code.WebServices.ServiceProviderBinding.AuthtokenXml;
import com.Wsdl2Code.WebServices.ServiceProviderBinding.PatientBinding;
import com.example.medhigh.meetmd.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Test extends AppCompatActivity {
    @Bind(R.id.testText)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        ButterKnife.bind(this);
        PatientBinding patientBinding =new PatientBinding();
        AuthtokenXml token = patientBinding.PatientLogin("number123","test123");
        //textView.setText(token.token);
    }
}
