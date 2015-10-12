
package org.datacontract.schemas._2004._07.meetmd_models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceProviderXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceProviderXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceProviderXml" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}ServiceProviderXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceProviderXml", propOrder = {
    "serviceProviderXml"
})
public class ArrayOfServiceProviderXml {

    @XmlElement(name = "ServiceProviderXml", nillable = true)
    protected List<ServiceProviderXml> serviceProviderXml;

    /**
     * Gets the value of the serviceProviderXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProviderXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProviderXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProviderXml }
     * 
     * 
     */
    public List<ServiceProviderXml> getServiceProviderXml() {
        if (serviceProviderXml == null) {
            serviceProviderXml = new ArrayList<ServiceProviderXml>();
        }
        return this.serviceProviderXml;
    }

}
