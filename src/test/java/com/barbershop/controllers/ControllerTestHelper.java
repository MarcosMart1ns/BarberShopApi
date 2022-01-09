package com.barbershop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

public class ControllerTestHelper {

    @Autowired
    private MockMvc mockMvc;

    public void assertRequest(URI uri, HttpMethod httpMethod, String bodySent, String bodyExpected, HttpStatus statusExpected) throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .request(httpMethod, uri)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bodySent)
        ).andExpect(
                MockMvcResultMatchers
                        .status()
                        .is(statusExpected.value())
        ).andExpect(
                MockMvcResultMatchers
                        .content()
                        .json(bodyExpected)
        );
    }

    public void assertGetRequest(URI uri,String bodyExpected) throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .get(uri)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(
                MockMvcResultMatchers
                        .status()
                        .is(200)
        ).andExpect(
                MockMvcResultMatchers
                        .content()
                        .json(bodyExpected)
        );
    }
}
