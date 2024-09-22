package com.Instanpe.pacs004.Xsd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BranchAndFinancialInstitutionIdentification6__1",propOrder = {"FinInstnId"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchAndFinancialInstitutionIdentification61 {
    @XmlElement(name="FinInstnId",required = true)
    protected FinancialInstitutionIdentification181 FinInstnId;
}
