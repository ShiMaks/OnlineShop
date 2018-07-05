package by.htp.shop.service;

import by.htp.shop.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    List<User> listUsers();
}
