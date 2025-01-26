package com.restoreserva.login_service.services;

import com.restoreserva.login_service.entity.User;
import com.restoreserva.login_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInt{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> listAllUser() {
        return List.of();
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

        User userDB = getUser(id);
        if (null != userDB){
            userRepository.delete(userDB);
        }
    }

    @Override
    public User loginUser(String username, String password) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new IllegalArgumentException("El usuario ya existe");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole("admin");
        userRepository.save(user);
        return user;
    }
}
