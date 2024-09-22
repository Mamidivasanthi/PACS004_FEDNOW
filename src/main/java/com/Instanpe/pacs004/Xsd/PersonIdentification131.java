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
@XmlType(name="PersonIdentification13__1",propOrder = {"DtAndPlcOfBirth","Othr"})
public class PersonIdentification131 {
    @XmlElement(name="DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth1 DtAndPlcOfBirth;
    @XmlElement(name="Othr")
    protected GenericPersonIdentification1 Othr;
}
