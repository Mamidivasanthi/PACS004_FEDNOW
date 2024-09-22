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
@XmlType(name="FinancialInstitutionIdentification18__1",propOrder = {"ClrSysMmbId"})
public class FinancialInstitutionIdentification181 {
    @XmlElement(name="ClrSysMmbId",required = true)
    protected ClearingSystemMemberIdentification21 ClrSysMmbId;
}
