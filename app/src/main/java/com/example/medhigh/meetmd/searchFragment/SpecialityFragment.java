package com.example.medhigh.meetmd.searchFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medhigh.meetmd.R;

/**
 * Created by medhigh on 08.10.15.
 */
public class SpecialityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_speciality,container,false);
    }
}
