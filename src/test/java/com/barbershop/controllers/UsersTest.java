package com.barbershop.controllers;

import com.barbershop.DTO.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UsersTest extends ControllerTestHelper {

    @Test
    public void testCreateUser() throws Exception {
        URI uri = new URI("/users");

        UserDTO user = new UserDTO("Maria", "maria@hotmail.com", "098a8i-diasd8-", false);

        assertRequest(
                uri,
                HttpMethod.POST,
                user.toString(),
                user.toString(),
                HttpStatus.CREATED
        );

    }

    @Test
    public void testUpdateUser(){

    }

    @Test
    public void listProviders(){

    }

}