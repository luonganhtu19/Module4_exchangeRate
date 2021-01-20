package com.TuMangement.Exchange.service;

import com.TuMangement.Exchange.Model.MoneyType;

public class Exchange implements IExchange {
    public Exchange() {
    }
    @Override
    public double exchange(MoneyType moneyType) {
        if (moneyType.getNameMoney().equals("usd")) moneyType.setExchangeRate(23000);
        else moneyType.setExchangeRate(1/23000);
        double result=moneyType.getQuantityMoney()* moneyType.getExchangeRate();
        return result;
    }
}
