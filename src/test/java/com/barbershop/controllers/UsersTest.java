package com.barbershop.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UsersTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateUsers() throws Exception {
        URI uri = new URI("/users");

        mockMvc.perform(
                MockMvcRequestBuilders.get(uri)
        ).andExpect(
                MockMvcResultMatchers
                        .status()
                        .is(200));
    }
}