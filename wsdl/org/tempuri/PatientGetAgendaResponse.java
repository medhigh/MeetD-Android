
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
 *         &lt;element name="PatientGetAgendaResult" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ArrayOfTimeslotXml" minOccurs="0"/>
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
    "patientGetAgendaResult"
})
@XmlRootElement(name = "PatientGetAgendaResponse")
public class PatientGetAgendaResponse {

    @XmlElementRef(name = "PatientGetAgendaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTimeslotXml> patientGetAgendaResult;

    /**
     * Gets the value of the patientGetAgendaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimeslotXml }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTimeslotXml> getPatientGetAgendaResult() {
        return patientGetAgendaResult;
    }

    /**
     * Sets the value of the patientGetAgendaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimeslotXml }{@code >}
     *     
     */
    public void setPatientGetAgendaResult(JAXBElement<ArrayOfTimeslotXml> value) {
        this.patientGetAgendaResult = value;
    }

}
