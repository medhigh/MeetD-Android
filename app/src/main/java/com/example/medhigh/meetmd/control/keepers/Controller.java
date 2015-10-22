package com.example.medhigh.meetmd.control.keepers;


import android.support.v4.app.Fragment;

import com.example.medhigh.meetmd.appointments.DoctorAppointmentFragment;
import com.example.medhigh.meetmd.news.NewsFragment;
import com.example.medhigh.meetmd.reminder.ReminderFragment;
import com.example.medhigh.meetmd.search.ListViewRatingNameFragment;
import com.example.medhigh.meetmd.search.ListViewSpecFragment;
import com.example.medhigh.meetmd.survey.SurveyDoctorFragment;
import com.example.medhigh.meetmd.timeChooseFragment.SearchDoctorShortInfoFragment;

import java.util.List;

/**
 * This class is middle essence between view controllers and Model presentation.
 * Also this class Manipulates Model structures, and via getting data from there,
 * convert and return already set-up Fragments for view.
 * Views working with this controller, this controller works with Model classes and wsdl.
 */

//TODO write actual constructors in Fragment classes for correct inflating with resources from this class
public class Controller {
    private static Controller controller;
    private Controller(){
        controller = new Controller();
    }

    public static List<Fragment> getDoctorAppointmentFragments(){
        return DummyContent.getInitFragments((new DoctorAppointmentFragment()).getClass(), 10);
    }

    public static List<Fragment> getNewsFragments(){
        return DummyContent.getInitFragments((new NewsFragment()).getClass(), 10);
    }

    public static List<Fragment> getReminderFragments(){
        return DummyContent.getInitFragments((new ReminderFragment()).getClass(),4);
    }

    public static List<Fragment> getListViewRatingNameFragments(String providerNamePattern) {
        //todo set same collection into SearchModel.currentList & listName|Spec
        return DummyContent.getInitFragments((new ListViewRatingNameFragment()).getClass(),40);
    }

    public static List<Fragment> getListViewSpecialityFragments(String specNamePattern) {
        return DummyContent.getInitFragments((new ListViewSpecFragment()).getClass(), 40);
    }

    public static List<Fragment> getSurveyDoctorFragments(){
        return DummyContent.getInitFragments((new SurveyDoctorFragment()).getClass(),10);
    }

    public static List<Fragment> getSearchDoctorShortInfoFragments(){
        //get entrance list from SearchModel
        return DummyContent.getInitFragments((new SearchDoctorShortInfoFragment()).getClass(), 5);
    }

    public static boolean cancelAppointment(String ID, Reason reason) {
        return true;
    }

    public static boolean PatientCreateAppointment(String timeslot) {
        return true;
    }

    public Controller getInstance() {
        if (controller != null) {
            return controller;
        } else {
            controller = new Controller();
            return controller;
        }
    }

    public enum Reason {
        REASON_DONT_NEED_A_DOCTOR, REASON_HAVE_CHOOSEN_ANOTHER_DOCTOR
    }
}
