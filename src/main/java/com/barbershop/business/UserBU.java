package com.barbershop.business;

import com.barbershop.domain.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserBU {

    User createUser(User user);

    User getUserbyEmail(User user);

}
