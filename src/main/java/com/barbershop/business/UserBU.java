package com.barbershop.business;

import com.barbershop.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserBU {

    User createUser(User user);

}
