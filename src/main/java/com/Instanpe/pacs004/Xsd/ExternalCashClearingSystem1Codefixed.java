package com.Instanpe.pacs004.Xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name="ExternalCashClearingSystem1Code_fixed")
public enum ExternalCashClearingSystem1Codefixed {
    @XmlSchemaType(name="string")
    FDN;
    public String getName(){
        return name();
    }
}
