
package org.datacontract.schemas._2004._07.meetmd_models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInfoRecordXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoRecordXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoRecordXml" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}InfoRecordXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoRecordXml", propOrder = {
    "infoRecordXml"
})
public class ArrayOfInfoRecordXml {

    @XmlElement(name = "InfoRecordXml", nillable = true)
    protected List<InfoRecordXml> infoRecordXml;

    /**
     * Gets the value of the infoRecordXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoRecordXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoRecordXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoRecordXml }
     * 
     * 
     */
    public List<InfoRecordXml> getInfoRecordXml() {
        if (infoRecordXml == null) {
            infoRecordXml = new ArrayList<InfoRecordXml>();
        }
        return this.infoRecordXml;
    }

}
