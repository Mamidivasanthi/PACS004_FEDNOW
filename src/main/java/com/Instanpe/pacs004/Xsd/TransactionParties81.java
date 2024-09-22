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
@XmlType(name="TransactionParties8__1",propOrder = {
        "ultmtDbtr",
        "dbtr",
        "dbtrAcct",
        "initgPty",
        "dbtrAgt",
        "cdtrAgt",
        "cdtr",
        "cdtrAcct",
        "ultmtCdtr"
})
public class TransactionParties81 {
    @XmlElement(name="UltmtDbtr")
    protected Party40Choice1 ultmtDbtr;

}
