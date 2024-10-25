package com.alura;

import com.google.gson.JsonObject;

import java.io.IOException;

public class CurrencyConverter {

    private JsonObject rates;

    public CurrencyConverter() throws IOException {
        this.rates = ExchangeRateAPI.getExchangeRates().getAsJsonObject("conversion_rates");
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double fromRate = rates.get(fromCurrency).getAsDouble();
        double toRate = rates.get(toCurrency).getAsDouble();
        return (amount / fromRate) * toRate;
    }
}
