package com.crypto.exchange.model;

public class Cryptocurrency {
    private long id;
    private String name;
    private String symbol;
    private double price;

    public Cryptocurrency(long id, String name, String symbol, double price) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}