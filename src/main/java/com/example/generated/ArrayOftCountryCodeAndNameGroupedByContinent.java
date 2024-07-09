
package com.example.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Classe Java pour ArrayOftCountryCodeAndNameGroupedByContinent complex type.
 * 
 * &lt;p&gt;Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOftCountryCodeAndNameGroupedByContinent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="tCountryCodeAndNameGroupedByContinent" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryCodeAndNameGroupedByContinent" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCountryCodeAndNameGroupedByContinent", propOrder = {
    "tCountryCodeAndNameGroupedByContinent"
})
public class ArrayOftCountryCodeAndNameGroupedByContinent {

    @XmlElement(nillable = true)
    protected List<TCountryCodeAndNameGroupedByContinent> tCountryCodeAndNameGroupedByContinent;

    /**
     * Gets the value of the tCountryCodeAndNameGroupedByContinent property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tCountryCodeAndNameGroupedByContinent property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTCountryCodeAndNameGroupedByContinent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TCountryCodeAndNameGroupedByContinent }
     * 
     * 
     */
    public List<TCountryCodeAndNameGroupedByContinent> getTCountryCodeAndNameGroupedByContinent() {
        if (tCountryCodeAndNameGroupedByContinent == null) {
            tCountryCodeAndNameGroupedByContinent = new ArrayList<TCountryCodeAndNameGroupedByContinent>();
        }
        return this.tCountryCodeAndNameGroupedByContinent;
    }

}
