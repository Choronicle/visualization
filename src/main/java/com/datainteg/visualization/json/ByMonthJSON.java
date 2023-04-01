package com.datainteg.visualization.json;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ByMonthJSON {
    BigDecimal[][] totalArray;
    String[] etcTopList;
    String[] sbybTopList;
    String[] sdrqTopList;
    String[] shopTopList;
}
