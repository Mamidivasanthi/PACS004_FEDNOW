package com.Instanpe.pacs004.Xsd;

import iso.std.iso._20022.tech.xsd.pacs_004_001.SettlementInstruction71;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GroupHeader90__1",propOrder =
        {
                "MsgId",
                "CreDtTm",
                "NbOfTxs",
                "SttlmInf"
        })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupHeader901 {
    @XmlElement(name="MsgId",required = true)
    protected String MsgId;
    @XmlElement(name="CreDTm",required = true)
    protected XMLGregorianCalendar CreDTm;
    @XmlElement(name="NbOfTxs",required = true)
    protected String NbOfTxs;
    @XmlElement(name="SttlmInf",required = true)
    protected SettlementInstruction71 SttlmInf;





}
