package com.example.medhigh.meetmd.control.keepers;


import android.support.v4.app.Fragment;

import com.example.medhigh.meetmd.appointments.DoctorAppointmentFragment;
import com.example.medhigh.meetmd.news.NewsFragment;
import com.example.medhigh.meetmd.reminder.ReminderFragment;
import com.example.medhigh.meetmd.search.ListViewRatingNameFragment;
import com.example.medhigh.meetmd.survey.SurveyDoctorFragment;
import com.example.medhigh.meetmd.timeChooseFragment.SearchDoctorShortInfo;

import java.util.List;

/**
 * Created by medhigh on 15.10.15.
 */

//TODO write actual constructors in Fragment classes for correct inflating with resources from this class
public class Controller {
    private static Controller controller;
    private Controller(){
        controller = new Controller();
    }
    public Controller getInstance(){
        if (controller != null) {
            return controller;
        }else {
            controller = new Controller();
            return controller;
        }
    }
    public static List<Fragment> getDoctorAppointmentFragments(){
        //TODO convert List<T> to List<Fragment> without memory lick
        return DummyContent.getInitFragments((new DoctorAppointmentFragment()).getClass(), 10);
    }
    public static List<Fragment> getNewsFragments(){
        return DummyContent.getInitFragments((new NewsFragment()).getClass(), 10);
    }
    public static List<Fragment> getReminderFragments(){
        return DummyContent.getInitFragments((new ReminderFragment()).getClass(),4);
    }
    public static List<Fragment> getListViewRatingNameFragments(){
        return DummyContent.getInitFragments((new ListViewRatingNameFragment()).getClass(),40);
    }
    public static List<Fragment> getSurveyDoctorFragments(){
        return DummyContent.getInitFragments((new SurveyDoctorFragment()).getClass(),10);
    }
    public static List<Fragment> getSearchDoctorShortInfoFragments(){
        return DummyContent.getInitFragments((new SearchDoctorShortInfo()).getClass(),3);
    }
}
