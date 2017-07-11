/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.10 at 10:56:50 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * 
 * 				Product: ALL
 * 				Description: Markup information.
 * 			
 * 
 * <p>Java class for MarkupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PercentBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceLevelRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="MarkUpIncomeAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkupInfo", propOrder = {
    "percentBased",
    "value",
    "percent",
    "priceLevelRef",
    "markUpIncomeAccountRef"
})
public class MarkupInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PercentBased")
    protected Boolean percentBased;
    @XmlElement(name = "Value")
    protected BigDecimal value;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "PriceLevelRef")
    protected ReferenceType priceLevelRef;
    @XmlElement(name = "MarkUpIncomeAccountRef")
    protected ReferenceType markUpIncomeAccountRef;

    /**
     * Gets the value of the percentBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPercentBased() {
        return percentBased;
    }

    /**
     * Sets the value of the percentBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentBased(Boolean value) {
        this.percentBased = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the priceLevelRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    /**
     * Sets the value of the priceLevelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPriceLevelRef(ReferenceType value) {
        this.priceLevelRef = value;
    }

    /**
     * Gets the value of the markUpIncomeAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getMarkUpIncomeAccountRef() {
        return markUpIncomeAccountRef;
    }

    /**
     * Sets the value of the markUpIncomeAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setMarkUpIncomeAccountRef(ReferenceType value) {
        this.markUpIncomeAccountRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MarkupInfo that = ((MarkupInfo) object);
        {
            Boolean lhsPercentBased;
            lhsPercentBased = this.isPercentBased();
            Boolean rhsPercentBased;
            rhsPercentBased = that.isPercentBased();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentBased", lhsPercentBased), LocatorUtils.property(thatLocator, "percentBased", rhsPercentBased), lhsPercentBased, rhsPercentBased, (this.percentBased!= null), (that.percentBased!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsValue;
            lhsValue = this.getValue();
            BigDecimal rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPercent;
            lhsPercent = this.getPercent();
            BigDecimal rhsPercent;
            rhsPercent = that.getPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percent", lhsPercent), LocatorUtils.property(thatLocator, "percent", rhsPercent), lhsPercent, rhsPercent, (this.percent!= null), (that.percent!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsPriceLevelRef;
            lhsPriceLevelRef = this.getPriceLevelRef();
            ReferenceType rhsPriceLevelRef;
            rhsPriceLevelRef = that.getPriceLevelRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceLevelRef", lhsPriceLevelRef), LocatorUtils.property(thatLocator, "priceLevelRef", rhsPriceLevelRef), lhsPriceLevelRef, rhsPriceLevelRef, (this.priceLevelRef!= null), (that.priceLevelRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsMarkUpIncomeAccountRef;
            lhsMarkUpIncomeAccountRef = this.getMarkUpIncomeAccountRef();
            ReferenceType rhsMarkUpIncomeAccountRef;
            rhsMarkUpIncomeAccountRef = that.getMarkUpIncomeAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markUpIncomeAccountRef", lhsMarkUpIncomeAccountRef), LocatorUtils.property(thatLocator, "markUpIncomeAccountRef", rhsMarkUpIncomeAccountRef), lhsMarkUpIncomeAccountRef, rhsMarkUpIncomeAccountRef, (this.markUpIncomeAccountRef!= null), (that.markUpIncomeAccountRef!= null))) {
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
            Boolean thePercentBased;
            thePercentBased = this.isPercentBased();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentBased", thePercentBased), currentHashCode, thePercentBased, (this.percentBased!= null));
        }
        {
            BigDecimal theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        {
            BigDecimal thePercent;
            thePercent = this.getPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percent", thePercent), currentHashCode, thePercent, (this.percent!= null));
        }
        {
            ReferenceType thePriceLevelRef;
            thePriceLevelRef = this.getPriceLevelRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceLevelRef", thePriceLevelRef), currentHashCode, thePriceLevelRef, (this.priceLevelRef!= null));
        }
        {
            ReferenceType theMarkUpIncomeAccountRef;
            theMarkUpIncomeAccountRef = this.getMarkUpIncomeAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markUpIncomeAccountRef", theMarkUpIncomeAccountRef), currentHashCode, theMarkUpIncomeAccountRef, (this.markUpIncomeAccountRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
