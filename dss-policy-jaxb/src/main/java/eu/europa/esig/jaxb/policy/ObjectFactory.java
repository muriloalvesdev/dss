//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.29 at 10:35:50 AM CET 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.jaxb.policy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.jaxb.policy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConstraintsParameters }
     * 
     */
    public ConstraintsParameters createConstraintsParameters() {
        return new ConstraintsParameters();
    }

    /**
     * Create an instance of {@link SignatureConstraints }
     * 
     */
    public SignatureConstraints createSignatureConstraints() {
        return new SignatureConstraints();
    }

    /**
     * Create an instance of {@link TimestampConstraints }
     * 
     */
    public TimestampConstraints createTimestampConstraints() {
        return new TimestampConstraints();
    }

    /**
     * Create an instance of {@link RevocationConstraints }
     * 
     */
    public RevocationConstraints createRevocationConstraints() {
        return new RevocationConstraints();
    }

    /**
     * Create an instance of {@link CryptographicConstraint }
     * 
     */
    public CryptographicConstraint createCryptographicConstraint() {
        return new CryptographicConstraint();
    }

    /**
     * Create an instance of {@link ValueConstraint }
     * 
     */
    public ValueConstraint createValueConstraint() {
        return new ValueConstraint();
    }

    /**
     * Create an instance of {@link CertificateConstraints }
     * 
     */
    public CertificateConstraints createCertificateConstraints() {
        return new CertificateConstraints();
    }

    /**
     * Create an instance of {@link Algo }
     * 
     */
    public Algo createAlgo() {
        return new Algo();
    }

    /**
     * Create an instance of {@link TimeConstraint }
     * 
     */
    public TimeConstraint createTimeConstraint() {
        return new TimeConstraint();
    }

    /**
     * Create an instance of {@link LevelConstraint }
     * 
     */
    public LevelConstraint createLevelConstraint() {
        return new LevelConstraint();
    }

    /**
     * Create an instance of {@link ListAlgo }
     * 
     */
    public ListAlgo createListAlgo() {
        return new ListAlgo();
    }

    /**
     * Create an instance of {@link UnsignedAttributesConstraints }
     * 
     */
    public UnsignedAttributesConstraints createUnsignedAttributesConstraints() {
        return new UnsignedAttributesConstraints();
    }

    /**
     * Create an instance of {@link MultiValuesConstraint }
     * 
     */
    public MultiValuesConstraint createMultiValuesConstraint() {
        return new MultiValuesConstraint();
    }

    /**
     * Create an instance of {@link SignedAttributesConstraints }
     * 
     */
    public SignedAttributesConstraints createSignedAttributesConstraints() {
        return new SignedAttributesConstraints();
    }

    /**
     * Create an instance of {@link AlgoExpirationDate }
     * 
     */
    public AlgoExpirationDate createAlgoExpirationDate() {
        return new AlgoExpirationDate();
    }

}
