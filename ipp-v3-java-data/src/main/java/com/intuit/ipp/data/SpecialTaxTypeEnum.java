//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.03 at 02:01:21 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialTaxTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialTaxTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ZERO_RATE"/&gt;
 *     &lt;enumeration value="FOREIGN_TAX"/&gt;
 *     &lt;enumeration value="REVERSE_CHARGE"/&gt;
 *     &lt;enumeration value="ADJUSTMENT_RATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialTaxTypeEnum")
@XmlEnum
public enum SpecialTaxTypeEnum {

    NONE,
    ZERO_RATE,
    FOREIGN_TAX,
    REVERSE_CHARGE,
    ADJUSTMENT_RATE;

    public String value() {
        return name();
    }

    public static SpecialTaxTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
