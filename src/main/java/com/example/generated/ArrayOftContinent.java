
package com.example.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftContinent", propOrder = {
    "tContinent"
})
public class ArrayOftContinent {

    @XmlElement(nillable = true)
    protected List<TContinent> tContinent;


    public List<TContinent> getTContinent() {
        if (tContinent == null) {
            tContinent = new ArrayList<TContinent>();
        }
        return this.tContinent;
    }

}
