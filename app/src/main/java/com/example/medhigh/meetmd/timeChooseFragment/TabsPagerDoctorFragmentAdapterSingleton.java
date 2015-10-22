package com.example.medhigh.meetmd.timeChooseFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.medhigh.meetmd.control.keepers.Controller;

import java.util.List;

/**
 * Fragment Adapter for dynamically set up List of Service Provider Fragments
 */
public class TabsPagerDoctorFragmentAdapterSingleton extends FragmentPagerAdapter {

    private static TabsPagerDoctorFragmentAdapterSingleton adapter;
    private List<Fragment> fragments;

    private TabsPagerDoctorFragmentAdapterSingleton(FragmentManager fm) {
        super(fm);
        fragments = Controller.getSearchDoctorShortInfoFragments();
    }

    public static TabsPagerDoctorFragmentAdapterSingleton getInstance(FragmentManager fm){
        if(adapter!=null){
            return adapter;
        }else {
            adapter = new TabsPagerDoctorFragmentAdapterSingleton(fm);
            return adapter;
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Search Doctor Short Info";
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}
