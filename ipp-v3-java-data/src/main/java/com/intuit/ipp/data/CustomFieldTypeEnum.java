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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StringType"/>
 *     &lt;enumeration value="BooleanType"/>
 *     &lt;enumeration value="NumberType"/>
 *     &lt;enumeration value="DateType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldTypeEnum")
@XmlEnum
public enum CustomFieldTypeEnum {

    @XmlEnumValue("StringType")
    STRING_TYPE("StringType"),
    @XmlEnumValue("BooleanType")
    BOOLEAN_TYPE("BooleanType"),
    @XmlEnumValue("NumberType")
    NUMBER_TYPE("NumberType"),
    @XmlEnumValue("DateType")
    DATE_TYPE("DateType");
    private final String value;

    CustomFieldTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomFieldTypeEnum fromValue(String v) {
        for (CustomFieldTypeEnum c: CustomFieldTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
