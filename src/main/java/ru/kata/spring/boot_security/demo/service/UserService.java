package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;


import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
    User getUserByUsername(String username);
    void addDefaultUser();
    User passwordCoder(User user);
}