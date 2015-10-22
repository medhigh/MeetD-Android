package com.example.medhigh.meetmd.control.model;

import java.util.List;

import soap.wcf.ServiceProviderXml;

/**
 * Model class which contains data
 */
//This class is in developing stage for now
public class SearchModel {
    private static List<ServiceProviderXml> listNameCurrent;
    private static List<ServiceProviderXml> listSpecCurrent;
    private static int pickedProvider;

    public SearchModel() {
    }

    public static void clearLinks() {
        listNameCurrent = null;
        listSpecCurrent = null;
        pickedProvider = 0;
    }

    public static int getPickedProvider() {
        return pickedProvider;
    }

    public static void setPickedProvider(int pickedProvider) {
        SearchModel.pickedProvider = pickedProvider;
    }

    public static List<ServiceProviderXml> getListNameCurrent() {
        return listNameCurrent;
    }

    public static void setListNameCurrent(List<ServiceProviderXml> listNameCurrent) {
        SearchModel.listNameCurrent = listNameCurrent;
    }

    public static List<ServiceProviderXml> getListSpecCurrent() {
        return listSpecCurrent;
    }

    public static void setListSpecCurrent(List<ServiceProviderXml> listSpecCurrent) {
        SearchModel.listSpecCurrent = listSpecCurrent;
    }

}
