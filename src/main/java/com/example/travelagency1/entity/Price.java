package com.example.travelagency1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Price {

    BigDecimal cost;

    String currency;
}
