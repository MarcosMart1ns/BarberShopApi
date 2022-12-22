package com.barbershop.builders;

import com.barbershop.entities.Appointment;
import com.barbershop.entities.Avatar;
import com.barbershop.entities.User;

import java.util.List;

public class UserBuilder {

    User user = new User();

    public UserBuilder name(String name){
        user.setName(name);
        return this;
    }

    public UserBuilder email(String email){
        user.setEmail(email);
        return this;
    }

    public UserBuilder password(String password){
        user.setPassword(password);
        return this;
    }

    public UserBuilder avatar(Avatar avatar){
        user.setAvatar(avatar);
        return this;
    }

    public UserBuilder appointments(List<Appointment> appointments){
        user.setAppointments(appointments);
        return this;
    }

    public User build(){
        return user;
    }
}