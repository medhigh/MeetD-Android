package com.example.medhigh.meetmd.control.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Dummy Adapter Fragment class for non-real content
 */
public class AdapterServiceProvider extends ArrayAdapter<Fragment> {
    Context c;
    List<Fragment> f;
    int layout;

    public AdapterServiceProvider(Context c, List<Fragment> f, @LayoutRes int layout) {
        super(c, layout, f);
        this.layout = layout;
        this.c = c;
        this.f = f;
    }

    // View Holder pattern will be added after core connection
    @Override
    public View getView(int pos, View v, ViewGroup vg) {
        LayoutInflater i = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return i.inflate(layout, vg, false);
    }
}
