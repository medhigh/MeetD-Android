package com.example.medhigh.meetmd.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.medhigh.meetmd.control.adapters.AdapterDoctor;
import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.control.keepers.Controller;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by medhigh on 08.10.15.
 */
public class SpecialityFragment extends Fragment {
    @Bind(R.id.editText)
    EditText editTextSearchField;
    @Bind(R.id.listView)
    ListView listView;
    @Bind(R.id.clearEditText)
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_search_speciality,container,false);
        ButterKnife.bind(this, view);
        AdapterDoctor adapter = new AdapterDoctor(getActivity(), Controller.getListViewRatingNameFragments(), R.layout.fragment_list_view_name);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextSearchField.setText("");
            }
        });
        return view;
    }
}
