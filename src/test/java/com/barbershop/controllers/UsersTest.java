package com.barbershop.controllers;

import com.barbershop.DTO.UserDTO;
import com.barbershop.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UsersTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateUsers() throws Exception {
        URI uri = new URI("/users");
        UserDTO user = new UserDTO("Maria","maria@hotmail.com","098a8i-diasd8-",false);

        mockMvc.perform(
                MockMvcRequestBuilders
                        .post(uri)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(user.toString())
        ).andExpect(
                MockMvcResultMatchers
                        .status()
                        .is(201)
        ).andExpect(
                MockMvcResultMatchers
                        .content()
                        .json(user.toString())
        );
    }
}