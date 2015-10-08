package com.example.medhigh.meetmd.searchFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by medhigh on 08.10.15.
 */
public class TabsPagerFragmentAdapterSingleton extends FragmentPagerAdapter {
    private Fragment[] fragments;
    private static TabsPagerFragmentAdapterSingleton adapter;

    public static TabsPagerFragmentAdapterSingleton getInstance(FragmentManager fm){
        if(adapter!=null){
            return adapter;
        }else {
            adapter = new TabsPagerFragmentAdapterSingleton(fm);
            return adapter;
        }
    }

    private TabsPagerFragmentAdapterSingleton(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[3];
        fragments[0] = new NameFragment();
        fragments[1] = new SpecialityFragment();
        fragments[2] = new MapFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Name";//fragments[0].getResources().getString(R.string.name);
            case 1:
                return "Speciality";//fragments[1].getResources().getString(R.string.speciality);
            case 2:
                return "Location";//fragments[2].getResources().getString(R.string.location);
            default: return "Search";
        }
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }
}

