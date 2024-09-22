package com.Instanpe.pacs004.Xsd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DateAndPlaceOfBirth1",propOrder = {
        "BirthDt",
        "PrvcOfBirth",
        "CityOfBirth",
        "CtryOfBirth"
})
public class DateAndPlaceOfBirth1 {
    @XmlElement(name="BirthDt",required = true)
    protected String BirthDt;
    @XmlElement(name="PrvcOfBirth")
    protected String PrvcOfBirth;
    @XmlElement(name="CityOfBirth",required = true)
    protected String CityOfBirth;
    @XmlElement(name="CtryOfBirth",required = true)
    protected String CtryOfBirth;

}
