
package org.datacontract.schemas._2004._07.meetmd_models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPatientReminderXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPatientReminderXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientReminderXml" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}PatientReminderXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPatientReminderXml", propOrder = {
    "patientReminderXml"
})
public class ArrayOfPatientReminderXml {

    @XmlElement(name = "PatientReminderXml", nillable = true)
    protected List<PatientReminderXml> patientReminderXml;

    /**
     * Gets the value of the patientReminderXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientReminderXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientReminderXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientReminderXml }
     * 
     * 
     */
    public List<PatientReminderXml> getPatientReminderXml() {
        if (patientReminderXml == null) {
            patientReminderXml = new ArrayList<PatientReminderXml>();
        }
        return this.patientReminderXml;
    }

}
