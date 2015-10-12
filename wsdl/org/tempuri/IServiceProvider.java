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
 * 2015-10-12T16:52:33.316+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IServiceProvider")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class, org.datacontract.schemas._2004._07.meetmd_models.ObjectFactory.class})
public interface IServiceProvider {

    @WebMethod(operationName = "ProviderGetAgenda", action = "http://tempuri.org/IServiceProvider/ProviderGetAgenda")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderGetAgenda", output = "http://tempuri.org/IServiceProvider/ProviderGetAgendaResponse")
    @RequestWrapper(localName = "ProviderGetAgenda", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderGetAgenda")
    @ResponseWrapper(localName = "ProviderGetAgendaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderGetAgendaResponse")
    @WebResult(name = "ProviderGetAgendaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotXml providerGetAgenda(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "strartDate", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar strartDate,
        @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar endDate
    );

    @WebMethod(operationName = "ProviderRemoveLocation", action = "http://tempuri.org/IServiceProvider/ProviderRemoveLocation")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderRemoveLocation", output = "http://tempuri.org/IServiceProvider/ProviderRemoveLocationResponse")
    @RequestWrapper(localName = "ProviderRemoveLocation", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderRemoveLocation")
    @ResponseWrapper(localName = "ProviderRemoveLocationResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderRemoveLocationResponse")
    @WebResult(name = "ProviderRemoveLocationResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerRemoveLocation(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "location", targetNamespace = "http://tempuri.org/")
        java.lang.String location
    );

    @WebMethod(operationName = "ProviderFilterAgenda", action = "http://tempuri.org/IServiceProvider/ProviderFilterAgenda")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderFilterAgenda", output = "http://tempuri.org/IServiceProvider/ProviderFilterAgendaResponse")
    @RequestWrapper(localName = "ProviderFilterAgenda", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderFilterAgenda")
    @ResponseWrapper(localName = "ProviderFilterAgendaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderFilterAgendaResponse")
    @WebResult(name = "ProviderFilterAgendaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfAppointmentXml providerFilterAgenda(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "state", targetNamespace = "http://tempuri.org/")
        java.lang.Integer state,
        @WebParam(name = "startDate", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar endDate
    );

    @WebMethod(operationName = "ProviderCreateTimeslot", action = "http://tempuri.org/IServiceProvider/ProviderCreateTimeslot")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderCreateTimeslot", output = "http://tempuri.org/IServiceProvider/ProviderCreateTimeslotResponse")
    @RequestWrapper(localName = "ProviderCreateTimeslot", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCreateTimeslot")
    @ResponseWrapper(localName = "ProviderCreateTimeslotResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCreateTimeslotResponse")
    @WebResult(name = "ProviderCreateTimeslotResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerCreateTimeslot(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "timeslot", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.TimeslotXml timeslot
    );

    @WebMethod(operationName = "ProviderLogout", action = "http://tempuri.org/IServiceProvider/ProviderLogout")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderLogout", output = "http://tempuri.org/IServiceProvider/ProviderLogoutResponse")
    @RequestWrapper(localName = "ProviderLogout", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderLogout")
    @ResponseWrapper(localName = "ProviderLogoutResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderLogoutResponse")
    @WebResult(name = "ProviderLogoutResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerLogout(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken
    );

    @WebMethod(operationName = "ProviderChangeSpeciality", action = "http://tempuri.org/IServiceProvider/ProviderChangeSpeciality")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderChangeSpeciality", output = "http://tempuri.org/IServiceProvider/ProviderChangeSpecialityResponse")
    @RequestWrapper(localName = "ProviderChangeSpeciality", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeSpeciality")
    @ResponseWrapper(localName = "ProviderChangeSpecialityResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeSpecialityResponse")
    @WebResult(name = "ProviderChangeSpecialityResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerChangeSpeciality(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "speciality", targetNamespace = "http://tempuri.org/")
        java.lang.String speciality
    );

    @WebMethod(operationName = "ProviderResetPassword", action = "http://tempuri.org/IServiceProvider/ProviderResetPassword")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderResetPassword", output = "http://tempuri.org/IServiceProvider/ProviderResetPasswordResponse")
    @RequestWrapper(localName = "ProviderResetPassword", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderResetPassword")
    @ResponseWrapper(localName = "ProviderResetPasswordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderResetPasswordResponse")
    @WebResult(name = "ProviderResetPasswordResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerResetPassword(
        @WebParam(name = "providerId", targetNamespace = "http://tempuri.org/")
        java.lang.String providerId
    );

    @WebMethod(operationName = "ProviderCreateAppointment", action = "http://tempuri.org/IServiceProvider/ProviderCreateAppointment")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderCreateAppointment", output = "http://tempuri.org/IServiceProvider/ProviderCreateAppointmentResponse")
    @RequestWrapper(localName = "ProviderCreateAppointment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCreateAppointment")
    @ResponseWrapper(localName = "ProviderCreateAppointmentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCreateAppointmentResponse")
    @WebResult(name = "ProviderCreateAppointmentResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerCreateAppointment(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "timeslotId", targetNamespace = "http://tempuri.org/")
        java.lang.String timeslotId,
        @WebParam(name = "insuranceNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String insuranceNumber
    );

    @WebMethod(operationName = "ProviderChangeAppointment", action = "http://tempuri.org/IServiceProvider/ProviderChangeAppointment")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderChangeAppointment", output = "http://tempuri.org/IServiceProvider/ProviderChangeAppointmentResponse")
    @RequestWrapper(localName = "ProviderChangeAppointment", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeAppointment")
    @ResponseWrapper(localName = "ProviderChangeAppointmentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeAppointmentResponse")
    @WebResult(name = "ProviderChangeAppointmentResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerChangeAppointment(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "appointmentId", targetNamespace = "http://tempuri.org/")
        java.lang.String appointmentId,
        @WebParam(name = "newTimeslot", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.TimeslotXml newTimeslot
    );

    @WebMethod(operationName = "ProviderCreateAppointmentResults", action = "http://tempuri.org/IServiceProvider/ProviderCreateAppointmentResults")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderCreateAppointmentResults", output = "http://tempuri.org/IServiceProvider/ProviderCreateAppointmentResultsResponse")
    @RequestWrapper(localName = "ProviderCreateAppointmentResults", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCreateAppointmentResults")
    @ResponseWrapper(localName = "ProviderCreateAppointmentResultsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCreateAppointmentResultsResponse")
    @WebResult(name = "ProviderCreateAppointmentResultsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerCreateAppointmentResults(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "appointmentId", targetNamespace = "http://tempuri.org/")
        java.lang.String appointmentId,
        @WebParam(name = "results", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AppointmentResultsXml results
    );

    @WebMethod(operationName = "ProviderUnblockTimeslots", action = "http://tempuri.org/IServiceProvider/ProviderUnblockTimeslots")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderUnblockTimeslots", output = "http://tempuri.org/IServiceProvider/ProviderUnblockTimeslotsResponse")
    @RequestWrapper(localName = "ProviderUnblockTimeslots", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderUnblockTimeslots")
    @ResponseWrapper(localName = "ProviderUnblockTimeslotsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderUnblockTimeslotsResponse")
    @WebResult(name = "ProviderUnblockTimeslotsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerUnblockTimeslots(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "timeslotsIds", targetNamespace = "http://tempuri.org/")
        com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring timeslotsIds
    );

    @WebMethod(operationName = "ProviderCancelAppointments", action = "http://tempuri.org/IServiceProvider/ProviderCancelAppointments")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderCancelAppointments", output = "http://tempuri.org/IServiceProvider/ProviderCancelAppointmentsResponse")
    @RequestWrapper(localName = "ProviderCancelAppointments", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCancelAppointments")
    @ResponseWrapper(localName = "ProviderCancelAppointmentsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderCancelAppointmentsResponse")
    @WebResult(name = "ProviderCancelAppointmentsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerCancelAppointments(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "timeslotsIds", targetNamespace = "http://tempuri.org/")
        com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring timeslotsIds,
        @WebParam(name = "cancelReason", targetNamespace = "http://tempuri.org/")
        java.lang.String cancelReason
    );

    @WebMethod(operationName = "ProviderChangeInfo", action = "http://tempuri.org/IServiceProvider/ProviderChangeInfo")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderChangeInfo", output = "http://tempuri.org/IServiceProvider/ProviderChangeInfoResponse")
    @RequestWrapper(localName = "ProviderChangeInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeInfo")
    @ResponseWrapper(localName = "ProviderChangeInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeInfoResponse")
    @WebResult(name = "ProviderChangeInfoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerChangeInfo(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "info", targetNamespace = "http://tempuri.org/")
        java.lang.String info
    );

    @WebMethod(operationName = "ProviderSetAppointmentsPerPatient", action = "http://tempuri.org/IServiceProvider/ProviderSetAppointmentsPerPatient")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderSetAppointmentsPerPatient", output = "http://tempuri.org/IServiceProvider/ProviderSetAppointmentsPerPatientResponse")
    @RequestWrapper(localName = "ProviderSetAppointmentsPerPatient", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderSetAppointmentsPerPatient")
    @ResponseWrapper(localName = "ProviderSetAppointmentsPerPatientResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderSetAppointmentsPerPatientResponse")
    @WebResult(name = "ProviderSetAppointmentsPerPatientResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerSetAppointmentsPerPatient(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "appointmentsCount", targetNamespace = "http://tempuri.org/")
        java.lang.Integer appointmentsCount
    );

    @WebMethod(operationName = "ProviderLogin", action = "http://tempuri.org/IServiceProvider/ProviderLogin")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderLogin", output = "http://tempuri.org/IServiceProvider/ProviderLoginResponse")
    @RequestWrapper(localName = "ProviderLogin", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderLogin")
    @ResponseWrapper(localName = "ProviderLoginResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderLoginResponse")
    @WebResult(name = "ProviderLoginResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml providerLogin(
        @WebParam(name = "providerId", targetNamespace = "http://tempuri.org/")
        java.lang.String providerId,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    @WebMethod(operationName = "ProviderChangePassword", action = "http://tempuri.org/IServiceProvider/ProviderChangePassword")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderChangePassword", output = "http://tempuri.org/IServiceProvider/ProviderChangePasswordResponse")
    @RequestWrapper(localName = "ProviderChangePassword", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangePassword")
    @ResponseWrapper(localName = "ProviderChangePasswordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangePasswordResponse")
    @WebResult(name = "ProviderChangePasswordResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerChangePassword(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    @WebMethod(operationName = "ProviderAddLocation", action = "http://tempuri.org/IServiceProvider/ProviderAddLocation")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderAddLocation", output = "http://tempuri.org/IServiceProvider/ProviderAddLocationResponse")
    @RequestWrapper(localName = "ProviderAddLocation", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderAddLocation")
    @ResponseWrapper(localName = "ProviderAddLocationResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderAddLocationResponse")
    @WebResult(name = "ProviderAddLocationResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerAddLocation(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "location", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.LocationXml location
    );

    @WebMethod(operationName = "ProviderRemoveTimeslotPattern", action = "http://tempuri.org/IServiceProvider/ProviderRemoveTimeslotPattern")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderRemoveTimeslotPattern", output = "http://tempuri.org/IServiceProvider/ProviderRemoveTimeslotPatternResponse")
    @RequestWrapper(localName = "ProviderRemoveTimeslotPattern", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderRemoveTimeslotPattern")
    @ResponseWrapper(localName = "ProviderRemoveTimeslotPatternResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderRemoveTimeslotPatternResponse")
    @WebResult(name = "ProviderRemoveTimeslotPatternResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerRemoveTimeslotPattern(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "patternId", targetNamespace = "http://tempuri.org/")
        java.lang.String patternId
    );

    @WebMethod(operationName = "ProviderGenerateAgenda", action = "http://tempuri.org/IServiceProvider/ProviderGenerateAgenda")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderGenerateAgenda", output = "http://tempuri.org/IServiceProvider/ProviderGenerateAgendaResponse")
    @RequestWrapper(localName = "ProviderGenerateAgenda", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderGenerateAgenda")
    @ResponseWrapper(localName = "ProviderGenerateAgendaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderGenerateAgendaResponse")
    @WebResult(name = "ProviderGenerateAgendaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotPatternXml providerGenerateAgenda(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "period", targetNamespace = "http://tempuri.org/")
        java.lang.Integer period,
        @WebParam(name = "pattern", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotPatternXml pattern
    );

    @WebMethod(operationName = "ProviderChangeContacts", action = "http://tempuri.org/IServiceProvider/ProviderChangeContacts")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderChangeContacts", output = "http://tempuri.org/IServiceProvider/ProviderChangeContactsResponse")
    @RequestWrapper(localName = "ProviderChangeContacts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeContacts")
    @ResponseWrapper(localName = "ProviderChangeContactsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderChangeContactsResponse")
    @WebResult(name = "ProviderChangeContactsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerChangeContacts(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "contacts", targetNamespace = "http://tempuri.org/")
        java.lang.String contacts
    );

    @WebMethod(operationName = "ProviderAddTimeslotPattern", action = "http://tempuri.org/IServiceProvider/ProviderAddTimeslotPattern")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderAddTimeslotPattern", output = "http://tempuri.org/IServiceProvider/ProviderAddTimeslotPatternResponse")
    @RequestWrapper(localName = "ProviderAddTimeslotPattern", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderAddTimeslotPattern")
    @ResponseWrapper(localName = "ProviderAddTimeslotPatternResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderAddTimeslotPatternResponse")
    @WebResult(name = "ProviderAddTimeslotPatternResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerAddTimeslotPattern(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "pattern", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.TimeslotPatternXml pattern
    );

    @WebMethod(operationName = "ProviderBlockTimeslots", action = "http://tempuri.org/IServiceProvider/ProviderBlockTimeslots")
    @Action(input = "http://tempuri.org/IServiceProvider/ProviderBlockTimeslots", output = "http://tempuri.org/IServiceProvider/ProviderBlockTimeslotsResponse")
    @RequestWrapper(localName = "ProviderBlockTimeslots", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderBlockTimeslots")
    @ResponseWrapper(localName = "ProviderBlockTimeslotsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProviderBlockTimeslotsResponse")
    @WebResult(name = "ProviderBlockTimeslotsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean providerBlockTimeslots(
        @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml authToken,
        @WebParam(name = "timeslotsIds", targetNamespace = "http://tempuri.org/")
        com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring timeslotsIds
    );
}
