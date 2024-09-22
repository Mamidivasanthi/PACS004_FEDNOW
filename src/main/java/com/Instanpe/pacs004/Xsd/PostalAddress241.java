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
@XmlType(name="PostalAddress24__1",propOrder = {
        "dept",
        "subDept",
        "strNm",
        "bldgNb",
        "bldgNm",
        "flr",
        "pstBx",
        "room",
        "pstCd",
        "twnNm",
        "twnLctnNm",
        "dstrctNm",
        "ctrySubDvsn",
        "ctry",
        "adrLine"

})
public class PostalAddress241 {
    @XmlElement(name="Dept")
    protected String dept;
    @XmlElement(name="SubDept")
    protected String subDept;
    @XmlElement(name="StrNm")
    protected String strNm;
    @XmlElement(name="BldgNb")
    protected String bldgNb;
    @XmlElement(name="BldgNm")
    protected String bldgNm;
    @XmlElement(name="Flr")
    protected String flr;
    @XmlElement(name="PstBx")
    protected String pstBx;
    @XmlElement(name="Room")
    protected String room;
    @XmlElement(name="PstCd",required = true)
    protected String pstCd;
    @XmlElement(name="TwnNm",required = true)
    protected String twnNm;
    @XmlElement(name="TwnLctNm")
    protected String twnLctNm;
    @XmlElement(name="DstrctNm")
    protected String dstctNm;
    @XmlElement(name="CtrySubDvsn",required = true)
    protected String ctrySubdvsn;
    @XmlElement(name="Ctry",required = true)
    protected String Ctry;
    @XmlElement(name="AdrLine")
    protected String adrLine;



}
