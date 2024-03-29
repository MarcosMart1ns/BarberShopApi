package com.barbershop.controllers;

import com.barbershop.domain.dto.UserDTO;
import com.barbershop.business.UserBU;
import com.barbershop.domain.entities.User;
import com.barbershop.domain.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserBU userBU;

    @GetMapping
    @ResponseBody
    public String getUsers(){
        /*Listar todos os providers*/
        return "deu bom";
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO){

        User userCreated = userBU.createUser(UserMapper.toObject(userDTO));

        return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
    }

    @PatchMapping
    @ResponseBody
    public User updateUser(@RequestBody User user){
        return user;
    }
}
