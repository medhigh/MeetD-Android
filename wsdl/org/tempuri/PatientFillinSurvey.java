
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfCustomerSurveyResultXml;
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
 *         &lt;element name="authToken" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}AuthtokenXml" minOccurs="0"/>
 *         &lt;element name="surveyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="results" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfCustomerSurveyResultXml" minOccurs="0"/>
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
    "authToken",
    "surveyId",
    "results"
})
@XmlRootElement(name = "PatientFillinSurvey")
public class PatientFillinSurvey {

    @XmlElementRef(name = "authToken", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<AuthtokenXml> authToken;
    @XmlElementRef(name = "surveyId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> surveyId;
    @XmlElementRef(name = "results", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCustomerSurveyResultXml> results;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}
     *     
     */
    public JAXBElement<AuthtokenXml> getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthtokenXml }{@code >}
     *     
     */
    public void setAuthToken(JAXBElement<AuthtokenXml> value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the surveyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurveyId() {
        return surveyId;
    }

    /**
     * Sets the value of the surveyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurveyId(JAXBElement<String> value) {
        this.surveyId = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyResultXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerSurveyResultXml> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerSurveyResultXml }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfCustomerSurveyResultXml> value) {
        this.results = value;
    }

}
