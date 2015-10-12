
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfCustomerSurveyXml;


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
 *         &lt;element name="PatientGetSurveysResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfCustomerSurveyXml" minOccurs="0"/>
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
    "patientGetSurveysResult"
})
@XmlRootElement(name = "PatientGetSurveysResponse")
public class PatientGetSurveysResponse {

    @XmlElementRef(name = "PatientGetSurveysResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCustomerSurveyXml> patientGetSurveysResult;

    /**
     * Gets the value of the patientGetSurveysResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerSurveyXml> getPatientGetSurveysResult() {
        return patientGetSurveysResult;
    }

    /**
     * Sets the value of the patientGetSurveysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyXml }{@code >}
     *     
     */
    public void setPatientGetSurveysResult(JAXBElement<ArrayOfCustomerSurveyXml> value) {
        this.patientGetSurveysResult = value;
    }

}
