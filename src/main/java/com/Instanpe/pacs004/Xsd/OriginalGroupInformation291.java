package com.Instanpe.pacs004.Xsd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="OriginalGroupInformation29__1",propOrder = {
        "OrgnlMsgId",
        "OrgnlMsgNmId",
        "OrgnlCreDtTm"


})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OriginalGroupInformation291 {
    @XmlElement(name="OrgnlMsgId",required = true)
    protected String OrgnlMsgId;
    @XmlElement(name="OrgnlMsgNmId",required = true)
    protected String OrgnlMsgNmId;
    @XmlElement(name="OrgnlCreDtTm",required = true)
    protected XMLGregorianCalendar OrgnlCreDtTm;

}
