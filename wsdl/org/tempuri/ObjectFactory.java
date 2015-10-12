
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.meetmd_models.AppointmentResultsXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfAppointmentXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfCustomerSurveyResultXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfCustomerSurveyXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfHospitalXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfInfoRecordXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfPatientReminderXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfServiceProviderXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotPatternXml;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotXml;
import org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml;
import org.datacontract.schemas._2004._07.meetmd_models.LocationXml;
import org.datacontract.schemas._2004._07.meetmd_models.PatientReminderXml;
import org.datacontract.schemas._2004._07.meetmd_models.TimeslotPatternXml;
import org.datacontract.schemas._2004._07.meetmd_models.TimeslotXml;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PatientGetInfoAuthToken_QNAME = new QName("http://tempuri.org/", "authToken");
    private final static QName _ProviderGenerateAgendaResponseProviderGenerateAgendaResult_QNAME = new QName("http://tempuri.org/", "ProviderGenerateAgendaResult");
    private final static QName _PatientCreateReminderReminder_QNAME = new QName("http://tempuri.org/", "reminder");
    private final static QName _PatientGetHospitalsByCoordinatesResponsePatientGetHospitalsByCoordinatesResult_QNAME = new QName("http://tempuri.org/", "PatientGetHospitalsByCoordinatesResult");
    private final static QName _PatientSearchProviderByCoordinatesCoordinates_QNAME = new QName("http://tempuri.org/", "coordinates");
    private final static QName _ProviderCreateTimeslotTimeslot_QNAME = new QName("http://tempuri.org/", "timeslot");
    private final static QName _ProviderLoginResponseProviderLoginResult_QNAME = new QName("http://tempuri.org/", "ProviderLoginResult");
    private final static QName _ProviderChangeInfoInfo_QNAME = new QName("http://tempuri.org/", "info");
    private final static QName _PatientSearchProviderByNameResponsePatientSearchProviderByNameResult_QNAME = new QName("http://tempuri.org/", "PatientSearchProviderByNameResult");
    private final static QName _PatientCreateAppointmentTimeslotId_QNAME = new QName("http://tempuri.org/", "timeslotId");
    private final static QName _PatientCancelAppointmentAppointmentId_QNAME = new QName("http://tempuri.org/", "appointmentId");
    private final static QName _PatientResetPasswordInsuranceNumber_QNAME = new QName("http://tempuri.org/", "insuranceNumber");
    private final static QName _PatientSearchProviderBySpecialityResponsePatientSearchProviderBySpecialityResult_QNAME = new QName("http://tempuri.org/", "PatientSearchProviderBySpecialityResult");
    private final static QName _ProviderRemoveTimeslotPatternPatternId_QNAME = new QName("http://tempuri.org/", "patternId");
    private final static QName _ProviderCreateAppointmentResultsResults_QNAME = new QName("http://tempuri.org/", "results");
    private final static QName _ProviderAddTimeslotPatternPattern_QNAME = new QName("http://tempuri.org/", "pattern");
    private final static QName _PatientJoinWaitinglistSpecialitySpeciality_QNAME = new QName("http://tempuri.org/", "speciality");
    private final static QName _PatientJoinWaitinglistSpecialityRegion_QNAME = new QName("http://tempuri.org/", "region");
    private final static QName _ProviderRemoveLocationLocation_QNAME = new QName("http://tempuri.org/", "location");
    private final static QName _PatientJoinWaitinglistProviderProviderId_QNAME = new QName("http://tempuri.org/", "providerId");
    private final static QName _PatientGetInfoResponsePatientGetInfoResult_QNAME = new QName("http://tempuri.org/", "PatientGetInfoResult");
    private final static QName _ProviderChangePasswordPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _ProviderBlockTimeslotsTimeslotsIds_QNAME = new QName("http://tempuri.org/", "timeslotsIds");
    private final static QName _PatientChangeAppointmentNewTimeslotId_QNAME = new QName("http://tempuri.org/", "newTimeslotId");
    private final static QName _PatientSearchProviderByNameProviderNamePattern_QNAME = new QName("http://tempuri.org/", "providerNamePattern");
    private final static QName _PatientFillinSurveySurveyId_QNAME = new QName("http://tempuri.org/", "surveyId");
    private final static QName _PatientGetHospitalsByAddressAddress_QNAME = new QName("http://tempuri.org/", "address");
    private final static QName _PatientGetAgendaResponsePatientGetAgendaResult_QNAME = new QName("http://tempuri.org/", "PatientGetAgendaResult");
    private final static QName _PatientGetSurveysResponsePatientGetSurveysResult_QNAME = new QName("http://tempuri.org/", "PatientGetSurveysResult");
    private final static QName _PatientGetRemindersResponsePatientGetRemindersResult_QNAME = new QName("http://tempuri.org/", "PatientGetRemindersResult");
    private final static QName _PatientLoginResponsePatientLoginResult_QNAME = new QName("http://tempuri.org/", "PatientLoginResult");
    private final static QName _PatientSearchProviderByCoordinatesResponsePatientSearchProviderByCoordinatesResult_QNAME = new QName("http://tempuri.org/", "PatientSearchProviderByCoordinatesResult");
    private final static QName _ProviderGetAgendaResponseProviderGetAgendaResult_QNAME = new QName("http://tempuri.org/", "ProviderGetAgendaResult");
    private final static QName _ProviderChangeAppointmentNewTimeslot_QNAME = new QName("http://tempuri.org/", "newTimeslot");
    private final static QName _PatientSearchProviderByAddressResponsePatientSearchProviderByAddressResult_QNAME = new QName("http://tempuri.org/", "PatientSearchProviderByAddressResult");
    private final static QName _ProviderCancelAppointmentsCancelReason_QNAME = new QName("http://tempuri.org/", "cancelReason");
    private final static QName _ProviderChangeContactsContacts_QNAME = new QName("http://tempuri.org/", "contacts");
    private final static QName _PatientGetHospitalsByAddressResponsePatientGetHospitalsByAddressResult_QNAME = new QName("http://tempuri.org/", "PatientGetHospitalsByAddressResult");
    private final static QName _PatientGetSpecialitiesResponsePatientGetSpecialitiesResult_QNAME = new QName("http://tempuri.org/", "PatientGetSpecialitiesResult");
    private final static QName _PatientRemoveReminderReminderId_QNAME = new QName("http://tempuri.org/", "reminderId");
    private final static QName _ProviderFilterAgendaResponseProviderFilterAgendaResult_QNAME = new QName("http://tempuri.org/", "ProviderFilterAgendaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProviderLogin }
     * 
     */
    public ProviderLogin createProviderLogin() {
        return new ProviderLogin();
    }

    /**
     * Create an instance of {@link PatientCancelAppointmentResponse }
     * 
     */
    public PatientCancelAppointmentResponse createPatientCancelAppointmentResponse() {
        return new PatientCancelAppointmentResponse();
    }

    /**
     * Create an instance of {@link ProviderChangeInfo }
     * 
     */
    public ProviderChangeInfo createProviderChangeInfo() {
        return new ProviderChangeInfo();
    }

    /**
     * Create an instance of {@link PatientChangePasswordResponse }
     * 
     */
    public PatientChangePasswordResponse createPatientChangePasswordResponse() {
        return new PatientChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ProviderChangePassword }
     * 
     */
    public ProviderChangePassword createProviderChangePassword() {
        return new ProviderChangePassword();
    }

    /**
     * Create an instance of {@link ProviderChangeContactsResponse }
     * 
     */
    public ProviderChangeContactsResponse createProviderChangeContactsResponse() {
        return new ProviderChangeContactsResponse();
    }

    /**
     * Create an instance of {@link PatientLogoutResponse }
     * 
     */
    public PatientLogoutResponse createPatientLogoutResponse() {
        return new PatientLogoutResponse();
    }

    /**
     * Create an instance of {@link PatientChangeAppointmentResponse }
     * 
     */
    public PatientChangeAppointmentResponse createPatientChangeAppointmentResponse() {
        return new PatientChangeAppointmentResponse();
    }

    /**
     * Create an instance of {@link PatientGetHospitalsByCoordinates }
     * 
     */
    public PatientGetHospitalsByCoordinates createPatientGetHospitalsByCoordinates() {
        return new PatientGetHospitalsByCoordinates();
    }

    /**
     * Create an instance of {@link ProviderBlockTimeslots }
     * 
     */
    public ProviderBlockTimeslots createProviderBlockTimeslots() {
        return new ProviderBlockTimeslots();
    }

    /**
     * Create an instance of {@link ProviderAddLocation }
     * 
     */
    public ProviderAddLocation createProviderAddLocation() {
        return new ProviderAddLocation();
    }

    /**
     * Create an instance of {@link ProviderSetAppointmentsPerPatientResponse }
     * 
     */
    public ProviderSetAppointmentsPerPatientResponse createProviderSetAppointmentsPerPatientResponse() {
        return new ProviderSetAppointmentsPerPatientResponse();
    }

    /**
     * Create an instance of {@link PatientSearchProviderBySpecialityResponse }
     * 
     */
    public PatientSearchProviderBySpecialityResponse createPatientSearchProviderBySpecialityResponse() {
        return new PatientSearchProviderBySpecialityResponse();
    }

    /**
     * Create an instance of {@link PatientGetHospitalsByCoordinatesResponse }
     * 
     */
    public PatientGetHospitalsByCoordinatesResponse createPatientGetHospitalsByCoordinatesResponse() {
        return new PatientGetHospitalsByCoordinatesResponse();
    }

    /**
     * Create an instance of {@link ProviderCreateAppointmentResultsResponse }
     * 
     */
    public ProviderCreateAppointmentResultsResponse createProviderCreateAppointmentResultsResponse() {
        return new ProviderCreateAppointmentResultsResponse();
    }

    /**
     * Create an instance of {@link PatientGetAgendaResponse }
     * 
     */
    public PatientGetAgendaResponse createPatientGetAgendaResponse() {
        return new PatientGetAgendaResponse();
    }

    /**
     * Create an instance of {@link ProviderGetAgenda }
     * 
     */
    public ProviderGetAgenda createProviderGetAgenda() {
        return new ProviderGetAgenda();
    }

    /**
     * Create an instance of {@link PatientSearchProviderBySpeciality }
     * 
     */
    public PatientSearchProviderBySpeciality createPatientSearchProviderBySpeciality() {
        return new PatientSearchProviderBySpeciality();
    }

    /**
     * Create an instance of {@link PatientGetReminders }
     * 
     */
    public PatientGetReminders createPatientGetReminders() {
        return new PatientGetReminders();
    }

    /**
     * Create an instance of {@link ProviderBlockTimeslotsResponse }
     * 
     */
    public ProviderBlockTimeslotsResponse createProviderBlockTimeslotsResponse() {
        return new ProviderBlockTimeslotsResponse();
    }

    /**
     * Create an instance of {@link PatientLogin }
     * 
     */
    public PatientLogin createPatientLogin() {
        return new PatientLogin();
    }

    /**
     * Create an instance of {@link PatientCheckRegisteredResponse }
     * 
     */
    public PatientCheckRegisteredResponse createPatientCheckRegisteredResponse() {
        return new PatientCheckRegisteredResponse();
    }

    /**
     * Create an instance of {@link ProviderResetPasswordResponse }
     * 
     */
    public ProviderResetPasswordResponse createProviderResetPasswordResponse() {
        return new ProviderResetPasswordResponse();
    }

    /**
     * Create an instance of {@link PatientJoinWaitinglistSpecialityResponse }
     * 
     */
    public PatientJoinWaitinglistSpecialityResponse createPatientJoinWaitinglistSpecialityResponse() {
        return new PatientJoinWaitinglistSpecialityResponse();
    }

    /**
     * Create an instance of {@link PatientGetInfo }
     * 
     */
    public PatientGetInfo createPatientGetInfo() {
        return new PatientGetInfo();
    }

    /**
     * Create an instance of {@link PatientGetAgenda }
     * 
     */
    public PatientGetAgenda createPatientGetAgenda() {
        return new PatientGetAgenda();
    }

    /**
     * Create an instance of {@link PatientLoginResponse }
     * 
     */
    public PatientLoginResponse createPatientLoginResponse() {
        return new PatientLoginResponse();
    }

    /**
     * Create an instance of {@link PatientCreateAppointment }
     * 
     */
    public PatientCreateAppointment createPatientCreateAppointment() {
        return new PatientCreateAppointment();
    }

    /**
     * Create an instance of {@link PatientRemoveReminderResponse }
     * 
     */
    public PatientRemoveReminderResponse createPatientRemoveReminderResponse() {
        return new PatientRemoveReminderResponse();
    }

    /**
     * Create an instance of {@link ProviderLogoutResponse }
     * 
     */
    public ProviderLogoutResponse createProviderLogoutResponse() {
        return new ProviderLogoutResponse();
    }

    /**
     * Create an instance of {@link PatientChangePassword }
     * 
     */
    public PatientChangePassword createPatientChangePassword() {
        return new PatientChangePassword();
    }

    /**
     * Create an instance of {@link PatientGetInfoResponse }
     * 
     */
    public PatientGetInfoResponse createPatientGetInfoResponse() {
        return new PatientGetInfoResponse();
    }

    /**
     * Create an instance of {@link ProviderChangePasswordResponse }
     * 
     */
    public ProviderChangePasswordResponse createProviderChangePasswordResponse() {
        return new ProviderChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ProviderAddTimeslotPattern }
     * 
     */
    public ProviderAddTimeslotPattern createProviderAddTimeslotPattern() {
        return new ProviderAddTimeslotPattern();
    }

    /**
     * Create an instance of {@link ProviderCreateTimeslotResponse }
     * 
     */
    public ProviderCreateTimeslotResponse createProviderCreateTimeslotResponse() {
        return new ProviderCreateTimeslotResponse();
    }

    /**
     * Create an instance of {@link ProviderRemoveTimeslotPattern }
     * 
     */
    public ProviderRemoveTimeslotPattern createProviderRemoveTimeslotPattern() {
        return new ProviderRemoveTimeslotPattern();
    }

    /**
     * Create an instance of {@link PatientSearchProviderByCoordinates }
     * 
     */
    public PatientSearchProviderByCoordinates createPatientSearchProviderByCoordinates() {
        return new PatientSearchProviderByCoordinates();
    }

    /**
     * Create an instance of {@link ProviderChangeInfoResponse }
     * 
     */
    public ProviderChangeInfoResponse createProviderChangeInfoResponse() {
        return new ProviderChangeInfoResponse();
    }

    /**
     * Create an instance of {@link PatientResetPasswordResponse }
     * 
     */
    public PatientResetPasswordResponse createPatientResetPasswordResponse() {
        return new PatientResetPasswordResponse();
    }

    /**
     * Create an instance of {@link PatientJoinWaitinglistSpeciality }
     * 
     */
    public PatientJoinWaitinglistSpeciality createPatientJoinWaitinglistSpeciality() {
        return new PatientJoinWaitinglistSpeciality();
    }

    /**
     * Create an instance of {@link ProviderFilterAgenda }
     * 
     */
    public ProviderFilterAgenda createProviderFilterAgenda() {
        return new ProviderFilterAgenda();
    }

    /**
     * Create an instance of {@link ProviderGenerateAgendaResponse }
     * 
     */
    public ProviderGenerateAgendaResponse createProviderGenerateAgendaResponse() {
        return new ProviderGenerateAgendaResponse();
    }

    /**
     * Create an instance of {@link PatientSearchProviderByNameResponse }
     * 
     */
    public PatientSearchProviderByNameResponse createPatientSearchProviderByNameResponse() {
        return new PatientSearchProviderByNameResponse();
    }

    /**
     * Create an instance of {@link PatientGetSpecialitiesResponse }
     * 
     */
    public PatientGetSpecialitiesResponse createPatientGetSpecialitiesResponse() {
        return new PatientGetSpecialitiesResponse();
    }

    /**
     * Create an instance of {@link PatientGetAppointments }
     * 
     */
    public PatientGetAppointments createPatientGetAppointments() {
        return new PatientGetAppointments();
    }

    /**
     * Create an instance of {@link PatientCreateReminderResponse }
     * 
     */
    public PatientCreateReminderResponse createPatientCreateReminderResponse() {
        return new PatientCreateReminderResponse();
    }

    /**
     * Create an instance of {@link ProviderChangeSpeciality }
     * 
     */
    public ProviderChangeSpeciality createProviderChangeSpeciality() {
        return new ProviderChangeSpeciality();
    }

    /**
     * Create an instance of {@link ProviderCancelAppointmentsResponse }
     * 
     */
    public ProviderCancelAppointmentsResponse createProviderCancelAppointmentsResponse() {
        return new ProviderCancelAppointmentsResponse();
    }

    /**
     * Create an instance of {@link ProviderLogout }
     * 
     */
    public ProviderLogout createProviderLogout() {
        return new ProviderLogout();
    }

    /**
     * Create an instance of {@link ProviderRemoveTimeslotPatternResponse }
     * 
     */
    public ProviderRemoveTimeslotPatternResponse createProviderRemoveTimeslotPatternResponse() {
        return new ProviderRemoveTimeslotPatternResponse();
    }

    /**
     * Create an instance of {@link ProviderLoginResponse }
     * 
     */
    public ProviderLoginResponse createProviderLoginResponse() {
        return new ProviderLoginResponse();
    }

    /**
     * Create an instance of {@link ProviderChangeAppointment }
     * 
     */
    public ProviderChangeAppointment createProviderChangeAppointment() {
        return new ProviderChangeAppointment();
    }

    /**
     * Create an instance of {@link PatientGetHospitalsByAddressResponse }
     * 
     */
    public PatientGetHospitalsByAddressResponse createPatientGetHospitalsByAddressResponse() {
        return new PatientGetHospitalsByAddressResponse();
    }

    /**
     * Create an instance of {@link ProviderCancelAppointments }
     * 
     */
    public ProviderCancelAppointments createProviderCancelAppointments() {
        return new ProviderCancelAppointments();
    }

    /**
     * Create an instance of {@link PatientGetHospitalsByAddress }
     * 
     */
    public PatientGetHospitalsByAddress createPatientGetHospitalsByAddress() {
        return new PatientGetHospitalsByAddress();
    }

    /**
     * Create an instance of {@link PatientSearchProviderByAddressResponse }
     * 
     */
    public PatientSearchProviderByAddressResponse createPatientSearchProviderByAddressResponse() {
        return new PatientSearchProviderByAddressResponse();
    }

    /**
     * Create an instance of {@link PatientFillinSurvey }
     * 
     */
    public PatientFillinSurvey createPatientFillinSurvey() {
        return new PatientFillinSurvey();
    }

    /**
     * Create an instance of {@link PatientRemoveReminder }
     * 
     */
    public PatientRemoveReminder createPatientRemoveReminder() {
        return new PatientRemoveReminder();
    }

    /**
     * Create an instance of {@link PatientResetPassword }
     * 
     */
    public PatientResetPassword createPatientResetPassword() {
        return new PatientResetPassword();
    }

    /**
     * Create an instance of {@link ProviderChangeSpecialityResponse }
     * 
     */
    public ProviderChangeSpecialityResponse createProviderChangeSpecialityResponse() {
        return new ProviderChangeSpecialityResponse();
    }

    /**
     * Create an instance of {@link ProviderChangeAppointmentResponse }
     * 
     */
    public ProviderChangeAppointmentResponse createProviderChangeAppointmentResponse() {
        return new ProviderChangeAppointmentResponse();
    }

    /**
     * Create an instance of {@link PatientGetSpecialities }
     * 
     */
    public PatientGetSpecialities createPatientGetSpecialities() {
        return new PatientGetSpecialities();
    }

    /**
     * Create an instance of {@link PatientGetAppointmentsResponse }
     * 
     */
    public PatientGetAppointmentsResponse createPatientGetAppointmentsResponse() {
        return new PatientGetAppointmentsResponse();
    }

    /**
     * Create an instance of {@link ProviderGenerateAgenda }
     * 
     */
    public ProviderGenerateAgenda createProviderGenerateAgenda() {
        return new ProviderGenerateAgenda();
    }

    /**
     * Create an instance of {@link PatientCancelAppointment }
     * 
     */
    public PatientCancelAppointment createPatientCancelAppointment() {
        return new PatientCancelAppointment();
    }

    /**
     * Create an instance of {@link ProviderAddLocationResponse }
     * 
     */
    public ProviderAddLocationResponse createProviderAddLocationResponse() {
        return new ProviderAddLocationResponse();
    }

    /**
     * Create an instance of {@link ProviderRemoveLocation }
     * 
     */
    public ProviderRemoveLocation createProviderRemoveLocation() {
        return new ProviderRemoveLocation();
    }

    /**
     * Create an instance of {@link ProviderUnblockTimeslotsResponse }
     * 
     */
    public ProviderUnblockTimeslotsResponse createProviderUnblockTimeslotsResponse() {
        return new ProviderUnblockTimeslotsResponse();
    }

    /**
     * Create an instance of {@link PatientChangeAppointment }
     * 
     */
    public PatientChangeAppointment createPatientChangeAppointment() {
        return new PatientChangeAppointment();
    }

    /**
     * Create an instance of {@link PatientSearchProviderByName }
     * 
     */
    public PatientSearchProviderByName createPatientSearchProviderByName() {
        return new PatientSearchProviderByName();
    }

    /**
     * Create an instance of {@link ProviderCreateTimeslot }
     * 
     */
    public ProviderCreateTimeslot createProviderCreateTimeslot() {
        return new ProviderCreateTimeslot();
    }

    /**
     * Create an instance of {@link ProviderRemoveLocationResponse }
     * 
     */
    public ProviderRemoveLocationResponse createProviderRemoveLocationResponse() {
        return new ProviderRemoveLocationResponse();
    }

    /**
     * Create an instance of {@link ProviderResetPassword }
     * 
     */
    public ProviderResetPassword createProviderResetPassword() {
        return new ProviderResetPassword();
    }

    /**
     * Create an instance of {@link PatientLogout }
     * 
     */
    public PatientLogout createPatientLogout() {
        return new PatientLogout();
    }

    /**
     * Create an instance of {@link PatientGetSurveysResponse }
     * 
     */
    public PatientGetSurveysResponse createPatientGetSurveysResponse() {
        return new PatientGetSurveysResponse();
    }

    /**
     * Create an instance of {@link ProviderSetAppointmentsPerPatient }
     * 
     */
    public ProviderSetAppointmentsPerPatient createProviderSetAppointmentsPerPatient() {
        return new ProviderSetAppointmentsPerPatient();
    }

    /**
     * Create an instance of {@link PatientCreateAppointmentResponse }
     * 
     */
    public PatientCreateAppointmentResponse createPatientCreateAppointmentResponse() {
        return new PatientCreateAppointmentResponse();
    }

    /**
     * Create an instance of {@link ProviderGetAgendaResponse }
     * 
     */
    public ProviderGetAgendaResponse createProviderGetAgendaResponse() {
        return new ProviderGetAgendaResponse();
    }

    /**
     * Create an instance of {@link ProviderChangeContacts }
     * 
     */
    public ProviderChangeContacts createProviderChangeContacts() {
        return new ProviderChangeContacts();
    }

    /**
     * Create an instance of {@link PatientJoinWaitinglistProviderResponse }
     * 
     */
    public PatientJoinWaitinglistProviderResponse createPatientJoinWaitinglistProviderResponse() {
        return new PatientJoinWaitinglistProviderResponse();
    }

    /**
     * Create an instance of {@link ProviderAddTimeslotPatternResponse }
     * 
     */
    public ProviderAddTimeslotPatternResponse createProviderAddTimeslotPatternResponse() {
        return new ProviderAddTimeslotPatternResponse();
    }

    /**
     * Create an instance of {@link PatientSearchProviderByCoordinatesResponse }
     * 
     */
    public PatientSearchProviderByCoordinatesResponse createPatientSearchProviderByCoordinatesResponse() {
        return new PatientSearchProviderByCoordinatesResponse();
    }

    /**
     * Create an instance of {@link PatientCreateReminder }
     * 
     */
    public PatientCreateReminder createPatientCreateReminder() {
        return new PatientCreateReminder();
    }

    /**
     * Create an instance of {@link ProviderCreateAppointmentResponse }
     * 
     */
    public ProviderCreateAppointmentResponse createProviderCreateAppointmentResponse() {
        return new ProviderCreateAppointmentResponse();
    }

    /**
     * Create an instance of {@link PatientSearchProviderByAddress }
     * 
     */
    public PatientSearchProviderByAddress createPatientSearchProviderByAddress() {
        return new PatientSearchProviderByAddress();
    }

    /**
     * Create an instance of {@link PatientGetRemindersResponse }
     * 
     */
    public PatientGetRemindersResponse createPatientGetRemindersResponse() {
        return new PatientGetRemindersResponse();
    }

    /**
     * Create an instance of {@link ProviderCreateAppointment }
     * 
     */
    public ProviderCreateAppointment createProviderCreateAppointment() {
        return new ProviderCreateAppointment();
    }

    /**
     * Create an instance of {@link PatientFillinSurveyResponse }
     * 
     */
    public PatientFillinSurveyResponse createPatientFillinSurveyResponse() {
        return new PatientFillinSurveyResponse();
    }

    /**
     * Create an instance of {@link PatientCheckRegistered }
     * 
     */
    public PatientCheckRegistered createPatientCheckRegistered() {
        return new PatientCheckRegistered();
    }

    /**
     * Create an instance of {@link ProviderUnblockTimeslots }
     * 
     */
    public ProviderUnblockTimeslots createProviderUnblockTimeslots() {
        return new ProviderUnblockTimeslots();
    }

    /**
     * Create an instance of {@link ProviderFilterAgendaResponse }
     * 
     */
    public ProviderFilterAgendaResponse createProviderFilterAgendaResponse() {
        return new ProviderFilterAgendaResponse();
    }

    /**
     * Create an instance of {@link ProviderCreateAppointmentResults }
     * 
     */
    public ProviderCreateAppointmentResults createProviderCreateAppointmentResults() {
        return new ProviderCreateAppointmentResults();
    }

    /**
     * Create an instance of {@link PatientGetSurveys }
     * 
     */
    public PatientGetSurveys createPatientGetSurveys() {
        return new PatientGetSurveys();
    }

    /**
     * Create an instance of {@link PatientJoinWaitinglistProvider }
     * 
     */
    public PatientJoinWaitinglistProvider createPatientJoinWaitinglistProvider() {
        return new PatientJoinWaitinglistProvider();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetInfo.class)
    public JAXBElement<AuthtokenXml> createPatientGetInfoAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeslotPatternXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProviderGenerateAgendaResult", scope = ProviderGenerateAgendaResponse.class)
    public JAXBElement<ArrayOfTimeslotPatternXml> createProviderGenerateAgendaResponseProviderGenerateAgendaResult(ArrayOfTimeslotPatternXml value) {
        return new JAXBElement<ArrayOfTimeslotPatternXml>(_ProviderGenerateAgendaResponseProviderGenerateAgendaResult_QNAME, ArrayOfTimeslotPatternXml.class, ProviderGenerateAgendaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientCreateReminder.class)
    public JAXBElement<AuthtokenXml> createPatientCreateReminderAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientCreateReminder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientReminderXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reminder", scope = PatientCreateReminder.class)
    public JAXBElement<PatientReminderXml> createPatientCreateReminderReminder(PatientReminderXml value) {
        return new JAXBElement<PatientReminderXml>(_PatientCreateReminderReminder_QNAME, PatientReminderXml.class, PatientCreateReminder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetAppointments.class)
    public JAXBElement<AuthtokenXml> createPatientGetAppointmentsAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetAppointments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHospitalXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetHospitalsByCoordinatesResult", scope = PatientGetHospitalsByCoordinatesResponse.class)
    public JAXBElement<ArrayOfHospitalXml> createPatientGetHospitalsByCoordinatesResponsePatientGetHospitalsByCoordinatesResult(ArrayOfHospitalXml value) {
        return new JAXBElement<ArrayOfHospitalXml>(_PatientGetHospitalsByCoordinatesResponsePatientGetHospitalsByCoordinatesResult_QNAME, ArrayOfHospitalXml.class, PatientGetHospitalsByCoordinatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientSearchProviderByCoordinates.class)
    public JAXBElement<AuthtokenXml> createPatientSearchProviderByCoordinatesAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientSearchProviderByCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "coordinates", scope = PatientSearchProviderByCoordinates.class)
    public JAXBElement<String> createPatientSearchProviderByCoordinatesCoordinates(String value) {
        return new JAXBElement<String>(_PatientSearchProviderByCoordinatesCoordinates_QNAME, String.class, PatientSearchProviderByCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderCreateTimeslot.class)
    public JAXBElement<AuthtokenXml> createProviderCreateTimeslotAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderCreateTimeslot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeslotXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timeslot", scope = ProviderCreateTimeslot.class)
    public JAXBElement<TimeslotXml> createProviderCreateTimeslotTimeslot(TimeslotXml value) {
        return new JAXBElement<TimeslotXml>(_ProviderCreateTimeslotTimeslot_QNAME, TimeslotXml.class, ProviderCreateTimeslot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProviderLoginResult", scope = ProviderLoginResponse.class)
    public JAXBElement<AuthtokenXml> createProviderLoginResponseProviderLoginResult(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_ProviderLoginResponseProviderLoginResult_QNAME, AuthtokenXml.class, ProviderLoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderChangeInfo.class)
    public JAXBElement<AuthtokenXml> createProviderChangeInfoAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderChangeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "info", scope = ProviderChangeInfo.class)
    public JAXBElement<String> createProviderChangeInfoInfo(String value) {
        return new JAXBElement<String>(_ProviderChangeInfoInfo_QNAME, String.class, ProviderChangeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientSearchProviderByNameResult", scope = PatientSearchProviderByNameResponse.class)
    public JAXBElement<ArrayOfServiceProviderXml> createPatientSearchProviderByNameResponsePatientSearchProviderByNameResult(ArrayOfServiceProviderXml value) {
        return new JAXBElement<ArrayOfServiceProviderXml>(_PatientSearchProviderByNameResponsePatientSearchProviderByNameResult_QNAME, ArrayOfServiceProviderXml.class, PatientSearchProviderByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientCreateAppointment.class)
    public JAXBElement<AuthtokenXml> createPatientCreateAppointmentAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientCreateAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timeslotId", scope = PatientCreateAppointment.class)
    public JAXBElement<String> createPatientCreateAppointmentTimeslotId(String value) {
        return new JAXBElement<String>(_PatientCreateAppointmentTimeslotId_QNAME, String.class, PatientCreateAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientCancelAppointment.class)
    public JAXBElement<AuthtokenXml> createPatientCancelAppointmentAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientCancelAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "appointmentId", scope = PatientCancelAppointment.class)
    public JAXBElement<String> createPatientCancelAppointmentAppointmentId(String value) {
        return new JAXBElement<String>(_PatientCancelAppointmentAppointmentId_QNAME, String.class, PatientCancelAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetSurveys.class)
    public JAXBElement<AuthtokenXml> createPatientGetSurveysAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetSurveys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "insuranceNumber", scope = PatientResetPassword.class)
    public JAXBElement<String> createPatientResetPasswordInsuranceNumber(String value) {
        return new JAXBElement<String>(_PatientResetPasswordInsuranceNumber_QNAME, String.class, PatientResetPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientSearchProviderBySpecialityResult", scope = PatientSearchProviderBySpecialityResponse.class)
    public JAXBElement<ArrayOfServiceProviderXml> createPatientSearchProviderBySpecialityResponsePatientSearchProviderBySpecialityResult(ArrayOfServiceProviderXml value) {
        return new JAXBElement<ArrayOfServiceProviderXml>(_PatientSearchProviderBySpecialityResponsePatientSearchProviderBySpecialityResult_QNAME, ArrayOfServiceProviderXml.class, PatientSearchProviderBySpecialityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderRemoveTimeslotPattern.class)
    public JAXBElement<AuthtokenXml> createProviderRemoveTimeslotPatternAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderRemoveTimeslotPattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "patternId", scope = ProviderRemoveTimeslotPattern.class)
    public JAXBElement<String> createProviderRemoveTimeslotPatternPatternId(String value) {
        return new JAXBElement<String>(_ProviderRemoveTimeslotPatternPatternId_QNAME, String.class, ProviderRemoveTimeslotPattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderCreateAppointmentResults.class)
    public JAXBElement<AuthtokenXml> createProviderCreateAppointmentResultsAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderCreateAppointmentResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "appointmentId", scope = ProviderCreateAppointmentResults.class)
    public JAXBElement<String> createProviderCreateAppointmentResultsAppointmentId(String value) {
        return new JAXBElement<String>(_PatientCancelAppointmentAppointmentId_QNAME, String.class, ProviderCreateAppointmentResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentResultsXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "results", scope = ProviderCreateAppointmentResults.class)
    public JAXBElement<AppointmentResultsXml> createProviderCreateAppointmentResultsResults(AppointmentResultsXml value) {
        return new JAXBElement<AppointmentResultsXml>(_ProviderCreateAppointmentResultsResults_QNAME, AppointmentResultsXml.class, ProviderCreateAppointmentResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderAddTimeslotPattern.class)
    public JAXBElement<AuthtokenXml> createProviderAddTimeslotPatternAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderAddTimeslotPattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeslotPatternXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pattern", scope = ProviderAddTimeslotPattern.class)
    public JAXBElement<TimeslotPatternXml> createProviderAddTimeslotPatternPattern(TimeslotPatternXml value) {
        return new JAXBElement<TimeslotPatternXml>(_ProviderAddTimeslotPatternPattern_QNAME, TimeslotPatternXml.class, ProviderAddTimeslotPattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "speciality", scope = PatientJoinWaitinglistSpeciality.class)
    public JAXBElement<String> createPatientJoinWaitinglistSpecialitySpeciality(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistSpecialitySpeciality_QNAME, String.class, PatientJoinWaitinglistSpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientJoinWaitinglistSpeciality.class)
    public JAXBElement<AuthtokenXml> createPatientJoinWaitinglistSpecialityAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientJoinWaitinglistSpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "region", scope = PatientJoinWaitinglistSpeciality.class)
    public JAXBElement<String> createPatientJoinWaitinglistSpecialityRegion(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistSpecialityRegion_QNAME, String.class, PatientJoinWaitinglistSpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderGenerateAgenda.class)
    public JAXBElement<AuthtokenXml> createProviderGenerateAgendaAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderGenerateAgenda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeslotPatternXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pattern", scope = ProviderGenerateAgenda.class)
    public JAXBElement<ArrayOfTimeslotPatternXml> createProviderGenerateAgendaPattern(ArrayOfTimeslotPatternXml value) {
        return new JAXBElement<ArrayOfTimeslotPatternXml>(_ProviderAddTimeslotPatternPattern_QNAME, ArrayOfTimeslotPatternXml.class, ProviderGenerateAgenda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderRemoveLocation.class)
    public JAXBElement<AuthtokenXml> createProviderRemoveLocationAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderRemoveLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "location", scope = ProviderRemoveLocation.class)
    public JAXBElement<String> createProviderRemoveLocationLocation(String value) {
        return new JAXBElement<String>(_ProviderRemoveLocationLocation_QNAME, String.class, ProviderRemoveLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientJoinWaitinglistProvider.class)
    public JAXBElement<AuthtokenXml> createPatientJoinWaitinglistProviderAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientJoinWaitinglistProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "providerId", scope = PatientJoinWaitinglistProvider.class)
    public JAXBElement<String> createPatientJoinWaitinglistProviderProviderId(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistProviderProviderId_QNAME, String.class, PatientJoinWaitinglistProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInfoRecordXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetInfoResult", scope = PatientGetInfoResponse.class)
    public JAXBElement<ArrayOfInfoRecordXml> createPatientGetInfoResponsePatientGetInfoResult(ArrayOfInfoRecordXml value) {
        return new JAXBElement<ArrayOfInfoRecordXml>(_PatientGetInfoResponsePatientGetInfoResult_QNAME, ArrayOfInfoRecordXml.class, PatientGetInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = ProviderChangePassword.class)
    public JAXBElement<String> createProviderChangePasswordPassword(String value) {
        return new JAXBElement<String>(_ProviderChangePasswordPassword_QNAME, String.class, ProviderChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderChangePassword.class)
    public JAXBElement<AuthtokenXml> createProviderChangePasswordAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderBlockTimeslots.class)
    public JAXBElement<AuthtokenXml> createProviderBlockTimeslotsAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderBlockTimeslots.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timeslotsIds", scope = ProviderBlockTimeslots.class)
    public JAXBElement<ArrayOfstring> createProviderBlockTimeslotsTimeslotsIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProviderBlockTimeslotsTimeslotsIds_QNAME, ArrayOfstring.class, ProviderBlockTimeslots.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newTimeslotId", scope = PatientChangeAppointment.class)
    public JAXBElement<String> createPatientChangeAppointmentNewTimeslotId(String value) {
        return new JAXBElement<String>(_PatientChangeAppointmentNewTimeslotId_QNAME, String.class, PatientChangeAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientChangeAppointment.class)
    public JAXBElement<AuthtokenXml> createPatientChangeAppointmentAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientChangeAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "appointmentId", scope = PatientChangeAppointment.class)
    public JAXBElement<String> createPatientChangeAppointmentAppointmentId(String value) {
        return new JAXBElement<String>(_PatientCancelAppointmentAppointmentId_QNAME, String.class, PatientChangeAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = ProviderLogin.class)
    public JAXBElement<String> createProviderLoginPassword(String value) {
        return new JAXBElement<String>(_ProviderChangePasswordPassword_QNAME, String.class, ProviderLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "providerId", scope = ProviderLogin.class)
    public JAXBElement<String> createProviderLoginProviderId(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistProviderProviderId_QNAME, String.class, ProviderLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientSearchProviderByName.class)
    public JAXBElement<AuthtokenXml> createPatientSearchProviderByNameAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientSearchProviderByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "providerNamePattern", scope = PatientSearchProviderByName.class)
    public JAXBElement<String> createPatientSearchProviderByNameProviderNamePattern(String value) {
        return new JAXBElement<String>(_PatientSearchProviderByNameProviderNamePattern_QNAME, String.class, PatientSearchProviderByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "surveyId", scope = PatientFillinSurvey.class)
    public JAXBElement<String> createPatientFillinSurveySurveyId(String value) {
        return new JAXBElement<String>(_PatientFillinSurveySurveyId_QNAME, String.class, PatientFillinSurvey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientFillinSurvey.class)
    public JAXBElement<AuthtokenXml> createPatientFillinSurveyAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientFillinSurvey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyResultXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "results", scope = PatientFillinSurvey.class)
    public JAXBElement<ArrayOfCustomerSurveyResultXml> createPatientFillinSurveyResults(ArrayOfCustomerSurveyResultXml value) {
        return new JAXBElement<ArrayOfCustomerSurveyResultXml>(_ProviderCreateAppointmentResultsResults_QNAME, ArrayOfCustomerSurveyResultXml.class, PatientFillinSurvey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = PatientGetHospitalsByAddress.class)
    public JAXBElement<String> createPatientGetHospitalsByAddressAddress(String value) {
        return new JAXBElement<String>(_PatientGetHospitalsByAddressAddress_QNAME, String.class, PatientGetHospitalsByAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetHospitalsByAddress.class)
    public JAXBElement<AuthtokenXml> createPatientGetHospitalsByAddressAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetHospitalsByAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeslotXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetAgendaResult", scope = PatientGetAgendaResponse.class)
    public JAXBElement<ArrayOfTimeslotXml> createPatientGetAgendaResponsePatientGetAgendaResult(ArrayOfTimeslotXml value) {
        return new JAXBElement<ArrayOfTimeslotXml>(_PatientGetAgendaResponsePatientGetAgendaResult_QNAME, ArrayOfTimeslotXml.class, PatientGetAgendaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetSurveysResult", scope = PatientGetSurveysResponse.class)
    public JAXBElement<ArrayOfCustomerSurveyXml> createPatientGetSurveysResponsePatientGetSurveysResult(ArrayOfCustomerSurveyXml value) {
        return new JAXBElement<ArrayOfCustomerSurveyXml>(_PatientGetSurveysResponsePatientGetSurveysResult_QNAME, ArrayOfCustomerSurveyXml.class, PatientGetSurveysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPatientReminderXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetRemindersResult", scope = PatientGetRemindersResponse.class)
    public JAXBElement<ArrayOfPatientReminderXml> createPatientGetRemindersResponsePatientGetRemindersResult(ArrayOfPatientReminderXml value) {
        return new JAXBElement<ArrayOfPatientReminderXml>(_PatientGetRemindersResponsePatientGetRemindersResult_QNAME, ArrayOfPatientReminderXml.class, PatientGetRemindersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientLoginResult", scope = PatientLoginResponse.class)
    public JAXBElement<AuthtokenXml> createPatientLoginResponsePatientLoginResult(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientLoginResponsePatientLoginResult_QNAME, AuthtokenXml.class, PatientLoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetReminders.class)
    public JAXBElement<AuthtokenXml> createPatientGetRemindersAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetReminders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientSearchProviderByCoordinatesResult", scope = PatientSearchProviderByCoordinatesResponse.class)
    public JAXBElement<ArrayOfServiceProviderXml> createPatientSearchProviderByCoordinatesResponsePatientSearchProviderByCoordinatesResult(ArrayOfServiceProviderXml value) {
        return new JAXBElement<ArrayOfServiceProviderXml>(_PatientSearchProviderByCoordinatesResponsePatientSearchProviderByCoordinatesResult_QNAME, ArrayOfServiceProviderXml.class, PatientSearchProviderByCoordinatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "speciality", scope = PatientSearchProviderBySpeciality.class)
    public JAXBElement<String> createPatientSearchProviderBySpecialitySpeciality(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistSpecialitySpeciality_QNAME, String.class, PatientSearchProviderBySpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientSearchProviderBySpeciality.class)
    public JAXBElement<AuthtokenXml> createPatientSearchProviderBySpecialityAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientSearchProviderBySpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = PatientSearchProviderByAddress.class)
    public JAXBElement<String> createPatientSearchProviderByAddressAddress(String value) {
        return new JAXBElement<String>(_PatientGetHospitalsByAddressAddress_QNAME, String.class, PatientSearchProviderByAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientSearchProviderByAddress.class)
    public JAXBElement<AuthtokenXml> createPatientSearchProviderByAddressAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientSearchProviderByAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "speciality", scope = ProviderChangeSpeciality.class)
    public JAXBElement<String> createProviderChangeSpecialitySpeciality(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistSpecialitySpeciality_QNAME, String.class, ProviderChangeSpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderChangeSpeciality.class)
    public JAXBElement<AuthtokenXml> createProviderChangeSpecialityAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderChangeSpeciality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "insuranceNumber", scope = PatientCheckRegistered.class)
    public JAXBElement<String> createPatientCheckRegisteredInsuranceNumber(String value) {
        return new JAXBElement<String>(_PatientResetPasswordInsuranceNumber_QNAME, String.class, PatientCheckRegistered.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientLogout.class)
    public JAXBElement<AuthtokenXml> createPatientLogoutAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientLogout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderGetAgenda.class)
    public JAXBElement<AuthtokenXml> createProviderGetAgendaAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderGetAgenda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeslotXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProviderGetAgendaResult", scope = ProviderGetAgendaResponse.class)
    public JAXBElement<ArrayOfTimeslotXml> createProviderGetAgendaResponseProviderGetAgendaResult(ArrayOfTimeslotXml value) {
        return new JAXBElement<ArrayOfTimeslotXml>(_ProviderGetAgendaResponseProviderGetAgendaResult_QNAME, ArrayOfTimeslotXml.class, ProviderGetAgendaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderChangeAppointment.class)
    public JAXBElement<AuthtokenXml> createProviderChangeAppointmentAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderChangeAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "appointmentId", scope = ProviderChangeAppointment.class)
    public JAXBElement<String> createProviderChangeAppointmentAppointmentId(String value) {
        return new JAXBElement<String>(_PatientCancelAppointmentAppointmentId_QNAME, String.class, ProviderChangeAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeslotXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newTimeslot", scope = ProviderChangeAppointment.class)
    public JAXBElement<TimeslotXml> createProviderChangeAppointmentNewTimeslot(TimeslotXml value) {
        return new JAXBElement<TimeslotXml>(_ProviderChangeAppointmentNewTimeslot_QNAME, TimeslotXml.class, ProviderChangeAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientSearchProviderByAddressResult", scope = PatientSearchProviderByAddressResponse.class)
    public JAXBElement<ArrayOfServiceProviderXml> createPatientSearchProviderByAddressResponsePatientSearchProviderByAddressResult(ArrayOfServiceProviderXml value) {
        return new JAXBElement<ArrayOfServiceProviderXml>(_PatientSearchProviderByAddressResponsePatientSearchProviderByAddressResult_QNAME, ArrayOfServiceProviderXml.class, PatientSearchProviderByAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderCancelAppointments.class)
    public JAXBElement<AuthtokenXml> createProviderCancelAppointmentsAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderCancelAppointments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timeslotsIds", scope = ProviderCancelAppointments.class)
    public JAXBElement<ArrayOfstring> createProviderCancelAppointmentsTimeslotsIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProviderBlockTimeslotsTimeslotsIds_QNAME, ArrayOfstring.class, ProviderCancelAppointments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancelReason", scope = ProviderCancelAppointments.class)
    public JAXBElement<String> createProviderCancelAppointmentsCancelReason(String value) {
        return new JAXBElement<String>(_ProviderCancelAppointmentsCancelReason_QNAME, String.class, ProviderCancelAppointments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "providerId", scope = ProviderResetPassword.class)
    public JAXBElement<String> createProviderResetPasswordProviderId(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistProviderProviderId_QNAME, String.class, ProviderResetPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "insuranceNumber", scope = ProviderCreateAppointment.class)
    public JAXBElement<String> createProviderCreateAppointmentInsuranceNumber(String value) {
        return new JAXBElement<String>(_PatientResetPasswordInsuranceNumber_QNAME, String.class, ProviderCreateAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderCreateAppointment.class)
    public JAXBElement<AuthtokenXml> createProviderCreateAppointmentAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderCreateAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timeslotId", scope = ProviderCreateAppointment.class)
    public JAXBElement<String> createProviderCreateAppointmentTimeslotId(String value) {
        return new JAXBElement<String>(_PatientCreateAppointmentTimeslotId_QNAME, String.class, ProviderCreateAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetHospitalsByCoordinates.class)
    public JAXBElement<AuthtokenXml> createPatientGetHospitalsByCoordinatesAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetHospitalsByCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "coordinates", scope = PatientGetHospitalsByCoordinates.class)
    public JAXBElement<String> createPatientGetHospitalsByCoordinatesCoordinates(String value) {
        return new JAXBElement<String>(_PatientSearchProviderByCoordinatesCoordinates_QNAME, String.class, PatientGetHospitalsByCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderSetAppointmentsPerPatient.class)
    public JAXBElement<AuthtokenXml> createProviderSetAppointmentsPerPatientAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderSetAppointmentsPerPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderChangeContacts.class)
    public JAXBElement<AuthtokenXml> createProviderChangeContactsAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderChangeContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contacts", scope = ProviderChangeContacts.class)
    public JAXBElement<String> createProviderChangeContactsContacts(String value) {
        return new JAXBElement<String>(_ProviderChangeContactsContacts_QNAME, String.class, ProviderChangeContacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHospitalXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetHospitalsByAddressResult", scope = PatientGetHospitalsByAddressResponse.class)
    public JAXBElement<ArrayOfHospitalXml> createPatientGetHospitalsByAddressResponsePatientGetHospitalsByAddressResult(ArrayOfHospitalXml value) {
        return new JAXBElement<ArrayOfHospitalXml>(_PatientGetHospitalsByAddressResponsePatientGetHospitalsByAddressResult_QNAME, ArrayOfHospitalXml.class, PatientGetHospitalsByAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PatientGetSpecialitiesResult", scope = PatientGetSpecialitiesResponse.class)
    public JAXBElement<ArrayOfstring> createPatientGetSpecialitiesResponsePatientGetSpecialitiesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PatientGetSpecialitiesResponsePatientGetSpecialitiesResult_QNAME, ArrayOfstring.class, PatientGetSpecialitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientRemoveReminder.class)
    public JAXBElement<AuthtokenXml> createPatientRemoveReminderAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientRemoveReminder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reminderId", scope = PatientRemoveReminder.class)
    public JAXBElement<String> createPatientRemoveReminderReminderId(String value) {
        return new JAXBElement<String>(_PatientRemoveReminderReminderId_QNAME, String.class, PatientRemoveReminder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderFilterAgenda.class)
    public JAXBElement<AuthtokenXml> createProviderFilterAgendaAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderFilterAgenda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = PatientChangePassword.class)
    public JAXBElement<String> createPatientChangePasswordPassword(String value) {
        return new JAXBElement<String>(_ProviderChangePasswordPassword_QNAME, String.class, PatientChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientChangePassword.class)
    public JAXBElement<AuthtokenXml> createPatientChangePasswordAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = PatientLogin.class)
    public JAXBElement<String> createPatientLoginPassword(String value) {
        return new JAXBElement<String>(_ProviderChangePasswordPassword_QNAME, String.class, PatientLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "insuranceNumber", scope = PatientLogin.class)
    public JAXBElement<String> createPatientLoginInsuranceNumber(String value) {
        return new JAXBElement<String>(_PatientResetPasswordInsuranceNumber_QNAME, String.class, PatientLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderUnblockTimeslots.class)
    public JAXBElement<AuthtokenXml> createProviderUnblockTimeslotsAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderUnblockTimeslots.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timeslotsIds", scope = ProviderUnblockTimeslots.class)
    public JAXBElement<ArrayOfstring> createProviderUnblockTimeslotsTimeslotsIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ProviderBlockTimeslotsTimeslotsIds_QNAME, ArrayOfstring.class, ProviderUnblockTimeslots.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetSpecialities.class)
    public JAXBElement<AuthtokenXml> createPatientGetSpecialitiesAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetSpecialities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderLogout.class)
    public JAXBElement<AuthtokenXml> createProviderLogoutAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderLogout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = PatientGetAgenda.class)
    public JAXBElement<AuthtokenXml> createPatientGetAgendaAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, PatientGetAgenda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "providerId", scope = PatientGetAgenda.class)
    public JAXBElement<String> createPatientGetAgendaProviderId(String value) {
        return new JAXBElement<String>(_PatientJoinWaitinglistProviderProviderId_QNAME, String.class, PatientGetAgenda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProviderFilterAgendaResult", scope = ProviderFilterAgendaResponse.class)
    public JAXBElement<ArrayOfAppointmentXml> createProviderFilterAgendaResponseProviderFilterAgendaResult(ArrayOfAppointmentXml value) {
        return new JAXBElement<ArrayOfAppointmentXml>(_ProviderFilterAgendaResponseProviderFilterAgendaResult_QNAME, ArrayOfAppointmentXml.class, ProviderFilterAgendaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ProviderAddLocation.class)
    public JAXBElement<AuthtokenXml> createProviderAddLocationAuthToken(AuthtokenXml value) {
        return new JAXBElement<AuthtokenXml>(_PatientGetInfoAuthToken_QNAME, AuthtokenXml.class, ProviderAddLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "location", scope = ProviderAddLocation.class)
    public JAXBElement<LocationXml> createProviderAddLocationLocation(LocationXml value) {
        return new JAXBElement<LocationXml>(_ProviderRemoveLocationLocation_QNAME, LocationXml.class, ProviderAddLocation.class, value);
    }

}
