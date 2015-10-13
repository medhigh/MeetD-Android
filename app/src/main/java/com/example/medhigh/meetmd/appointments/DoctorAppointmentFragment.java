package com.example.medhigh.meetmd.appointments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.medhigh.meetmd.R;

import butterknife.Bind;


public class DoctorAppointmentFragment extends Fragment {

    @Bind(R.id.relativeLayout)
    RelativeLayout relativeLayout;
    @Bind(R.id.doctorImage)
    ImageView doctorImage;
    @Bind(R.id.doctorName)
    TextView doctorName;
    @Bind(R.id.speciality)
    TextView speciality;
    @Bind(R.id.date)
    TextView date;
    @Bind(R.id.rating0)
    RatingBar ratingBar;
    @Bind(R.id.time)
    TextView time;
    @Bind(R.id.offers)
    TextView offers;
    @Bind(R.id.location)
    TextView Location;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doctor_apointment,container,false);
    }

    public TextView getLocation() {
        return Location;
    }

    public void setLocation(TextView location) {
        Location = location;
    }

    public RelativeLayout getRelativeLayout() {
        return relativeLayout;
    }

    public void setRelativeLayout(RelativeLayout relativeLayout) {
        this.relativeLayout = relativeLayout;
    }

    public ImageView getDoctorImage() {
        return doctorImage;
    }

    public void setDoctorImage(ImageView doctorImage) {
        this.doctorImage = doctorImage;
    }

    public TextView getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(TextView doctorName) {
        this.doctorName = doctorName;
    }

    public TextView getSpeciality() {
        return speciality;
    }

    public void setSpeciality(TextView speciality) {
        this.speciality = speciality;
    }

    public TextView getDate() {
        return date;
    }

    public void setDate(TextView date) {
        this.date = date;
    }

    public RatingBar getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(RatingBar ratingBar) {
        this.ratingBar = ratingBar;
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }

    public TextView getOffers() {
        return offers;
    }

    public void setOffers(TextView offers) {
        this.offers = offers;
    }

}
