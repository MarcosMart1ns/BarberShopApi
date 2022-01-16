package com.barbershop.controllers;


import com.barbershop.DTO.UserDTO;
import com.barbershop.business.UserBU;
import com.barbershop.mappers.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SessionTest extends ControllerTestHelper{

    @Autowired
    UserBU userBU;

    @Test
    public void testCreateSession() throws Exception {
        URI uri = new URI("/session");

        UserDTO user = new UserDTO("","maria@hotmail.com", "098a8i-diasd8-",false);

        userBU.createUser(new UserMapper().toObject(user));

        assertRequest(
                uri,
                HttpMethod.POST,
                user.toString(),
                user.toString(),
                HttpStatus.CREATED
        );
    }
}
