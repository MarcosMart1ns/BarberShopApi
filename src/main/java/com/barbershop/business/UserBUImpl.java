package com.barbershop.business;

import com.barbershop.entities.User;
import com.barbershop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBUImpl implements UserBU{

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserbyEmail(User user) {
        return userRepository.findByEmail(user.getEmail());
    }

}
