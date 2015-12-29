//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.29 at 10:35:50 AM CET 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MainSignature" type="{http://dss.esig.europa.eu/validation/diagnostic}SignatureConstraints" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/diagnostic}TimestampConstraints" minOccurs="0"/>
 *         &lt;element name="Revocation" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationConstraints" minOccurs="0"/>
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/diagnostic}CryptographicConstraint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "mainSignature",
    "timestamp",
    "revocation",
    "cryptographic"
})
@XmlRootElement(name = "ConstraintsParameters")
public class ConstraintsParameters {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "MainSignature")
    protected SignatureConstraints mainSignature;
    @XmlElement(name = "Timestamp")
    protected TimestampConstraints timestamp;
    @XmlElement(name = "Revocation")
    protected RevocationConstraints revocation;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mainSignature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureConstraints }
     *     
     */
    public SignatureConstraints getMainSignature() {
        return mainSignature;
    }

    /**
     * Sets the value of the mainSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureConstraints }
     *     
     */
    public void setMainSignature(SignatureConstraints value) {
        this.mainSignature = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link TimestampConstraints }
     *     
     */
    public TimestampConstraints getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampConstraints }
     *     
     */
    public void setTimestamp(TimestampConstraints value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the revocation property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationConstraints }
     *     
     */
    public RevocationConstraints getRevocation() {
        return revocation;
    }

    /**
     * Sets the value of the revocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationConstraints }
     *     
     */
    public void setRevocation(RevocationConstraints value) {
        this.revocation = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
