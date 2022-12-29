package com.barbershop.controllers;

import com.barbershop.domain.dto.UserDTO;
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

        UserDTO user = createAnUserWithoutAvatar();

        assertRequest(
                uri,
                HttpMethod.POST,
                user.toJson(),
                user.toJson(),
                HttpStatus.CREATED
        );

    }

    @Test
    public void testUpdateUser() throws Exception {
        UserDTO user = createAnUserWithoutAvatar();

        doRequest(uri,HttpMethod.POST,user.toJson());

        assertRequest(
                uri,
                HttpMethod.PATCH,
                user.toJson(),
                user.toJson(),
                HttpStatus.OK //Quando implementar update users, alterar para experar 201- Created
        );
    }

    @Test
    public void listProviders(){

    }


}