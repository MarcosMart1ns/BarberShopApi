package com.barbershop.business;

import com.barbershop.entity.User;

public interface SessionBU {

    User createSession(User user) throws Exception;

}
