package com.example.medhigh.meetmd.timeChooseFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.medhigh.meetmd.control.keepers.Controller;

/**
 * Created by med_high on 09.10.2015.
 */
public class TabsPagerDoctorFragmentAdapterSingleton extends FragmentPagerAdapter {


    private Fragment[] fragments;
    private static TabsPagerDoctorFragmentAdapterSingleton adapter;

    public static TabsPagerDoctorFragmentAdapterSingleton getInstance(FragmentManager fm){
        if(adapter!=null){
            return adapter;
        }else {
            adapter = new TabsPagerDoctorFragmentAdapterSingleton(fm);
            return adapter;
        }
    }

    private TabsPagerDoctorFragmentAdapterSingleton(FragmentManager fm) {
        super(fm);
        fragments= (Fragment[]) Controller.getSearchDoctorShortInfoFragments().toArray();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "SearchDoctorShortInfo";//fragments[0].getResources().getString(R.string.name);
            case 1:
                return "SearchDoctorShortInfo";//fragments[1].getResources().getString(R.string.speciality);
            case 2:
                return "SearchDoctorShortInfo";//fragments[2].getResources().getString(R.string.location);
            default: return "SearchDoctorShortInfo";
        }
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }
}
