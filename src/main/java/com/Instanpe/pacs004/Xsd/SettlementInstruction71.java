package com.Instanpe.pacs004.Xsd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SettlementInstruction7__1",propOrder = {
      "SttlmMtd",
      "ClrSys"
})
public class SettlementInstruction71 {
    @XmlElement(name="SttlmMtd",required = true)
    protected SettlementMethod1Code1 SttlmMtd;
    @XmlElement(name="ClrSys",required = true)
    protected ClearingSystemIdentification3Choice1 ClrSys;

}
