package com.TuMangement.Exchange.Model;

public class MoneyType implements Money {
    private String NameMoney;
    private double quantityMoney;
    private double exchangeRate;

    public MoneyType(){};

    public MoneyType(String nameMoney, double quantityMoney, double exchangeRate) {
        NameMoney = nameMoney;
        this.quantityMoney = quantityMoney;
        this.exchangeRate = exchangeRate;
    }

    public MoneyType(String nameMoney, double quantityMoney) {
        NameMoney = nameMoney;
        this.quantityMoney = quantityMoney;
    }

    public String getNameMoney() {
        return NameMoney;
    }

    public void setNameMoney(String nameMoney) {
        NameMoney = nameMoney;
    }

    public double getQuantityMoney() {
        return quantityMoney;
    }

    public void setValueMoney(double quantityMoney) {
        this.quantityMoney = quantityMoney;
    }

    @Override
    public double exchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
