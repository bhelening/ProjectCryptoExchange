package com.crypto.exchange.model;

public class Order {
    private int id;
    private Cryptocurrency cryptocurrency;
    private double amount;
    private double price;
    private OrderType type;

    public enum OrderType {
        BUY,
        SELL
    }

    public Order(int id, Cryptocurrency cryptocurrency, double amount, double price, OrderType type) {
        this.id = id;
        this.cryptocurrency = cryptocurrency;
        this.amount = amount;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public Cryptocurrency getCryptocurrency() {
        return this.cryptocurrency;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public OrderType getType() {
        return this.type;
    }
}
