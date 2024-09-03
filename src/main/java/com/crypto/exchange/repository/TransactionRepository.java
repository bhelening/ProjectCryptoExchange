package com.crypto.exchange.repository;

import com.crypto.exchange.model.Transaction;

public interface TransactionRepository {
    void createTransaction(Transaction transaction);
    Transaction getTransaction(long id);
    void updateTransaction(Transaction transaction);
    void deleteTransaction(long id);
}