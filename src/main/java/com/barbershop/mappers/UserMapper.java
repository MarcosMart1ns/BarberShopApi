package com.barbershop.mappers;

import com.barbershop.DTO.UserDTO;
import com.barbershop.entity.User;

public class UserMapper  {

    public UserDTO toDTO(User user){

        return new UserDTO(
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                false
        );
    }

    public User toObject(UserDTO userDTO){
        return new User(
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                false
        );
    }
}
