package com.crypto.exchange.repository;


import com.crypto.exchange.model.Cryptocurrency;

public interface CryptocurrencyRepository {
    void createCryptocurrency(Cryptocurrency cryptocurrency);
    Cryptocurrency getCryptocurrency(long id);
    Cryptocurrency getCryptocurrencyBySymbol(String symbol); // Add this method
    void updateCryptocurrency(Cryptocurrency cryptocurrency);
    void deleteCryptocurrency(long id);
}