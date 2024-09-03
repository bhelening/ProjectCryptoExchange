package com.crypto.exchange.controller;

import com.crypto.exchange.model.Cryptocurrency;
import com.crypto.exchange.repository.CryptocurrencyRepository;

public class CryptocurrencyController {
    private CryptocurrencyRepository cryptocurrencyRepository;

    public CryptocurrencyController(CryptocurrencyRepository cryptocurrencyRepository) {
        this.cryptocurrencyRepository = cryptocurrencyRepository;
    }

    public void getPrice(String symbol) {
        Cryptocurrency cryptocurrency = cryptocurrencyRepository.getCryptocurrencyBySymbol(symbol);
        // Lógica para obtener el precio de la criptomoneda
    }
}