package com.crypto.exchange.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una billetera que almacena criptomonedas y saldo.
 */
public class Wallet {
    private List<Cryptocurrency> cryptocurrencies;
    private BigDecimal balance;

    /**
     * Constructor de la billetera que inicializa la lista de criptomonedas y el saldo en cero.
     */
    public Wallet() {
        this.cryptocurrencies = new ArrayList<>();
        this.balance = BigDecimal.ZERO;
    }

    /**
     * Agrega una criptomoneda a la billetera.
     *
     * @param cryptocurrency la criptomoneda a agregar
     */
    public void addCryptocurrency(Cryptocurrency cryptocurrency) {
        this.cryptocurrencies.add(cryptocurrency);
    }

    /**
     * Elimina una criptomoneda de la billetera.
     *
     * @param cryptocurrency la criptomoneda a eliminar
     */
    public void removeCryptocurrency(Cryptocurrency cryptocurrency) {
        this.cryptocurrencies.remove(cryptocurrency);
    }

    /**
     * Devuelve la lista de criptomonedas almacenadas en la billetera.
     *
     * @return la lista de criptomonedas
     */
    public List<Cryptocurrency> getCryptocurrencies() {
        return this.cryptocurrencies;
    }

    /**
     * Devuelve el saldo actual de la billetera.
     *
     * @return el saldo actual
     */
    public BigDecimal getBalance() {
        return this.balance;
    }

    /**
     * Establece el saldo de la billetera.
     *
     * @param balance el nuevo saldo
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Deposita un monto en la billetera.
     *
     * @param amount el monto a depositar
     */
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    /**
     * Retira un monto de la billetera.
     *
     * @param amount el monto a retirar
     * @throws InsufficientBalanceException si el saldo es insuficiente para la transacción
     */
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) > 0) {
            throw new InsufficientBalanceException("No tiene suficiente saldo para retirar");
        } else {
            this.balance = this.balance.subtract(amount);
        }
    }
}

/**
 * Excepción personalizada para manejar el caso en que el usuario intente retirar más fondos de los que tiene disponible.
 */
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}