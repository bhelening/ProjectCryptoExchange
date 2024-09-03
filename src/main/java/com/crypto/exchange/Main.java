package com.crypto.exchange;

import com.crypto.exchange.model.Cryptocurrency;

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Cryptocurrency
        Cryptocurrency bitcoin = new Cryptocurrency(1, "Bitcoin", "BTC", 35000.0);

        // Verificamos que los getters funcionen correctamente
        System.out.println("ID: " + bitcoin.getId());
        System.out.println("Name: " + bitcoin.getName());
        System.out.println("Symbol: " + bitcoin.getSymbol());
        System.out.println("Price: " + bitcoin.getPrice());

        // Modificamos el precio del bitcoin
        bitcoin.setPrice(36000.0);

        // Verificamos que el setter haya funcionado correctamente
        System.out.println("New Price: " + bitcoin.getPrice());
    }
}