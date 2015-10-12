
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfHospitalXml;


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
 *         &lt;element name="PatientGetHospitalsByAddressResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfHospitalXml" minOccurs="0"/>
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
    "patientGetHospitalsByAddressResult"
})
@XmlRootElement(name = "PatientGetHospitalsByAddressResponse")
public class PatientGetHospitalsByAddressResponse {

    @XmlElementRef(name = "PatientGetHospitalsByAddressResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHospitalXml> patientGetHospitalsByAddressResult;

    /**
     * Gets the value of the patientGetHospitalsByAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHospitalXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHospitalXml> getPatientGetHospitalsByAddressResult() {
        return patientGetHospitalsByAddressResult;
    }

    /**
     * Sets the value of the patientGetHospitalsByAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHospitalXml }{@code >}
     *     
     */
    public void setPatientGetHospitalsByAddressResult(JAXBElement<ArrayOfHospitalXml> value) {
        this.patientGetHospitalsByAddressResult = value;
    }

}
