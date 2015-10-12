
package org.datacontract.schemas._2004._07.meetmd_models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAppointmentXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAppointmentXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppointmentXml" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}AppointmentXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAppointmentXml", propOrder = {
    "appointmentXml"
})
public class ArrayOfAppointmentXml {

    @XmlElement(name = "AppointmentXml", nillable = true)
    protected List<AppointmentXml> appointmentXml;

    /**
     * Gets the value of the appointmentXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentXml }
     * 
     * 
     */
    public List<AppointmentXml> getAppointmentXml() {
        if (appointmentXml == null) {
            appointmentXml = new ArrayList<AppointmentXml>();
        }
        return this.appointmentXml;
    }

}
