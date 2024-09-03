package com.crypto.exchange.controller;

import com.crypto.exchange.model.Transaction;
import com.crypto.exchange.repository.TransactionRepository;

public class TransactionController {
    private TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void getTransaction(long transactionId) {
        Transaction transaction = transactionRepository.getTransaction(transactionId);
        // Lógica para obtener la transacción
    }

    public void createTransaction(Transaction transaction) {
        transactionRepository.createTransaction(transaction);
    }
}
