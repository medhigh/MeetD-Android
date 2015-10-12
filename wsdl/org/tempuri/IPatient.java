package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-10-12T16:52:33.368+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IPatient")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class, org.datacontract.schemas._2004._07.meetmd_models.ObjectFactory.class})
public interface IPatient {

    @WebMethod(operationName = "PatientSearchProviderByName", action = "http://tempuri.org/IPatient/PatientSearchProviderByName")
    @Action(input = "http://tempuri.org/IPatient/PatientSearchProviderByName", output = "http://tempuri.org/IPatient/PatientSearchProviderByNameResponse")
    @RequestWrapper(localName = "PatientSearchProviderByName", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderByName")
    @ResponseWrapper(localName = "PatientSearchProviderByNameResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderByNameResponse")
    @WebResult(name = "PatientSearchProviderByNameResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfServiceProviderXml patientSearchProviderByName(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "providerNamePattern", targetNamespace = "http://tempuri.org/")
        java.lang.String providerNamePattern
    );

    @WebMethod(operationName = "PatientChangeAppointment", action = "http://tempuri.org/IPatient/PatientChangeAppointment")
    @Action(input = "http://tempuri.org/IPatient/PatientChangeAppointment", output = "http://tempuri.org/IPatient/PatientChangeAppointmentResponse")
    @RequestWrapper(localName = "PatientChangeAppointment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientChangeAppointment")
    @ResponseWrapper(localName = "PatientChangeAppointmentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientChangeAppointmentResponse")
    @WebResult(name = "PatientChangeAppointmentResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientChangeAppointment(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "appointmentId", targetNamespace = "http://tempuri.org/")
        java.lang.String appointmentId,
        @WebParam(name = "newTimeslotId", targetNamespace = "http://tempuri.org/")
        java.lang.String newTimeslotId
    );

    @WebMethod(operationName = "PatientCancelAppointment", action = "http://tempuri.org/IPatient/PatientCancelAppointment")
    @Action(input = "http://tempuri.org/IPatient/PatientCancelAppointment", output = "http://tempuri.org/IPatient/PatientCancelAppointmentResponse")
    @RequestWrapper(localName = "PatientCancelAppointment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCancelAppointment")
    @ResponseWrapper(localName = "PatientCancelAppointmentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCancelAppointmentResponse")
    @WebResult(name = "PatientCancelAppointmentResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientCancelAppointment(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "appointmentId", targetNamespace = "http://tempuri.org/")
        java.lang.String appointmentId
    );

    @WebMethod(operationName = "PatientSearchProviderBySpeciality", action = "http://tempuri.org/IPatient/PatientSearchProviderBySpeciality")
    @Action(input = "http://tempuri.org/IPatient/PatientSearchProviderBySpeciality", output = "http://tempuri.org/IPatient/PatientSearchProviderBySpecialityResponse")
    @RequestWrapper(localName = "PatientSearchProviderBySpeciality", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderBySpeciality")
    @ResponseWrapper(localName = "PatientSearchProviderBySpecialityResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderBySpecialityResponse")
    @WebResult(name = "PatientSearchProviderBySpecialityResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfServiceProviderXml patientSearchProviderBySpeciality(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "speciality", targetNamespace = "http://tempuri.org/")
        java.lang.String speciality
    );

    @WebMethod(operationName = "PatientLogin", action = "http://tempuri.org/IPatient/PatientLogin")
    @Action(input = "http://tempuri.org/IPatient/PatientLogin", output = "http://tempuri.org/IPatient/PatientLoginResponse")
    @RequestWrapper(localName = "PatientLogin", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientLogin")
    @ResponseWrapper(localName = "PatientLoginResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientLoginResponse")
    @WebResult(name = "PatientLoginResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml patientLogin(
        @WebParam(name = "insuranceNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String insuranceNumber,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    @WebMethod(operationName = "PatientGetReminders", action = "http://tempuri.org/IPatient/PatientGetReminders")
    @Action(input = "http://tempuri.org/IPatient/PatientGetReminders", output = "http://tempuri.org/IPatient/PatientGetRemindersResponse")
    @RequestWrapper(localName = "PatientGetReminders", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetReminders")
    @ResponseWrapper(localName = "PatientGetRemindersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetRemindersResponse")
    @WebResult(name = "PatientGetRemindersResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfPatientReminderXml patientGetReminders(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken
    );

    @WebMethod(operationName = "PatientGetAgenda", action = "http://tempuri.org/IPatient/PatientGetAgenda")
    @Action(input = "http://tempuri.org/IPatient/PatientGetAgenda", output = "http://tempuri.org/IPatient/PatientGetAgendaResponse")
    @RequestWrapper(localName = "PatientGetAgenda", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetAgenda")
    @ResponseWrapper(localName = "PatientGetAgendaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetAgendaResponse")
    @WebResult(name = "PatientGetAgendaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotXml patientGetAgenda(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "providerId", targetNamespace = "http://tempuri.org/")
        java.lang.String providerId
    );

    @WebMethod(operationName = "PatientLogout", action = "http://tempuri.org/IPatient/PatientLogout")
    @Action(input = "http://tempuri.org/IPatient/PatientLogout", output = "http://tempuri.org/IPatient/PatientLogoutResponse")
    @RequestWrapper(localName = "PatientLogout", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientLogout")
    @ResponseWrapper(localName = "PatientLogoutResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientLogoutResponse")
    @WebResult(name = "PatientLogoutResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientLogout(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken
    );

    @WebMethod(operationName = "PatientGetInfo", action = "http://tempuri.org/IPatient/PatientGetInfo")
    @Action(input = "http://tempuri.org/IPatient/PatientGetInfo", output = "http://tempuri.org/IPatient/PatientGetInfoResponse")
    @RequestWrapper(localName = "PatientGetInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetInfo")
    @ResponseWrapper(localName = "PatientGetInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetInfoResponse")
    @WebResult(name = "PatientGetInfoResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfInfoRecordXml patientGetInfo(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "offset", targetNamespace = "http://tempuri.org/")
        java.lang.Integer offset,
        @WebParam(name = "limit", targetNamespace = "http://tempuri.org/")
        java.lang.Integer limit
    );

    @WebMethod(operationName = "PatientResetPassword", action = "http://tempuri.org/IPatient/PatientResetPassword")
    @Action(input = "http://tempuri.org/IPatient/PatientResetPassword", output = "http://tempuri.org/IPatient/PatientResetPasswordResponse")
    @RequestWrapper(localName = "PatientResetPassword", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientResetPassword")
    @ResponseWrapper(localName = "PatientResetPasswordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientResetPasswordResponse")
    @WebResult(name = "PatientResetPasswordResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientResetPassword(
        @WebParam(name = "insuranceNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String insuranceNumber
    );

    @WebMethod(operationName = "PatientRemoveReminder", action = "http://tempuri.org/IPatient/PatientRemoveReminder")
    @Action(input = "http://tempuri.org/IPatient/PatientRemoveReminder", output = "http://tempuri.org/IPatient/PatientRemoveReminderResponse")
    @RequestWrapper(localName = "PatientRemoveReminder", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientRemoveReminder")
    @ResponseWrapper(localName = "PatientRemoveReminderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientRemoveReminderResponse")
    @WebResult(name = "PatientRemoveReminderResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientRemoveReminder(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "reminderId", targetNamespace = "http://tempuri.org/")
        java.lang.String reminderId
    );

    @WebMethod(operationName = "PatientGetHospitalsByCoordinates", action = "http://tempuri.org/IPatient/PatientGetHospitalsByCoordinates")
    @Action(input = "http://tempuri.org/IPatient/PatientGetHospitalsByCoordinates", output = "http://tempuri.org/IPatient/PatientGetHospitalsByCoordinatesResponse")
    @RequestWrapper(localName = "PatientGetHospitalsByCoordinates", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetHospitalsByCoordinates")
    @ResponseWrapper(localName = "PatientGetHospitalsByCoordinatesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetHospitalsByCoordinatesResponse")
    @WebResult(name = "PatientGetHospitalsByCoordinatesResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfHospitalXml patientGetHospitalsByCoordinates(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "coordinates", targetNamespace = "http://tempuri.org/")
        java.lang.String coordinates,
        @WebParam(name = "range", targetNamespace = "http://tempuri.org/")
        java.lang.Integer range
    );

    @WebMethod(operationName = "PatientGetSpecialities", action = "http://tempuri.org/IPatient/PatientGetSpecialities")
    @Action(input = "http://tempuri.org/IPatient/PatientGetSpecialities", output = "http://tempuri.org/IPatient/PatientGetSpecialitiesResponse")
    @RequestWrapper(localName = "PatientGetSpecialities", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetSpecialities")
    @ResponseWrapper(localName = "PatientGetSpecialitiesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetSpecialitiesResponse")
    @WebResult(name = "PatientGetSpecialitiesResult", targetNamespace = "http://tempuri.org/")
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring patientGetSpecialities(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken
    );

    @WebMethod(operationName = "PatientGetAppointments", action = "http://tempuri.org/IPatient/PatientGetAppointments")
    @Action(input = "http://tempuri.org/IPatient/PatientGetAppointments", output = "http://tempuri.org/IPatient/PatientGetAppointmentsResponse")
    @RequestWrapper(localName = "PatientGetAppointments", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetAppointments")
    @ResponseWrapper(localName = "PatientGetAppointmentsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetAppointmentsResponse")
    @WebResult(name = "PatientGetAppointmentsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientGetAppointments(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "strartDate", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar strartDate,
        @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar endDate
    );

    @WebMethod(operationName = "PatientCreateReminder", action = "http://tempuri.org/IPatient/PatientCreateReminder")
    @Action(input = "http://tempuri.org/IPatient/PatientCreateReminder", output = "http://tempuri.org/IPatient/PatientCreateReminderResponse")
    @RequestWrapper(localName = "PatientCreateReminder", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCreateReminder")
    @ResponseWrapper(localName = "PatientCreateReminderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCreateReminderResponse")
    @WebResult(name = "PatientCreateReminderResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientCreateReminder(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "reminder", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.PatientReminderXml reminder
    );

    @WebMethod(operationName = "PatientJoinWaitinglistSpeciality", action = "http://tempuri.org/IPatient/PatientJoinWaitinglistSpeciality")
    @Action(input = "http://tempuri.org/IPatient/PatientJoinWaitinglistSpeciality", output = "http://tempuri.org/IPatient/PatientJoinWaitinglistSpecialityResponse")
    @RequestWrapper(localName = "PatientJoinWaitinglistSpeciality", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientJoinWaitinglistSpeciality")
    @ResponseWrapper(localName = "PatientJoinWaitinglistSpecialityResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientJoinWaitinglistSpecialityResponse")
    @WebResult(name = "PatientJoinWaitinglistSpecialityResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientJoinWaitinglistSpeciality(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "speciality", targetNamespace = "http://tempuri.org/")
        java.lang.String speciality,
        @WebParam(name = "region", targetNamespace = "http://tempuri.org/")
        java.lang.String region
    );

    @WebMethod(operationName = "PatientSearchProviderByAddress", action = "http://tempuri.org/IPatient/PatientSearchProviderByAddress")
    @Action(input = "http://tempuri.org/IPatient/PatientSearchProviderByAddress", output = "http://tempuri.org/IPatient/PatientSearchProviderByAddressResponse")
    @RequestWrapper(localName = "PatientSearchProviderByAddress", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderByAddress")
    @ResponseWrapper(localName = "PatientSearchProviderByAddressResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderByAddressResponse")
    @WebResult(name = "PatientSearchProviderByAddressResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfServiceProviderXml patientSearchProviderByAddress(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "address", targetNamespace = "http://tempuri.org/")
        java.lang.String address,
        @WebParam(name = "range", targetNamespace = "http://tempuri.org/")
        java.lang.Integer range
    );

    @WebMethod(operationName = "PatientJoinWaitinglistProvider", action = "http://tempuri.org/IPatient/PatientJoinWaitinglistProvider")
    @Action(input = "http://tempuri.org/IPatient/PatientJoinWaitinglistProvider", output = "http://tempuri.org/IPatient/PatientJoinWaitinglistProviderResponse")
    @RequestWrapper(localName = "PatientJoinWaitinglistProvider", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientJoinWaitinglistProvider")
    @ResponseWrapper(localName = "PatientJoinWaitinglistProviderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientJoinWaitinglistProviderResponse")
    @WebResult(name = "PatientJoinWaitinglistProviderResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientJoinWaitinglistProvider(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "providerId", targetNamespace = "http://tempuri.org/")
        java.lang.String providerId
    );

    @WebMethod(operationName = "PatientGetSurveys", action = "http://tempuri.org/IPatient/PatientGetSurveys")
    @Action(input = "http://tempuri.org/IPatient/PatientGetSurveys", output = "http://tempuri.org/IPatient/PatientGetSurveysResponse")
    @RequestWrapper(localName = "PatientGetSurveys", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetSurveys")
    @ResponseWrapper(localName = "PatientGetSurveysResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetSurveysResponse")
    @WebResult(name = "PatientGetSurveysResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfCustomerSurveyXml patientGetSurveys(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "surveyState", targetNamespace = "http://tempuri.org/")
        java.lang.Integer surveyState
    );

    @WebMethod(operationName = "PatientFillinSurvey", action = "http://tempuri.org/IPatient/PatientFillinSurvey")
    @Action(input = "http://tempuri.org/IPatient/PatientFillinSurvey", output = "http://tempuri.org/IPatient/PatientFillinSurveyResponse")
    @RequestWrapper(localName = "PatientFillinSurvey", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientFillinSurvey")
    @ResponseWrapper(localName = "PatientFillinSurveyResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientFillinSurveyResponse")
    @WebResult(name = "PatientFillinSurveyResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientFillinSurvey(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
        java.lang.String surveyId,
        @WebParam(name = "results", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.ArrayOfCustomerSurveyResultXml results
    );

    @WebMethod(operationName = "PatientCheckRegistered", action = "http://tempuri.org/IPatient/PatientCheckRegistered")
    @Action(input = "http://tempuri.org/IPatient/PatientCheckRegistered", output = "http://tempuri.org/IPatient/PatientCheckRegisteredResponse")
    @RequestWrapper(localName = "PatientCheckRegistered", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCheckRegistered")
    @ResponseWrapper(localName = "PatientCheckRegisteredResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCheckRegisteredResponse")
    @WebResult(name = "PatientCheckRegisteredResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientCheckRegistered(
        @WebParam(name = "insuranceNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String insuranceNumber
    );

    @WebMethod(operationName = "PatientGetHospitalsByAddress", action = "http://tempuri.org/IPatient/PatientGetHospitalsByAddress")
    @Action(input = "http://tempuri.org/IPatient/PatientGetHospitalsByAddress", output = "http://tempuri.org/IPatient/PatientGetHospitalsByAddressResponse")
    @RequestWrapper(localName = "PatientGetHospitalsByAddress", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetHospitalsByAddress")
    @ResponseWrapper(localName = "PatientGetHospitalsByAddressResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientGetHospitalsByAddressResponse")
    @WebResult(name = "PatientGetHospitalsByAddressResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfHospitalXml patientGetHospitalsByAddress(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "address", targetNamespace = "http://tempuri.org/")
        java.lang.String address,
        @WebParam(name = "range", targetNamespace = "http://tempuri.org/")
        java.lang.Integer range
    );

    @WebMethod(operationName = "PatientChangePassword", action = "http://tempuri.org/IPatient/PatientChangePassword")
    @Action(input = "http://tempuri.org/IPatient/PatientChangePassword", output = "http://tempuri.org/IPatient/PatientChangePasswordResponse")
    @RequestWrapper(localName = "PatientChangePassword", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientChangePassword")
    @ResponseWrapper(localName = "PatientChangePasswordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientChangePasswordResponse")
    @WebResult(name = "PatientChangePasswordResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientChangePassword(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    @WebMethod(operationName = "PatientCreateAppointment", action = "http://tempuri.org/IPatient/PatientCreateAppointment")
    @Action(input = "http://tempuri.org/IPatient/PatientCreateAppointment", output = "http://tempuri.org/IPatient/PatientCreateAppointmentResponse")
    @RequestWrapper(localName = "PatientCreateAppointment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCreateAppointment")
    @ResponseWrapper(localName = "PatientCreateAppointmentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientCreateAppointmentResponse")
    @WebResult(name = "PatientCreateAppointmentResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean patientCreateAppointment(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "timeslotId", targetNamespace = "http://tempuri.org/")
        java.lang.String timeslotId
    );

    @WebMethod(operationName = "PatientSearchProviderByCoordinates", action = "http://tempuri.org/IPatient/PatientSearchProviderByCoordinates")
    @Action(input = "http://tempuri.org/IPatient/PatientSearchProviderByCoordinates", output = "http://tempuri.org/IPatient/PatientSearchProviderByCoordinatesResponse")
    @RequestWrapper(localName = "PatientSearchProviderByCoordinates", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderByCoordinates")
    @ResponseWrapper(localName = "PatientSearchProviderByCoordinatesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PatientSearchProviderByCoordinatesResponse")
    @WebResult(name = "PatientSearchProviderByCoordinatesResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfServiceProviderXml patientSearchProviderByCoordinates(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "coordinates", targetNamespace = "http://tempuri.org/")
        java.lang.String coordinates,
        @WebParam(name = "range", targetNamespace = "http://tempuri.org/")
        java.lang.Integer range
    );
}
