package com.example.medhigh.meetmd.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.example.medhigh.meetmd.control.adapters.AdapterDoctor;
import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.control.keepers.Controller;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 08.10.15.
 */
public class NameFragment extends Fragment {
    @Bind(R.id.editTextSearchField)
    EditText editTextSearchField;
    @Bind(R.id.listView)
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_serach_name,container,false);
        ButterKnife.bind(this, view);
        AdapterDoctor adapter = new AdapterDoctor(getActivity(), Controller.getListViewRatingNameFragments(), R.layout.fragment_list_view_rating_name);
        listView.setAdapter(adapter);
        return view;
    }
    public void onClick(View view){
        startActivity(new Intent(getContext(), SearchDoctorActivity.class));
    }
}
