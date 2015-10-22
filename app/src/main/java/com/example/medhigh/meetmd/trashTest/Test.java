package com.example.medhigh.meetmd.trashTest;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.medhigh.meetmd.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import soap.wcf.AuthtokenXml;
import soap.wcf.ServiceProviderBinding;

/**
 * Temporary test class for core connection usage
 */
public class Test extends AppCompatActivity {
    @Bind(R.id.testText)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        ButterKnife.bind(this);
        RetrieveFeedTask task =new RetrieveFeedTask();
        task.execute();
    }
    class RetrieveFeedTask extends AsyncTask<Void, Void, AuthtokenXml> {

        protected AuthtokenXml doInBackground(Void... v) {
            try {
                ServiceProviderBinding serviceProviderBinding =new ServiceProviderBinding();
                 return  serviceProviderBinding.ProviderLogin("doctor1@meetmd.com","test123");
//                PatientBinding service=new PatientBinding();
//                return service.PatientLogin("number123", "test123");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void onPostExecute(AuthtokenXml xml) {
            if (xml != null) {
                textView.setText(xml.Token);
            }
        }
    }
}
