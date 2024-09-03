package com.crypto.exchange.model;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    private long id;
    private User user;
    private Order order;
    private BigDecimal amount;
    private Date date;
    private TransactionType type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void executeTransaction() {
        // Implementación del método executeTransaction()
        // Puedes agregar lógica para ejecutar la transacción aquí
    }
}