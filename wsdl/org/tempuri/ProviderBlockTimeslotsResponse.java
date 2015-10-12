
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
 *         &lt;element name="ProviderBlockTimeslotsResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "providerBlockTimeslotsResult"
})
@XmlRootElement(name = "ProviderBlockTimeslotsResponse")
public class ProviderBlockTimeslotsResponse {

    @XmlElement(name = "ProviderBlockTimeslotsResult")
    protected Boolean providerBlockTimeslotsResult;

    /**
     * Gets the value of the providerBlockTimeslotsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderBlockTimeslotsResult() {
        return providerBlockTimeslotsResult;
    }

    /**
     * Sets the value of the providerBlockTimeslotsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderBlockTimeslotsResult(Boolean value) {
        this.providerBlockTimeslotsResult = value;
    }

}
