package com.conversordemonedas.utils;

import com.conversordemonedas.models.ConversionRate;
import com.conversordemonedas.models.Currency;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    ExchangeRateApi exchangeRateApi = new ExchangeRateApi();
    private List<Currency> currencies = new ArrayList<>();
    private int base;
    private int target;
    private double amount;
    private double conversion;

    public void setValues() {
        setCurrencies();
        setBase(97);
        setTarget(146);
        setAmount(1);
        conversion();
    }

    public void getCurrencies() {
        for (int i = 0; i < currencies.size(); i++) {
            System.out.println((i + 1) + ".- " + currencies.get(i));
        }
    }

    public void setCurrencies() {
        currencies = exchangeRateApi.getCurrencies();
    }

    public int sizeCurrencies() {
        return currencies.size();
    }

    public String getBase() {
        return currencies.get(base).getCode();
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getTarget() {
        return currencies.get(target).getCode();
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public double getAmount() {
        return amount;
    }

    public double getConversion() {
        return conversion;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void conversion() {
        ConversionRate conversionRate = exchangeRateApi.getConversionRate(getBase(), getTarget());
        this.conversion = amount * conversionRate.conversion_rate();
    }

    public void showConversion() {
        System.out.println("De: " + getBase() + " - " + getAmount() + " - A: " + getTarget() + " - " + getConversion());
    }
}