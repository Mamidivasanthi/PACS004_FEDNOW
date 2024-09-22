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
@XmlType(name="ClearingSystemMemberIdentification2__1",propOrder = {"ClrSysId","MmbId"})
public class ClearingSystemMemberIdentification21 {
    @XmlElement(name="ClrSysId",required = true)
    protected ClearingSystemIdentification2Choice1 ClrSysId;
    @XmlElement(name="MmbId",required = true)
    protected  String MmbId;

}
