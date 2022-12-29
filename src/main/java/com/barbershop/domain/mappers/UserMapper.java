package com.barbershop.domain.mappers;

import com.barbershop.domain.builders.UserBuilder;
import com.barbershop.domain.dto.AvatarDTO;
import com.barbershop.domain.dto.UserDTO;
import com.barbershop.domain.entities.Avatar;
import com.barbershop.domain.entities.User;

public class UserMapper  {

    private UserMapper(){
        throw new IllegalArgumentException("Classe Utilitária");
    }

    public static UserDTO toDTO(User user){

        AvatarDTO avatar= null;

        if (user.getAvatar()!=null){
            avatar = AvatarMapper.toDTO(user.getAvatar());
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword( user.getPassword());
        userDTO.setProvider(user.isProvider());
        userDTO.setAppointments(user.getAppointments());
        userDTO.setAvatar(avatar);

       return  userDTO;
    }

    public static User toObject(UserDTO userDTO){
        Avatar avatar = null;

        if (userDTO.getAvatar()!=null){
            avatar = AvatarMapper.toObject(userDTO.getAvatar());
        }

        return new UserBuilder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .appointments(userDTO.getAppointments())
                .avatar(avatar)
                .isProvider(userDTO.isProvider())
                .password(userDTO.getPassword())
                .build();
    }
}
