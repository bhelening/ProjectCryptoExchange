package com.crypto.exchange.repository;

import com.crypto.exchange.model.User;

public interface UserRepository {
    void createUser(User user);
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);
}