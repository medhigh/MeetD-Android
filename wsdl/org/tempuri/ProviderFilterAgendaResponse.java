
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.meetmd_models.ArrayOfAppointmentXml;


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
 *         &lt;element name="ProviderFilterAgendaResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfAppointmentXml" minOccurs="0"/>
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
    "providerFilterAgendaResult"
})
@XmlRootElement(name = "ProviderFilterAgendaResponse")
public class ProviderFilterAgendaResponse {

    @XmlElementRef(name = "ProviderFilterAgendaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAppointmentXml> providerFilterAgendaResult;

    /**
     * Gets the value of the providerFilterAgendaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAppointmentXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAppointmentXml> getProviderFilterAgendaResult() {
        return providerFilterAgendaResult;
    }

    /**
     * Sets the value of the providerFilterAgendaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAppointmentXml }{@code >}
     *     
     */
    public void setProviderFilterAgendaResult(JAXBElement<ArrayOfAppointmentXml> value) {
        this.providerFilterAgendaResult = value;
    }

}
