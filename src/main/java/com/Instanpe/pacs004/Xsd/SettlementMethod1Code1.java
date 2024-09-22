package com.Instanpe.pacs004.Xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SettlementMethod1Code__1")
@XmlEnum
public enum SettlementMethod1Code1 {
    @XmlSchemaType(name="string")
    CLRG;
    public String getName(){
        return name();
    }
}
