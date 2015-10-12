
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotPatternXml;


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
 *         &lt;element name="ProviderGenerateAgendaResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfTimeslotPatternXml" minOccurs="0"/>
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
    "providerGenerateAgendaResult"
})
@XmlRootElement(name = "ProviderGenerateAgendaResponse")
public class ProviderGenerateAgendaResponse {

    @XmlElementRef(name = "ProviderGenerateAgendaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTimeslotPatternXml> providerGenerateAgendaResult;

    /**
     * Gets the value of the providerGenerateAgendaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimeslotPatternXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTimeslotPatternXml> getProviderGenerateAgendaResult() {
        return providerGenerateAgendaResult;
    }

    /**
     * Sets the value of the providerGenerateAgendaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimeslotPatternXml }{@code >}
     *     
     */
    public void setProviderGenerateAgendaResult(JAXBElement<ArrayOfTimeslotPatternXml> value) {
        this.providerGenerateAgendaResult = value;
    }

}
