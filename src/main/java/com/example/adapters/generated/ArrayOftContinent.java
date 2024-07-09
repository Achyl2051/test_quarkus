package com.example.adapters.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour ArrayOftContinent complex type.
 * 
 * &lt;p&gt;Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOftContinent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="tContinent" type="{http://www.oorsprong.org/websamples.countryinfo}tContinent" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftContinent", propOrder = {
    "tContinent"
})
public class ArrayOftContinent {

    @XmlElement(nillable = true)
    protected List<TContinent> tContinent;

    /**
     * Gets the value of the tContinent property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tContinent property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTContinent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TContinent }
     * 
     * 
     */
    public List<TContinent> getTContinent() {
        if (tContinent == null) {
            tContinent = new ArrayList<TContinent>();
        }
        return this.tContinent;
    }

}
