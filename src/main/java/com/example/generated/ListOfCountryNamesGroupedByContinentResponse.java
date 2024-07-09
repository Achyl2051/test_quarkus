
package com.example.generated;

import jakarta.xml.bind.annotation.*;


/**
 * &lt;p&gt;Classe Java pour anonymous complex type.
 * 
 * &lt;p&gt;Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ListOfCountryNamesGroupedByContinentResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndNameGroupedByContinent"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfCountryNamesGroupedByContinentResult"
})
@XmlRootElement(name = "ListOfCountryNamesGroupedByContinentResponse")
public class ListOfCountryNamesGroupedByContinentResponse {

    @XmlElement(name = "ListOfCountryNamesGroupedByContinentResult", required = true)
    protected ArrayOftCountryCodeAndNameGroupedByContinent listOfCountryNamesGroupedByContinentResult;

    /**
     * Obtient la valeur de la propri�t� listOfCountryNamesGroupedByContinentResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndNameGroupedByContinent }
     *     
     */
    public ArrayOftCountryCodeAndNameGroupedByContinent getListOfCountryNamesGroupedByContinentResult() {
        return listOfCountryNamesGroupedByContinentResult;
    }

    /**
     * D�finit la valeur de la propri�t� listOfCountryNamesGroupedByContinentResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndNameGroupedByContinent }
     *     
     */
    public void setListOfCountryNamesGroupedByContinentResult(ArrayOftCountryCodeAndNameGroupedByContinent value) {
        this.listOfCountryNamesGroupedByContinentResult = value;
    }

}
