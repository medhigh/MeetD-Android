
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
 *         &lt;element name="PatientSearchProviderByNameResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfServiceProviderXml" minOccurs="0"/>
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
    "patientSearchProviderByNameResult"
})
@XmlRootElement(name = "PatientSearchProviderByNameResponse")
public class PatientSearchProviderByNameResponse {

    @XmlElementRef(name = "PatientSearchProviderByNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfServiceProviderXml> patientSearchProviderByNameResult;

    /**
     * Gets the value of the patientSearchProviderByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceProviderXml> getPatientSearchProviderByNameResult() {
        return patientSearchProviderByNameResult;
    }

    /**
     * Sets the value of the patientSearchProviderByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceProviderXml }{@code >}
     *     
     */
    public void setPatientSearchProviderByNameResult(JAXBElement<ArrayOfServiceProviderXml> value) {
        this.patientSearchProviderByNameResult = value;
    }

}
