
package com.example.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCountryInfo", propOrder = {
    "sisoCode",
    "sName",
    "sCapitalCity",
    "sPhoneCode",
    "sContinentCode",
    "sCurrencyISOCode",
    "sCountryFlag",
    "languages"
})
public class TCountryInfo {

    @XmlElement(name = "sISOCode", required = true)
    protected String sisoCode;
    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sCapitalCity;
    @XmlElement(required = true)
    protected String sPhoneCode;
    @XmlElement(required = true)
    protected String sContinentCode;
    @XmlElement(required = true)
    protected String sCurrencyISOCode;
    @XmlElement(required = true)
    protected String sCountryFlag;
    @XmlElement(name = "Languages", required = true)
    protected ArrayOftLanguage languages;

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

    /**
     * Obtient la valeur de la propri�t� sCapitalCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCapitalCity() {
        return sCapitalCity;
    }

    /**
     * D�finit la valeur de la propri�t� sCapitalCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCapitalCity(String value) {
        this.sCapitalCity = value;
    }

    /**
     * Obtient la valeur de la propri�t� sPhoneCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPhoneCode() {
        return sPhoneCode;
    }

    /**
     * D�finit la valeur de la propri�t� sPhoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPhoneCode(String value) {
        this.sPhoneCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� sContinentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContinentCode() {
        return sContinentCode;
    }

    /**
     * D�finit la valeur de la propri�t� sContinentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContinentCode(String value) {
        this.sContinentCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� sCurrencyISOCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCurrencyISOCode() {
        return sCurrencyISOCode;
    }

    /**
     * D�finit la valeur de la propri�t� sCurrencyISOCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCurrencyISOCode(String value) {
        this.sCurrencyISOCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� sCountryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryFlag() {
        return sCountryFlag;
    }

    /**
     * D�finit la valeur de la propri�t� sCountryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryFlag(String value) {
        this.sCountryFlag = value;
    }

    /**
     * Obtient la valeur de la propri�t� languages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public ArrayOftLanguage getLanguages() {
        return languages;
    }

    /**
     * D�finit la valeur de la propri�t� languages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public void setLanguages(ArrayOftLanguage value) {
        this.languages = value;
    }

}
