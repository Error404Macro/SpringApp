package com.web.SpringApp.dao;


import com.web.SpringApp.models.User;

import java.util.List;

public interface UserDao {
    public List<User> index();
    public User show(int id);
    public void save(User user);
    public void update(int id, User updatedUser);
    public void delete(int id);
}
