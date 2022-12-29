package com.barbershop.business;

import com.barbershop.domain.entities.User;

public interface SessionBU {

    User createSession(User user) throws Exception;

}
