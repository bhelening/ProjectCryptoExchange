package com.crypto.exchange.model;

public class User {
    private long id;
    private String name;
    private String email;
    private String password;

    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void register() {
        // Lógica de registro
        // Por ahora, no hay lógica de registro implementada
    }

    public void login() {
        // Lógica de inicio de sesión
        // Por ahora, no hay lógica de inicio de sesión implementada
    }

    public void logout() {
        // Lógica de cierre de sesión
        // Por ahora, no hay lógica de cierre de sesión implementada
    }
}