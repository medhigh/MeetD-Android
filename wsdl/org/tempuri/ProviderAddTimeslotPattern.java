
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.AuthtokenXml;
import org.datacontract.schemas._2004._07.meetmd_models.TimeslotPatternXml;


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
 *         &lt;element name="pattern" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}TimeslotPatternXml" minOccurs="0"/>
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
    "pattern"
})
@XmlRootElement(name = "ProviderAddTimeslotPattern")
public class ProviderAddTimeslotPattern {

    @XmlElementRef(name = "authToken", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<AuthtokenXml> authToken;
    @XmlElementRef(name = "pattern", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<TimeslotPatternXml> pattern;

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
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeslotPatternXml }{@code >}
     *     
     */
    public JAXBElement<TimeslotPatternXml> getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeslotPatternXml }{@code >}
     *     
     */
    public void setPattern(JAXBElement<TimeslotPatternXml> value) {
        this.pattern = value;
    }

}
