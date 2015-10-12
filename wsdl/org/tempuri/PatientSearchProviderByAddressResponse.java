
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfServiceProviderXml;


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
 *         &lt;element name="PatientSearchProviderByAddressResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfServiceProviderXml" minOccurs="0"/>
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
    "patientSearchProviderByAddressResult"
})
@XmlRootElement(name = "PatientSearchProviderByAddressResponse")
public class PatientSearchProviderByAddressResponse {

    @XmlElementRef(name = "PatientSearchProviderByAddressResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfServiceProviderXml> patientSearchProviderByAddressResult;

    /**
     * Gets the value of the patientSearchProviderByAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceProviderXml> getPatientSearchProviderByAddressResult() {
        return patientSearchProviderByAddressResult;
    }

    /**
     * Sets the value of the patientSearchProviderByAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}
     *     
     */
    public void setPatientSearchProviderByAddressResult(JAXBElement<ArrayOfServiceProviderXml> value) {
        this.patientSearchProviderByAddressResult = value;
    }

}
