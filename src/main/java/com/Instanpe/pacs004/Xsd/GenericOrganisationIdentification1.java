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
@XmlType(name="GenericOrganisationIdentification1",propOrder = {
        "id",
        "schemeName",
        "issr"
})
public class GenericOrganisationIdentification1 {
    @XmlElement(name="Id",required = true)
    protected String id;
    @XmlElement(name="SchemeNm")
    protected OrganisationIdentificationSchemeName1Choice schemeNm;
    @XmlElement(name="Issr")
    protected String issr;

}
