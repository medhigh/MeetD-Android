package com.example.medhigh.meetmd.control.keepers;

import android.support.v4.app.Fragment;

import com.example.medhigh.meetmd.appointments.DoctorAppointmentFragment;
import com.example.medhigh.meetmd.news.NewsFragment;
import com.example.medhigh.meetmd.reminder.ReminderFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medhigh on 15.10.15.
 */
public class DummyContent {
    public DummyContent() {
        //TODO INIT LISTS
    }
    public static List<Fragment> getDoctorAppointmentFragments(){
        List<Fragment> temp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            temp.add(new DoctorAppointmentFragment());
        }
        return temp;
    }
    public static List<Fragment> getNewsFragments(){
        ArrayList<Fragment> fragList = new ArrayList<Fragment>();
        for (int i = 0; i < 10; i++) {
            fragList.add(new NewsFragment());
        }
        return fragList;
    }
    public static List<Fragment> getReminderFragments(){
        ArrayList<Fragment> fragList = new ArrayList<Fragment>();
        for (int i = 0; i < 3; i++) {
            fragList.add(new ReminderFragment());
        }
        return fragList;
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
