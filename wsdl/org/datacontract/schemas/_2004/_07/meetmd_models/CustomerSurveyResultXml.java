
package org.datacontract.schemas._2004._07.meetmd_models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSurveyResultXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSurveyResultXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerSurveyQuestion" type="{http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel}CustomerSurveyQuestionXml" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSurveyResultXml", propOrder = {
    "answer",
    "customerSurveyQuestion",
    "id"
})
public class CustomerSurveyResultXml {

    @XmlElement(name = "Answer")
    protected Integer answer;
    @XmlElementRef(name = "CustomerSurveyQuestion", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<CustomerSurveyQuestionXml> customerSurveyQuestion;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel", type = JAXBElement.class)
    protected JAXBElement<String> id;

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnswer(Integer value) {
        this.answer = value;
    }

    /**
     * Gets the value of the customerSurveyQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerSurveyQuestionXml }{@code >}
     *     
     */
    public JAXBElement<CustomerSurveyQuestionXml> getCustomerSurveyQuestion() {
        return customerSurveyQuestion;
    }

    /**
     * Sets the value of the customerSurveyQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerSurveyQuestionXml }{@code >}
     *     
     */
    public void setCustomerSurveyQuestion(JAXBElement<CustomerSurveyQuestionXml> value) {
        this.customerSurveyQuestion = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

}
