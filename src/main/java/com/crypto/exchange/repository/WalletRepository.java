package com.crypto.exchange.repository;

import com.crypto.exchange.model.Wallet;

public interface WalletRepository {
    void createWallet(Wallet wallet);
    Wallet getWallet(long id);
    void updateWallet(Wallet wallet);
    void deleteWallet(long id);
}