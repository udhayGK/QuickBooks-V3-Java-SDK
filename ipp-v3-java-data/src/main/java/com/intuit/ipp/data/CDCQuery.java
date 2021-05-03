//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.03 at 02:01:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * CDCQuery entity describing need for query
 * 
 * <p>Java class for CDCQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDCQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDCQuery", propOrder = {
    "entities",
    "changedSince"
})
public class CDCQuery implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Entities")
    protected String entities;
    @XmlElement(name = "ChangedSince", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date changedSince;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntities(String value) {
        this.entities = value;
    }

    /**
     * Gets the value of the changedSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getChangedSince() {
        return changedSince;
    }

    /**
     * Sets the value of the changedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedSince(Date value) {
        this.changedSince = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CDCQuery that = ((CDCQuery) object);
        {
            String lhsEntities;
            lhsEntities = this.getEntities();
            String rhsEntities;
            rhsEntities = that.getEntities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entities", lhsEntities), LocatorUtils.property(thatLocator, "entities", rhsEntities), lhsEntities, rhsEntities, (this.entities!= null), (that.entities!= null))) {
                return false;
            }
        }
        {
            Date lhsChangedSince;
            lhsChangedSince = this.getChangedSince();
            Date rhsChangedSince;
            rhsChangedSince = that.getChangedSince();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changedSince", lhsChangedSince), LocatorUtils.property(thatLocator, "changedSince", rhsChangedSince), lhsChangedSince, rhsChangedSince, (this.changedSince!= null), (that.changedSince!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theEntities;
            theEntities = this.getEntities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entities", theEntities), currentHashCode, theEntities, (this.entities!= null));
        }
        {
            Date theChangedSince;
            theChangedSince = this.getChangedSince();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changedSince", theChangedSince), currentHashCode, theChangedSince, (this.changedSince!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
