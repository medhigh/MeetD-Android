package com.example.medhigh.meetmd.timeChooseFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alamkanak.weekview.WeekView;
import com.example.medhigh.meetmd.R;

import java.lang.reflect.Field;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Fragment for setting a meet via using service provider agenda for picked day
 */
public class DayChooseFragment extends WeekChooseFragment{
    @Bind(R.id.weekView)
    WeekView WeekView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_choose,container,false);
        ButterKnife.bind(this, view);
        WeekView.setMonthChangeListener(this);
        WeekView.setXScrollingSpeed(0); //set horizontal scroll disabled
        return view;
    }
    @Override
    public void onDetach() {
        super.onDetach();

        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
