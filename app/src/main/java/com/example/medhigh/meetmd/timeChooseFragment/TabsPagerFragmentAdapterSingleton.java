package com.example.medhigh.meetmd.timeChooseFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter for time choose fragment
 */
public class TabsPagerFragmentAdapterSingleton extends FragmentPagerAdapter {

    private static TabsPagerFragmentAdapterSingleton adapter;
    private Fragment[] fragments;

    private TabsPagerFragmentAdapterSingleton(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[3];
        fragments[0] = new MonthChooseFragment();
        fragments[1] = new WeekChooseFragment();
        fragments[2] = new DayChooseFragment();
    }

    public static TabsPagerFragmentAdapterSingleton getInstance(FragmentManager fm){
        if(adapter!=null){
            return adapter;
        }else {
            adapter = new TabsPagerFragmentAdapterSingleton(fm);
            return adapter;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Month";//fragments[0].getResources().getString(R.string.name);
            case 1:
                return "Week";//fragments[1].getResources().getString(R.string.speciality);
            case 2:
                return "Day";//fragments[2].getResources().getString(R.string.location);
            default: return "Search";
        }
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }
}
