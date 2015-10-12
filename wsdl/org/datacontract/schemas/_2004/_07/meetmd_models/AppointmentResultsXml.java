
package org.datacontract.schemas._2004._07.meetmd_models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for AppointmentResultsXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentResultsXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}AppointmentXml" minOccurs="0"/>
 *         &lt;element name="Complains" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HealthcareCodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuggestedTreatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentResultsXml", propOrder = {
    "appointment",
    "complains",
    "editDate",
    "healthcareCodes",
    "id",
    "info",
    "suggestedTreatment"
})
public class AppointmentResultsXml {

    @XmlElementRef(name = "Appointment", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<AppointmentXml> appointment;
    @XmlElementRef(name = "Complains", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> complains;
    @XmlElement(name = "EditDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar editDate;
    @XmlElementRef(name = "HealthcareCodes", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> healthcareCodes;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "Info", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "SuggestedTreatment", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> suggestedTreatment;

    /**
     * Gets the value of the appointment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppointmentXml }{@code >}
     *     
     */
    public JAXBElement<AppointmentXml> getAppointment() {
        return appointment;
    }

    /**
     * Sets the value of the appointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppointmentXml }{@code >}
     *     
     */
    public void setAppointment(JAXBElement<AppointmentXml> value) {
        this.appointment = value;
    }

    /**
     * Gets the value of the complains property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplains() {
        return complains;
    }

    /**
     * Sets the value of the complains property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplains(JAXBElement<String> value) {
        this.complains = value;
    }

    /**
     * Gets the value of the editDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditDate() {
        return editDate;
    }

    /**
     * Sets the value of the editDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditDate(XMLGregorianCalendar value) {
        this.editDate = value;
    }

    /**
     * Gets the value of the healthcareCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getHealthcareCodes() {
        return healthcareCodes;
    }

    /**
     * Sets the value of the healthcareCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setHealthcareCodes(JAXBElement<ArrayOfstring> value) {
        this.healthcareCodes = value;
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
     * Gets the value of the suggestedTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestedTreatment() {
        return suggestedTreatment;
    }

    /**
     * Sets the value of the suggestedTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestedTreatment(JAXBElement<String> value) {
        this.suggestedTreatment = value;
    }

}
