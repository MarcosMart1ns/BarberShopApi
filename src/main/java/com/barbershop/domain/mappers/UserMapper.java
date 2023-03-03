package com.barbershop.domain.mappers;

import com.barbershop.domain.dto.AppointmentDTO;
import com.barbershop.domain.dto.AvatarDTO;
import com.barbershop.domain.dto.UserDTO;
import com.barbershop.domain.entities.Appointment;
import com.barbershop.domain.entities.Avatar;
import com.barbershop.domain.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper  {

    private UserMapper(){
        throw new IllegalArgumentException("Classe Utilitária");
    }

    public static UserDTO toDTO(User user){

        AvatarDTO avatar= null;

        if (user.getAvatar()!=null){
            avatar = AvatarMapper.toDTO(user.getAvatar());
        }
        List<AppointmentDTO> appointmentsDTO = new ArrayList<>();

        for (Appointment appointment: user.getAppointments()) {
            appointmentsDTO.add(AppointmentMapper.from(appointment));
        }

       return UserDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password( user.getPassword())
                .provider(user.isProvider())
                .appointments(appointmentsDTO)
                .avatar(avatar)
                .build();
    }

    public static User toObject(UserDTO userDTO){
        Avatar avatar = null;

        if (userDTO.getAvatar()!=null){
            avatar = AvatarMapper.toObject(userDTO.getAvatar());
        }

        List<Appointment> appointments = new ArrayList<>();

        for (AppointmentDTO appointmentDTO: userDTO.getAppointments()) {
            appointments.add(AppointmentMapper.from(appointmentDTO));
        }


        return User.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .appointments(appointments)
                .avatar(avatar)
                .provider(userDTO.isProvider())
                .password(userDTO.getPassword())
                .build();
    }
}
