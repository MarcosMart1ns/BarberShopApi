package com.barbershop.controllers;


import com.barbershop.domain.dto.UserDTO;
import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.net.URI;

public class SessionTest extends ControllerTestHelper{

    @Test
    public void testCreateSession() throws Exception {
        URI uri = new URI("/session");

        UserDTO user = createAnUserWithoutAvatar();

        assertRequest(
                uri,
                HttpMethod.POST,
                user.toJson(),
                user.toJson(),
                HttpStatus.CREATED
        );
    }
}
