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
@XmlType(name="Party38Choice__1",propOrder = {
        "orgId","prvtId"
})
public class Party38Choice1 {
    @XmlElement(name="OrgId",required=true)
    protected OrganisationIdentification291 orgId;
    @XmlElement(name="PrvtId",required = true)
    protected PersonIdentification131 prvtId;

}
