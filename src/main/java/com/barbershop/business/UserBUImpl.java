package com.barbershop.business;

import com.barbershop.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserBUImpl implements UserBU{

    @Override
    public User createUser(User user) {
        return user;
    }

}
