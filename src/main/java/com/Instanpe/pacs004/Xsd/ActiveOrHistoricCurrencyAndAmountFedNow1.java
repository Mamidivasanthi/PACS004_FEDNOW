package com.Instanpe.pacs004.Xsd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ActiveOrHistoricCurrencyAndAmount_FedNow_1",propOrder = {"value"})
public class ActiveOrHistoricCurrencyAndAmountFedNow1 {
    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name="Ccy",required = true)
    protected ActiveCurrencyCodefixed Ccy;
}
