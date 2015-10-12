
package org.datacontract.schemas._2004._07.meetmd_models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHospitalXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHospitalXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HospitalXml" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}HospitalXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHospitalXml", propOrder = {
    "hospitalXml"
})
public class ArrayOfHospitalXml {

    @XmlElement(name = "HospitalXml", nillable = true)
    protected List<HospitalXml> hospitalXml;

    /**
     * Gets the value of the hospitalXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hospitalXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHospitalXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HospitalXml }
     * 
     * 
     */
    public List<HospitalXml> getHospitalXml() {
        if (hospitalXml == null) {
            hospitalXml = new ArrayList<HospitalXml>();
        }
        return this.hospitalXml;
    }

}
