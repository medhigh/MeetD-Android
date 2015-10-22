package com.example.medhigh.meetmd.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.medhigh.meetmd.R;
import com.example.medhigh.meetmd.appointments.AppointmentConfirmActivity;
import com.example.medhigh.meetmd.control.adapters.AdapterServiceProvider;
import com.example.medhigh.meetmd.control.keepers.Controller;
import com.example.medhigh.meetmd.control.model.SearchModel;

import java.lang.reflect.Field;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Search by Name Class provide search field and list of names service providers
 */
public class NameFragment extends Fragment {
    @Bind(R.id.editText)
    EditText editTextSearchField;
    @Bind(R.id.listView)
    ListView listView;
    @Bind(R.id.clearEditText)
    Button button;
    List<Fragment> list;
    AdapterServiceProvider adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_serach_name,container,false);
        ButterKnife.bind(this, view);
        list = Controller.getListViewRatingNameFragments("");
        adapter = new AdapterServiceProvider(getActivity(), list, R.layout.fragment_list_view_rating_name);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SearchModel.setPickedProvider(position);
                startActivity(new Intent(getActivity(), AppointmentConfirmActivity.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
            }
        });
        editTextSearchField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            /*
            Setting up listener to track and update list view after
            each letter entered. Other fields for correct anonymous class override.
             */
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                {
                    list = Controller.getListViewRatingNameFragments(s.toString());
                    adapter.clear();
                    adapter.addAll(list);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        /*
        Listener for hiding keyboard each time inputTextView losts user focus
         */
        editTextSearchField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard();
                }
            }

            private void hideKeyboard() {
                if (editTextSearchField != null) {
                    InputMethodManager imanager = (InputMethodManager) getActivity()
                            .getSystemService(Context.INPUT_METHOD_SERVICE);
                    imanager.hideSoftInputFromWindow(editTextSearchField.getWindowToken(), 0);

                }

            }
        });
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextSearchField.setText("");
            }
        });
        return view;
    }

    /*
    Standard Fragment crash safety override method
     */
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
