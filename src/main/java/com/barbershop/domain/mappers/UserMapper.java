package com.barbershop.domain.mappers;

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

       return UserDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password( user.getPassword())
                .provider(user.isProvider())
                .appointments(user.getAppointments())
                .avatar(avatar)
                .build();
    }

    public static User toObject(UserDTO userDTO){
        Avatar avatar = null;

        if (userDTO.getAvatar()!=null){
            avatar = AvatarMapper.toObject(userDTO.getAvatar());
        }

        return User.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .appointments(userDTO.getAppointments())
                .avatar(avatar)
                .provider(userDTO.isProvider())
                .password(userDTO.getPassword())
                .build();
    }
}
