package com.Instanpe.pacs004.Xsd;

import lombok.Data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ActiveCurrencyCode_fixed")
@XmlEnum
public enum ActiveCurrencyCodefixed {
    USD;
    public String getName(){
        return name();
    }
}
