package com.Instanpe.pacs004.Xsd;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Document",propOrder = {"PmtRtr"})
public class Document {
    @XmlElement(name="PmtRtr",required=true)
    @Autowired
    protected PaymentReturnV10 PmtRtr;

}
