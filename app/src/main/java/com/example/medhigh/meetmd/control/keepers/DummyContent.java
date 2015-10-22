package com.example.medhigh.meetmd.control.keepers;

import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for dummy collections inflating
 */
public class DummyContent {
    public DummyContent() {
    }
    public static <T extends Fragment> List<Fragment> getInitFragments(Class<T> aClass,int amount){
        List<Fragment> temp = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            try {
                temp.add(aClass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return temp;
    }

}
