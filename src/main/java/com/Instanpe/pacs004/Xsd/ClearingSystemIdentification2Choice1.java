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
@XmlType(name="ClearingSystemIdentification2Choice__1",propOrder = {"Cd"})
public class ClearingSystemIdentification2Choice1 {
    @XmlElement(name="Cd",required = true)
    protected ExternalClearingSystemIdentification1Codefixed Cd;
}
