package com.barbershop.controllers;

import com.barbershop.dto.UserDTO;
import com.barbershop.business.SessionBU;
import com.barbershop.entities.User;
import com.barbershop.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    SessionBU sessionBU;

    @PostMapping
    @ResponseBody
    public ResponseEntity createSession(@RequestBody UserDTO userDTO){

        try{
            User user = sessionBU.createSession(UserMapper.toObject(userDTO));
            return new ResponseEntity(user, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.UNAUTHORIZED);
        }
    }

}