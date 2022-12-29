package com.barbershop.domain.mappers;

import com.barbershop.domain.builders.UserBuilder;
import com.barbershop.domain.dto.AvatarDTO;
import com.barbershop.domain.dto.UserDTO;
import com.barbershop.domain.entities.Avatar;
import com.barbershop.domain.entities.User;

public class UserMapper  {

    public static UserDTO toDTO(User user){

        AvatarDTO avatar= null;

        if (user.getAvatar()!=null){
            avatar = AvatarMapper.toDTO(user.getAvatar());
        }

        return new UserDTO(
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                avatar,
                user.getAppointments()
        );
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
                .password(userDTO.getPassword())
                .build();
    }
}
