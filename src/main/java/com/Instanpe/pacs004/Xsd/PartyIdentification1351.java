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
@XmlType(name="PartyIdentification135__1",propOrder = {
        "Nm",
        "PstlAdr",
        "Id",
        "CtryOfRes"

})
public class PartyIdentification1351 {
    @XmlElement(name="Nm",required = true)
    protected String Nm;
    @XmlElement(name="PstlAdr")
    protected PostalAddress241 PstlAdr;
    @XmlElement(name="Id")
    protected Party38Choice1 Id;
    @XmlElement(name="CtryOfRes")
    protected String CtryOfRes;

}
