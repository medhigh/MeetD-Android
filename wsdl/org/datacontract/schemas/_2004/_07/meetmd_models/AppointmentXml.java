
package org.datacontract.schemas._2004._07.meetmd_models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppointmentXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppointmentResults" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}AppointmentResultsXml" minOccurs="0"/>
 *         &lt;element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Patient" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}PatientXml" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Timeslot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentXml", propOrder = {
    "appointmentResults",
    "cancelReason",
    "id",
    "info",
    "patient",
    "state",
    "timeslot"
})
public class AppointmentXml {

    @XmlElementRef(name = "AppointmentResults", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<AppointmentResultsXml> appointmentResults;
    @XmlElementRef(name = "CancelReason", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> cancelReason;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "Info", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "Patient", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<PatientXml> patient;
    @XmlElement(name = "State")
    protected Integer state;
    @XmlElementRef(name = "Timeslot", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> timeslot;

    /**
     * Gets the value of the appointmentResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppointmentResultsXml }{@code >}
     *     
     */
    public JAXBElement<AppointmentResultsXml> getAppointmentResults() {
        return appointmentResults;
    }

    /**
     * Sets the value of the appointmentResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppointmentResultsXml }{@code >}
     *     
     */
    public void setAppointmentResults(JAXBElement<AppointmentResultsXml> value) {
        this.appointmentResults = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelReason(JAXBElement<String> value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo(JAXBElement<String> value) {
        this.info = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PatientXml }{@code >}
     *     
     */
    public JAXBElement<PatientXml> getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PatientXml }{@code >}
     *     
     */
    public void setPatient(JAXBElement<PatientXml> value) {
        this.patient = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setState(Integer value) {
        this.state = value;
    }

    /**
     * Gets the value of the timeslot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeslot() {
        return timeslot;
    }

    /**
     * Sets the value of the timeslot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeslot(JAXBElement<String> value) {
        this.timeslot = value;
    }

}
