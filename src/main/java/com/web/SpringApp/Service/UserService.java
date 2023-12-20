package com.web.SpringApp.Service;

import com.web.SpringApp.dao.UserDao;
import com.web.SpringApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.index();
    }

    public User getUserById(int id) {
        return userDao.show(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void updateUser(int id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    public void deleteUser(int id) {
        userDao.delete(id);
    }
}
