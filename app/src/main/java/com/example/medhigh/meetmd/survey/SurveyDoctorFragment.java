package com.example.medhigh.meetmd.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medhigh.meetmd.AppointmentDetailsActivity;
import com.example.medhigh.meetmd.R;

/**
 * Created by med_high on 09.10.2015.
 */
public class SurveyDoctorFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_survey_doctor,container,false);
    }
    public void onClick(View view){
        startActivity(new Intent(getContext(), SurveyRatingActivity.class));
    }
}
