package com.example.medhigh.meetmd.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.medhigh.meetmd.appointments.AppointmentConfirmActivity;
import com.example.medhigh.meetmd.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 08.10.15.
 */
public class ListViewRatingNameFragment extends Fragment {
    @Bind(R.id.rating)
    RatingBar rating;
    @Bind(R.id.textViewName)
    TextView textViewName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_list_view_rating_name,container,false);
        ButterKnife.bind(this, view);
        return view;
    }
    public void onClick(View view){
        startActivity(new Intent(getContext(), AppointmentConfirmActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
    }

    public RatingBar getRating() {
        return rating;
    }

    public void setRating(RatingBar rating) {
        this.rating = rating;
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(TextView textViewName) {
        this.textViewName = textViewName;
    }
}
