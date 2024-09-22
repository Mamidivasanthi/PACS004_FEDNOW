package com.Instanpe.pacs004.Xsd;

import iso.std.iso._20022.tech.xsd.pacs_004_001.OrganisationIdentification291;
import iso.std.iso._20022.tech.xsd.pacs_004_001.OriginalGroupInformation291;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PaymentTransaction118__1",propOrder =
        {
                "RtrId",
                "OrgnlGrpInf",
                "OrgnlInstrId",
                "OrgnlEndToEndId",
                "OrgnlTxId",
                "OrgnlUETR",
                "OrgnlIntrBkSttlmAmt",
                "OrgnlIntrBkSttlmDt",
                "RtrdIntrBkSttlmAmt",
                "IntrBkSttlmDt",
                "CompstnAmt",
                "ChrgBr",
                "InstgAgt",
                "InstdAgt",
                "RtrChain",
                "RtrRsnInf",
                "OrgnlTxRef",
        })
public class PaymentTransaction1181 {
    @XmlElement(name="RtrId")
    protected String RtrId;
    @XmlElement(name="OrgnlGrpInf",required = true)
    protected OriginalGroupInformation291 OrgnlGrpInf;
    @XmlElement(name="OrgnlInstrId")
    protected String OrgnlInstrId;
    @XmlElement(name="OrgnlEndToEndId")
    protected String OrgnlEndToEndId;
    @XmlElement(name="OrgnlTxId")
    protected String OrgnlTxId;
    @XmlElement(name="OrgnlUETR")
    protected String OrgnlUETR;
    @XmlElement(name="OrgnlIntrBkSttlmAmt",required = true)
    protected ActiveOrHistoricCurrencyAndAmountFedNow1 OrgnlIntrBkSttlmAmt;
    @XmlElement(name="OrgnlIntrBkSttlmDt",required = true)
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar OrgnlIntrBkSttlmDt;
    @XmlElement(name="RtrdIntrBkSttlmAmt",required = true)
    protected ActiveCurrencyAndAmountFedNow1 RtrdIntrBkSttlmAmt;
    @XmlElement(name="IntrBkSttlmDt",required = true)
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar IntrBkSttlmDt;
    @XmlElement(name="CompstnAmt")
    protected ActiveOrHistoricCurrencyAndAmountFedNow1 CompstnAmt;
    @XmlElement(name="ChrgBr",required = true)
    protected ChargeBearerType1Code1 ChrgBr;
    @XmlElement(name="InstgAgt",required = true)
    protected BranchAndFinancialInstitutionIdentification61 InstgAgt;
    @XmlElement(name="RtrChain",required = true)
    protected TransactionParties81 RtrChain;










}
