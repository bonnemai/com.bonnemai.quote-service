package com.bonnemai.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Vanilla {
    @Getter @Setter long id;

    // Economics
    @Getter @Setter String quote;
    @Getter @Setter String ticker;
    @Getter @Setter Double strike;
    @Getter @Setter String moneyNess;
    @Getter @Setter Date expiry;
    @Getter @Setter Date startDate;
    @Getter @Setter String ccy;

    // Market Data
    @Getter @Setter Double spot;
    @Getter @Setter Double vol;

    // Outputs
    @Getter @Setter Double premium;
    @Getter @Setter Double vega;
    @Getter @Setter Double delta;
    @Getter @Setter Double gamma;
    @Getter @Setter Double theta;

    public Vanilla(long id, String ticker, Double strike, String moneyNess, Date expiry, Double spot) {
        this.id= id;
        this.ticker=ticker;
        this.strike = strike;
        this.moneyNess = moneyNess;
        this.expiry = expiry;
        this.spot = spot;
    }
}
