package com.barbershop.controllers;

import com.barbershop.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    @ResponseBody
    public String getUsers(){
        /*Listar todos os providers*/
        return "deu bom";
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    @PutMapping
    @ResponseBody
    public User updateUser(@RequestBody User user){
        return user;
    }
}
