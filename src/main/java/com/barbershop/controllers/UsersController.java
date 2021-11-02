package com.barbershop.controllers;

import com.barbershop.entity.User;
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
    public User createUser(@RequestBody User user){
        return user;
    }

    @PutMapping
    @ResponseBody
    public User updateUser(@RequestBody User user){
        return user;
    }
}
