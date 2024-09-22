package com.Instanpe.pacs004.Xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ChargeBearerType1Code__1")
@XmlEnum

public enum ChargeBearerType1Code1 {
    @XmlSchemaType(name="String")
    SLEV;
    public String getValue(){
        return name();
    }

}
