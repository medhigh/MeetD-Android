
package org.datacontract.schemas._2004._07.meetmd_models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimeslotPatternXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimeslotPatternXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeslotPatternXml" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}TimeslotPatternXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimeslotPatternXml", propOrder = {
    "timeslotPatternXml"
})
public class ArrayOfTimeslotPatternXml {

    @XmlElement(name = "TimeslotPatternXml", nillable = true)
    protected List<TimeslotPatternXml> timeslotPatternXml;

    /**
     * Gets the value of the timeslotPatternXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeslotPatternXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeslotPatternXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeslotPatternXml }
     * 
     * 
     */
    public List<TimeslotPatternXml> getTimeslotPatternXml() {
        if (timeslotPatternXml == null) {
            timeslotPatternXml = new ArrayList<TimeslotPatternXml>();
        }
        return this.timeslotPatternXml;
    }

}
