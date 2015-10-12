
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfPatientReminderXml;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientGetRemindersResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfPatientReminderXml" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "patientGetRemindersResult"
})
@XmlRootElement(name = "PatientGetRemindersResponse")
public class PatientGetRemindersResponse {

    @XmlElementRef(name = "PatientGetRemindersResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPatientReminderXml> patientGetRemindersResult;

    /**
     * Gets the value of the patientGetRemindersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPatientReminderXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPatientReminderXml> getPatientGetRemindersResult() {
        return patientGetRemindersResult;
    }

    /**
     * Sets the value of the patientGetRemindersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPatientReminderXml }{@code >}
     *     
     */
    public void setPatientGetRemindersResult(JAXBElement<ArrayOfPatientReminderXml> value) {
        this.patientGetRemindersResult = value;
    }

}
