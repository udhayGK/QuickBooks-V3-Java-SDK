//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.03 at 02:01:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * When a unit of measure is referenced, it must
 * 				include the name of the specific unit used as well as the unit of
 * 				measure set in which that unit is defined. This entity captures that
 * 				concept.
 * 
 * <p>Java class for UOMRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOMRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UOMSetRef" type="{http://schema.intuit.com/finance/v3}ReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOMRef", propOrder = {
    "unit",
    "uomSetRef"
})
public class UOMRef implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    @XmlElement(name = "UOMSetRef", required = true)
    protected ReferenceType uomSetRef;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the uomSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUOMSetRef() {
        return uomSetRef;
    }

    /**
     * Sets the value of the uomSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUOMSetRef(ReferenceType value) {
        this.uomSetRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UOMRef that = ((UOMRef) object);
        {
            String lhsUnit;
            lhsUnit = this.getUnit();
            String rhsUnit;
            rhsUnit = that.getUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit, (this.unit!= null), (that.unit!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsUOMSetRef;
            lhsUOMSetRef = this.getUOMSetRef();
            ReferenceType rhsUOMSetRef;
            rhsUOMSetRef = that.getUOMSetRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomSetRef", lhsUOMSetRef), LocatorUtils.property(thatLocator, "uomSetRef", rhsUOMSetRef), lhsUOMSetRef, rhsUOMSetRef, (this.uomSetRef!= null), (that.uomSetRef!= null))) {
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
            String theUnit;
            theUnit = this.getUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unit", theUnit), currentHashCode, theUnit, (this.unit!= null));
        }
        {
            ReferenceType theUOMSetRef;
            theUOMSetRef = this.getUOMSetRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomSetRef", theUOMSetRef), currentHashCode, theUOMSetRef, (this.uomSetRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
