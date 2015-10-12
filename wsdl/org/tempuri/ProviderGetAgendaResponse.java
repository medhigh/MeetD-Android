
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfTimeslotXml;


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
 *         &lt;element name="ProviderGetAgendaResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfTimeslotXml" minOccurs="0"/>
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
    "providerGetAgendaResult"
})
@XmlRootElement(name = "ProviderGetAgendaResponse")
public class ProviderGetAgendaResponse {

    @XmlElementRef(name = "ProviderGetAgendaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTimeslotXml> providerGetAgendaResult;

    /**
     * Gets the value of the providerGetAgendaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimeslotXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTimeslotXml> getProviderGetAgendaResult() {
        return providerGetAgendaResult;
    }

    /**
     * Sets the value of the providerGetAgendaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimeslotXml }{@code >}
     *     
     */
    public void setProviderGetAgendaResult(JAXBElement<ArrayOfTimeslotXml> value) {
        this.providerGetAgendaResult = value;
    }

}
