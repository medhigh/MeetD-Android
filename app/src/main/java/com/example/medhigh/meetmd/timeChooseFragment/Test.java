package com.example.medhigh.meetmd.timeChooseFragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.medhigh.meetmd.R;

import java.net.MalformedURLException;
import java.net.URL;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 12.10.15.
 */
public class Test extends AppCompatActivity {
    @Bind(R.id.testText)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test);
//        ButterKnife.bind(this);
//        //ObjectFactory objectFactory = new ObjectFactory();
//        try {
//            XmlService xmlService = new XmlService(new URL("https://meetmdwcf.azurewebsites.net/API/XmlService.svc?singleWsdl"));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        //IPatient iPatient= xmlService.getPatientBinding();
        //AuthtokenXml authtokenXml =iPatient.patientLogin("number123", "test123");
        //textView.setText(authtokenXml.toString());
    }
}
