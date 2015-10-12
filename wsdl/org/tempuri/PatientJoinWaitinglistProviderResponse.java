
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
 *         &lt;element name="PatientJoinWaitinglistProviderResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "patientJoinWaitinglistProviderResult"
})
@XmlRootElement(name = "PatientJoinWaitinglistProviderResponse")
public class PatientJoinWaitinglistProviderResponse {

    @XmlElement(name = "PatientJoinWaitinglistProviderResult")
    protected Boolean patientJoinWaitinglistProviderResult;

    /**
     * Gets the value of the patientJoinWaitinglistProviderResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPatientJoinWaitinglistProviderResult() {
        return patientJoinWaitinglistProviderResult;
    }

    /**
     * Sets the value of the patientJoinWaitinglistProviderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPatientJoinWaitinglistProviderResult(Boolean value) {
        this.patientJoinWaitinglistProviderResult = value;
    }

}
