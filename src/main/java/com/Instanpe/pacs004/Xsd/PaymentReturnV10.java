package com.Instanpe.pacs004.Xsd;

import iso.std.iso._20022.tech.xsd.pacs_004_001.GroupHeader901;
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
@XmlType(name="PaymentReturnV10",propOrder = {"GrpHdr","TxInf"})
public class PaymentReturnV10 {
    @XmlElement(name="GrpHdr",required=true)
    protected GroupHeader901 GrpHdr;
    @XmlElement(name="TxInf",required=true)
    protected PaymentTransaction1181 TxInf;



}
