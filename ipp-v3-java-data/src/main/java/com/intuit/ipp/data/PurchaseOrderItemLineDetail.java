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
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: PurchaseOrder item detail
 * 				for a transaction line.
 * 			
 * 
 * <p>Java class for PurchaseOrderItemLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderItemLineDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesItemLineDetail">
 *       &lt;sequence>
 *         &lt;element name="ManPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManuallyClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderItemLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderItemLineDetail", propOrder = {
    "manPartNum",
    "manuallyClosed",
    "openQty",
    "purchaseOrderItemLineDetailEx"
})
public class PurchaseOrderItemLineDetail
    extends SalesItemLineDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ManPartNum")
    protected String manPartNum;
    @XmlElement(name = "ManuallyClosed")
    protected Boolean manuallyClosed;
    @XmlElement(name = "OpenQty")
    protected BigDecimal openQty;
    @XmlElement(name = "PurchaseOrderItemLineDetailEx")
    protected IntuitAnyType purchaseOrderItemLineDetailEx;

    /**
     * Gets the value of the manPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManPartNum() {
        return manPartNum;
    }

    /**
     * Sets the value of the manPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManPartNum(String value) {
        this.manPartNum = value;
    }

    /**
     * Gets the value of the manuallyClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManuallyClosed() {
        return manuallyClosed;
    }

    /**
     * Sets the value of the manuallyClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyClosed(Boolean value) {
        this.manuallyClosed = value;
    }

    /**
     * Gets the value of the openQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenQty() {
        return openQty;
    }

    /**
     * Sets the value of the openQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenQty(BigDecimal value) {
        this.openQty = value;
    }

    /**
     * Gets the value of the purchaseOrderItemLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getPurchaseOrderItemLineDetailEx() {
        return purchaseOrderItemLineDetailEx;
    }

    /**
     * Sets the value of the purchaseOrderItemLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setPurchaseOrderItemLineDetailEx(IntuitAnyType value) {
        this.purchaseOrderItemLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PurchaseOrderItemLineDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PurchaseOrderItemLineDetail that = ((PurchaseOrderItemLineDetail) object);
        {
            String lhsManPartNum;
            lhsManPartNum = this.getManPartNum();
            String rhsManPartNum;
            rhsManPartNum = that.getManPartNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manPartNum", lhsManPartNum), LocatorUtils.property(thatLocator, "manPartNum", rhsManPartNum), lhsManPartNum, rhsManPartNum)) {
                return false;
            }
        }
        {
            Boolean lhsManuallyClosed;
            lhsManuallyClosed = this.isManuallyClosed();
            Boolean rhsManuallyClosed;
            rhsManuallyClosed = that.isManuallyClosed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manuallyClosed", lhsManuallyClosed), LocatorUtils.property(thatLocator, "manuallyClosed", rhsManuallyClosed), lhsManuallyClosed, rhsManuallyClosed)) {
                return false;
            }
        }
        {
            BigDecimal lhsOpenQty;
            lhsOpenQty = this.getOpenQty();
            BigDecimal rhsOpenQty;
            rhsOpenQty = that.getOpenQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openQty", lhsOpenQty), LocatorUtils.property(thatLocator, "openQty", rhsOpenQty), lhsOpenQty, rhsOpenQty)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsPurchaseOrderItemLineDetailEx;
            lhsPurchaseOrderItemLineDetailEx = this.getPurchaseOrderItemLineDetailEx();
            IntuitAnyType rhsPurchaseOrderItemLineDetailEx;
            rhsPurchaseOrderItemLineDetailEx = that.getPurchaseOrderItemLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderItemLineDetailEx", lhsPurchaseOrderItemLineDetailEx), LocatorUtils.property(thatLocator, "purchaseOrderItemLineDetailEx", rhsPurchaseOrderItemLineDetailEx), lhsPurchaseOrderItemLineDetailEx, rhsPurchaseOrderItemLineDetailEx)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theManPartNum;
            theManPartNum = this.getManPartNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manPartNum", theManPartNum), currentHashCode, theManPartNum);
        }
        {
            Boolean theManuallyClosed;
            theManuallyClosed = this.isManuallyClosed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manuallyClosed", theManuallyClosed), currentHashCode, theManuallyClosed);
        }
        {
            BigDecimal theOpenQty;
            theOpenQty = this.getOpenQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openQty", theOpenQty), currentHashCode, theOpenQty);
        }
        {
            IntuitAnyType thePurchaseOrderItemLineDetailEx;
            thePurchaseOrderItemLineDetailEx = this.getPurchaseOrderItemLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderItemLineDetailEx", thePurchaseOrderItemLineDetailEx), currentHashCode, thePurchaseOrderItemLineDetailEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
