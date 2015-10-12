
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ProviderRemoveTimeslotPatternResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "providerRemoveTimeslotPatternResult"
})
@XmlRootElement(name = "ProviderRemoveTimeslotPatternResponse")
public class ProviderRemoveTimeslotPatternResponse {

    @XmlElement(name = "ProviderRemoveTimeslotPatternResult")
    protected Boolean providerRemoveTimeslotPatternResult;

    /**
     * Gets the value of the providerRemoveTimeslotPatternResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderRemoveTimeslotPatternResult() {
        return providerRemoveTimeslotPatternResult;
    }

    /**
     * Sets the value of the providerRemoveTimeslotPatternResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderRemoveTimeslotPatternResult(Boolean value) {
        this.providerRemoveTimeslotPatternResult = value;
    }

}
