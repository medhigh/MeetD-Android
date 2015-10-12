
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PatientCancelAppointmentResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "patientCancelAppointmentResult"
})
@XmlRootElement(name = "PatientCancelAppointmentResponse")
public class PatientCancelAppointmentResponse {

    @XmlElement(name = "PatientCancelAppointmentResult")
    protected Boolean patientCancelAppointmentResult;

    /**
     * Gets the value of the patientCancelAppointmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPatientCancelAppointmentResult() {
        return patientCancelAppointmentResult;
    }

    /**
     * Sets the value of the patientCancelAppointmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPatientCancelAppointmentResult(Boolean value) {
        this.patientCancelAppointmentResult = value;
    }

}
