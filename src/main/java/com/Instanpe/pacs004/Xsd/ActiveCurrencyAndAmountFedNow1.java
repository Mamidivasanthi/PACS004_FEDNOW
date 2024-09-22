package com.Instanpe.pacs004.Xsd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ActiveCurrencyAndAmount_FedNow_1",propOrder = {"value"})
public class ActiveCurrencyAndAmountFedNow1 {
    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name="Ccy",required = true)
    protected ActiveCurrencyCodefixed Ccy;

}
