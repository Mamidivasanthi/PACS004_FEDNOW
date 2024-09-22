package com.Instanpe.pacs004.Xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ExternalClearingSystemIdentification1Code_fixed")
@XmlEnum
public enum ExternalClearingSystemIdentification1Codefixed {
USABA;
public String getValue(){
    return name();
}
}
