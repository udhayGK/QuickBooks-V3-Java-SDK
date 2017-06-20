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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
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
 *                 Product: QBW
 *                 Description: Provides a wrapper for SyncError for Conflict API Response
 *                 Consists of list of SyncError objects
 *              
 * 
 * <p>Java class for SyncErrorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncErrorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SyncError" type="{http://schema.intuit.com/finance/v3}SyncError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="latestUploadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="startPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncErrorResponse", propOrder = {
    "syncError"
})
public class SyncErrorResponse
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SyncError")
    protected List<SyncError> syncError;
    @XmlAttribute(name = "latestUploadTime")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date latestUploadTime;
    @XmlAttribute(name = "startPosition")
    protected Integer startPosition;
    @XmlAttribute(name = "maxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "totalCount")
    protected Integer totalCount;

    /**
     * Gets the value of the syncError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syncError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyncError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncError }
     * 
     * 
     */
    public List<SyncError> getSyncError() {
        if (syncError == null) {
            syncError = new ArrayList<SyncError>();
        }
        return this.syncError;
    }

    /**
     * Gets the value of the latestUploadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLatestUploadTime() {
        return latestUploadTime;
    }

    /**
     * Sets the value of the latestUploadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestUploadTime(Date value) {
        this.latestUploadTime = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPosition(Integer value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Sets the value of the syncError property.
     * 
     * @param syncError
     *     allowed object is
     *     {@link SyncError }
     *     
     */
    public void setSyncError(List<SyncError> syncError) {
        this.syncError = syncError;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SyncErrorResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SyncErrorResponse that = ((SyncErrorResponse) object);
        {
            List<SyncError> lhsSyncError;
            lhsSyncError = (((this.syncError!= null)&&(!this.syncError.isEmpty()))?this.getSyncError():null);
            List<SyncError> rhsSyncError;
            rhsSyncError = (((that.syncError!= null)&&(!that.syncError.isEmpty()))?that.getSyncError():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncError", lhsSyncError), LocatorUtils.property(thatLocator, "syncError", rhsSyncError), lhsSyncError, rhsSyncError)) {
                return false;
            }
        }
        {
            Date lhsLatestUploadTime;
            lhsLatestUploadTime = this.getLatestUploadTime();
            Date rhsLatestUploadTime;
            rhsLatestUploadTime = that.getLatestUploadTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestUploadTime", lhsLatestUploadTime), LocatorUtils.property(thatLocator, "latestUploadTime", rhsLatestUploadTime), lhsLatestUploadTime, rhsLatestUploadTime)) {
                return false;
            }
        }
        {
            Integer lhsStartPosition;
            lhsStartPosition = this.getStartPosition();
            Integer rhsStartPosition;
            rhsStartPosition = that.getStartPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startPosition", lhsStartPosition), LocatorUtils.property(thatLocator, "startPosition", rhsStartPosition), lhsStartPosition, rhsStartPosition)) {
                return false;
            }
        }
        {
            Integer lhsMaxResults;
            lhsMaxResults = this.getMaxResults();
            Integer rhsMaxResults;
            rhsMaxResults = that.getMaxResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxResults", lhsMaxResults), LocatorUtils.property(thatLocator, "maxResults", rhsMaxResults), lhsMaxResults, rhsMaxResults)) {
                return false;
            }
        }
        {
            Integer lhsTotalCount;
            lhsTotalCount = this.getTotalCount();
            Integer rhsTotalCount;
            rhsTotalCount = that.getTotalCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCount", lhsTotalCount), LocatorUtils.property(thatLocator, "totalCount", rhsTotalCount), lhsTotalCount, rhsTotalCount)) {
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
        int currentHashCode = 1;
        {
            List<SyncError> theSyncError;
            theSyncError = (((this.syncError!= null)&&(!this.syncError.isEmpty()))?this.getSyncError():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncError", theSyncError), currentHashCode, theSyncError);
        }
        {
            Date theLatestUploadTime;
            theLatestUploadTime = this.getLatestUploadTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestUploadTime", theLatestUploadTime), currentHashCode, theLatestUploadTime);
        }
        {
            Integer theStartPosition;
            theStartPosition = this.getStartPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startPosition", theStartPosition), currentHashCode, theStartPosition);
        }
        {
            Integer theMaxResults;
            theMaxResults = this.getMaxResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxResults", theMaxResults), currentHashCode, theMaxResults);
        }
        {
            Integer theTotalCount;
            theTotalCount = this.getTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCount", theTotalCount), currentHashCode, theTotalCount);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
