
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml;


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
 *         &lt;element name="PatientLoginResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}AuthtokenXml" minOccurs="0"/>
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
    "patientLoginResult"
})
@XmlRootElement(name = "PatientLoginResponse")
public class PatientLoginResponse {

    @XmlElementRef(name = "PatientLoginResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<AuthtokenXml> patientLoginResult;

    /**
     * Gets the value of the patientLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}
     *     
     */
    public JAXBElement<AuthtokenXml> getPatientLoginResult() {
        return patientLoginResult;
    }

    /**
     * Sets the value of the patientLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}
     *     
     */
    public void setPatientLoginResult(JAXBElement<AuthtokenXml> value) {
        this.patientLoginResult = value;
    }

}
