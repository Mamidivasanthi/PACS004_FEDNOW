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
@XmlType(name="OrganisationIdentification29__1",propOrder = {
        "anyBIC",
        "lEI",
        "othr"
})
public class OrganisationIdentification291 {
    @XmlElement(name="AnyBIC")
    protected String anyBIC;
    @XmlElement(name="LEI")
    protected String lEI;
    @XmlElement(name="Othr")
    protected GenericOrganisationIdentification1 Othr;
}
