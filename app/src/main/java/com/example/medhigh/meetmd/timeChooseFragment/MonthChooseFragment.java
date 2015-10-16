package com.example.medhigh.meetmd.timeChooseFragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medhigh.meetmd.R;
import com.squareup.timessquare.CalendarPickerView;

import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 08.10.15.
 */
public class MonthChooseFragment extends Fragment{
    @Bind(R.id.calendar_view)
    CalendarPickerView calendarPickerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_month_choose,container,false);
        ButterKnife.bind(this, view);
        calendarPickerView.init(new Date(2015,7,15),new Date(2015,9,15));
        return view;
    }
}
