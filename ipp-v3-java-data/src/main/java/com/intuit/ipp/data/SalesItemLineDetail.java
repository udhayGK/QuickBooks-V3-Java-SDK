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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
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
 * 				Description: SalesItem detail for a
 * 				transaction line.
 * 			
 * 
 * <p>Java class for SalesItemLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesItemLineDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}ItemLineDetail">
 *       &lt;sequence>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TaxInclusiveAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesItemLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesItemLineDetail", propOrder = {
    "serviceDate",
    "taxInclusiveAmt",
    "discountRate",
    "discountAmt",
    "salesItemLineDetailEx"
})
@XmlSeeAlso({
    PurchaseOrderItemLineDetail.class,
    SalesOrderItemLineDetail.class
})
public class SalesItemLineDetail
    extends ItemLineDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date serviceDate;
    @XmlElement(name = "TaxInclusiveAmt")
    protected BigDecimal taxInclusiveAmt;
    @XmlElement(name = "DiscountRate")
    protected BigDecimal discountRate;
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    @XmlElement(name = "SalesItemLineDetailEx")
    protected IntuitAnyType salesItemLineDetailEx;

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(Date value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the taxInclusiveAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    /**
     * Sets the value of the taxInclusiveAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxInclusiveAmt(BigDecimal value) {
        this.taxInclusiveAmt = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRate(BigDecimal value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the salesItemLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getSalesItemLineDetailEx() {
        return salesItemLineDetailEx;
    }

    /**
     * Sets the value of the salesItemLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setSalesItemLineDetailEx(IntuitAnyType value) {
        this.salesItemLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SalesItemLineDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SalesItemLineDetail that = ((SalesItemLineDetail) object);
        {
            Date lhsServiceDate;
            lhsServiceDate = this.getServiceDate();
            Date rhsServiceDate;
            rhsServiceDate = that.getServiceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDate", lhsServiceDate), LocatorUtils.property(thatLocator, "serviceDate", rhsServiceDate), lhsServiceDate, rhsServiceDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxInclusiveAmt;
            lhsTaxInclusiveAmt = this.getTaxInclusiveAmt();
            BigDecimal rhsTaxInclusiveAmt;
            rhsTaxInclusiveAmt = that.getTaxInclusiveAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusiveAmt", lhsTaxInclusiveAmt), LocatorUtils.property(thatLocator, "taxInclusiveAmt", rhsTaxInclusiveAmt), lhsTaxInclusiveAmt, rhsTaxInclusiveAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountRate;
            lhsDiscountRate = this.getDiscountRate();
            BigDecimal rhsDiscountRate;
            rhsDiscountRate = that.getDiscountRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountRate", lhsDiscountRate), LocatorUtils.property(thatLocator, "discountRate", rhsDiscountRate), lhsDiscountRate, rhsDiscountRate)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountAmt;
            lhsDiscountAmt = this.getDiscountAmt();
            BigDecimal rhsDiscountAmt;
            rhsDiscountAmt = that.getDiscountAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAmt", lhsDiscountAmt), LocatorUtils.property(thatLocator, "discountAmt", rhsDiscountAmt), lhsDiscountAmt, rhsDiscountAmt)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsSalesItemLineDetailEx;
            lhsSalesItemLineDetailEx = this.getSalesItemLineDetailEx();
            IntuitAnyType rhsSalesItemLineDetailEx;
            rhsSalesItemLineDetailEx = that.getSalesItemLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesItemLineDetailEx", lhsSalesItemLineDetailEx), LocatorUtils.property(thatLocator, "salesItemLineDetailEx", rhsSalesItemLineDetailEx), lhsSalesItemLineDetailEx, rhsSalesItemLineDetailEx)) {
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
            Date theServiceDate;
            theServiceDate = this.getServiceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDate", theServiceDate), currentHashCode, theServiceDate);
        }
        {
            BigDecimal theTaxInclusiveAmt;
            theTaxInclusiveAmt = this.getTaxInclusiveAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusiveAmt", theTaxInclusiveAmt), currentHashCode, theTaxInclusiveAmt);
        }
        {
            BigDecimal theDiscountRate;
            theDiscountRate = this.getDiscountRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountRate", theDiscountRate), currentHashCode, theDiscountRate);
        }
        {
            BigDecimal theDiscountAmt;
            theDiscountAmt = this.getDiscountAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAmt", theDiscountAmt), currentHashCode, theDiscountAmt);
        }
        {
            IntuitAnyType theSalesItemLineDetailEx;
            theSalesItemLineDetailEx = this.getSalesItemLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesItemLineDetailEx", theSalesItemLineDetailEx), currentHashCode, theSalesItemLineDetailEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
