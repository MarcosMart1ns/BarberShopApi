package com.barbershop.controllers;

import com.barbershop.BarbershopApplicationTests;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

public class ControllerTestHelper extends BarbershopApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    static URI uri;

    public void assertRequest(URI uri, HttpMethod httpMethod, String bodySent, String bodyExpected, HttpStatus statusExpected) throws Exception {
        doRequest(
                uri,
                httpMethod,
                bodySent
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
        doRequest(
                uri,
                HttpMethod.GET
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

    public ResultActions doRequest(URI uri, HttpMethod httpMethod, String body) throws Exception {
        return mockMvc.perform(
                MockMvcRequestBuilders
                        .request(httpMethod, uri)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body)
        );
    }

    public ResultActions doRequest(URI uri, HttpMethod httpMethod) throws Exception {
        return this.doRequest(uri, httpMethod,null);
    }
}
