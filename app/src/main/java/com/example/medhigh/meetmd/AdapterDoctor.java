package com.example.medhigh.meetmd;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

/**
 * Created by medhigh on 07.10.15.
 */
public class AdapterDoctor extends ArrayAdapter<Fragment> {
    Context c;
    List<Fragment> f;
    int layout;

    public AdapterDoctor(Context c, List<Fragment> f,@LayoutRes int layout) {
        super(c, layout, f);
        this.layout = layout;
        this.c = c;
        this.f = f;
    }

    @Override
    public View getView(int pos, View v, ViewGroup vg) {
        LayoutInflater i = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return i.inflate(layout, vg, false);
    }
}
