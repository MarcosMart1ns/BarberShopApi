package com.barbershop.business;

import com.barbershop.entities.User;

public interface SessionBU {

    User createSession(User user) throws Exception;

}
