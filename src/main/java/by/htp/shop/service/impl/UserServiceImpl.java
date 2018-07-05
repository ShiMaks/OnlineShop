package by.htp.shop.service.impl;

import by.htp.shop.dao.UserDaoImpl;
import by.htp.shop.domain.User;
import by.htp.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public void addUser(User user) {
        this.userDao.create(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.update(user);
    }

    @Override
    public User getUser(int id) {
        return this.userDao.read(id);
    }

    @Override
    public void deleteUser(int id) {
        this.userDao.delete(id);
    }

    @Override
    public List<User> listUsers() {
        return this.userDao.readAll();
    }
}
