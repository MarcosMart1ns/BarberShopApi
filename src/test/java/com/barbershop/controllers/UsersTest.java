package com.barbershop.controllers;

import com.barbershop.DTO.UserDTO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.net.URI;
import java.net.URISyntaxException;


public class UsersTest extends ControllerTestHelper {
    @Before
    public void beforeAll() throws URISyntaxException {
        uri = new URI("/users");
    }

    @Test
    public void testCreateUser() throws Exception {

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
    public void testUpdateUser() throws Exception {
        UserDTO user = createAnUser();

        doRequest(uri,HttpMethod.POST,user.toString());

        assertRequest(
                uri,
                HttpMethod.PATCH,
                user.toString(),
                user.toString(),
                HttpStatus.OK //Quando implementar update users, alterar para experar 201- Created
        );
    }

    @Test
    public void listProviders(){

    }

    public UserDTO createAnUser(){
        return new UserDTO(
                "Maria",
                "maria@hotmail.com",
                "098a8i-diasd8-",
                false);
    }

}