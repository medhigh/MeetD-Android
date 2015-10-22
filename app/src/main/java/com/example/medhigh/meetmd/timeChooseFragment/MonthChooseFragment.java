package com.example.medhigh.meetmd.timeChooseFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medhigh.meetmd.R;
import com.squareup.timessquare.CalendarPickerView;

import java.lang.reflect.Field;
import java.util.Calendar;
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
        View view = inflater.inflate(R.layout.fragment_month_choose, container, false);
        ButterKnife.bind(this, view);
        Date today = new Date();
        Calendar month = Calendar.getInstance();
        month.add(Calendar.MONTH, 3);
        calendarPickerView.init(today, month.getTime()).withSelectedDate(today);
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
