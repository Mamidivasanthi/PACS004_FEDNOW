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
@XmlType(name="PersonIdentificationSchemeName1Choice",propOrder = {"cd",
        "prtry"})

public class PersonIdentificationSchemeName1Choice {
    @XmlElement(name="Cd",required = true)
    protected String cd;
    @XmlElement(name="Prtry",required = true)
    protected String prtry;
}
