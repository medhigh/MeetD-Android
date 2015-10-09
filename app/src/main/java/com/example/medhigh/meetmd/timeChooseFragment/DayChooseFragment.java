package com.example.medhigh.meetmd.timeChooseFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alamkanak.weekview.WeekView;
import com.example.medhigh.meetmd.R;

import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 08.10.15.
 */
public class DayChooseFragment extends WeekChooseFragment{
    @Bind(R.id.weekView)
    WeekView mWeekView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_choose,container,false);
        ButterKnife.bind(this, view);
        mWeekView.setFirstDayOfWeek(1);
        mWeekView.invalidate();
        return view;
    }
}
