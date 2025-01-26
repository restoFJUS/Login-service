package com.restoreserva.login_service.services;

import com.restoreserva.login_service.entity.User;

import java.util.List;

public interface UserServiceInt {

    public List<User> listAllUser();
    public User getUser(Long id);
    public User createUser(User user);
    public User updateUser(User user);
    public  void deleteUser(Long id);
    public User loginUser(String userName, String password);
}
