
package com.example.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLanguage", propOrder = {
    "sisoCode",
    "sName"
})
public class TLanguage {

    @XmlElement(name = "sISOCode", required = true)
    protected String sisoCode;
    @XmlElement(required = true)
    protected String sName;

    /**
     * Obtient la valeur de la propri�t� sisoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISOCode() {
        return sisoCode;
    }

    /**
     * D�finit la valeur de la propri�t� sisoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISOCode(String value) {
        this.sisoCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * D�finit la valeur de la propri�t� sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

}
