
package org.datacontract.schemas._2004._07.meetmd_models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerSurveyXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSurveyXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}AppointmentXml" minOccurs="0"/>
 *         &lt;element name="CustomerSurveyResults" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfCustomerSurveyResultXml" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSurveyXml", propOrder = {
    "appointment",
    "customerSurveyResults",
    "date",
    "id",
    "status"
})
public class CustomerSurveyXml {

    @XmlElementRef(name = "Appointment", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<AppointmentXml> appointment;
    @XmlElementRef(name = "CustomerSurveyResults", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCustomerSurveyResultXml> customerSurveyResults;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElement(name = "Status")
    protected Integer status;

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
     * Gets the value of the customerSurveyResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyResultXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerSurveyResultXml> getCustomerSurveyResults() {
        return customerSurveyResults;
    }

    /**
     * Sets the value of the customerSurveyResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyResultXml }{@code >}
     *     
     */
    public void setCustomerSurveyResults(JAXBElement<ArrayOfCustomerSurveyResultXml> value) {
        this.customerSurveyResults = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

}
