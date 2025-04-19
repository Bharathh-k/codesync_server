package com.example.colabed.service;

import com.example.colabed.api.model.User;
import com.example.colabed.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveOrUpdate(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        return existingUser.orElseGet(() -> userRepository.save(user));
    }
}
