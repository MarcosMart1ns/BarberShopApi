package com.barbershop.domain.builders;

import com.barbershop.domain.entities.Appointment;
import com.barbershop.domain.entities.Avatar;
import com.barbershop.domain.entities.Provider;
import com.barbershop.domain.entities.User;

import java.util.List;

public class ProviderBuilder {

    Provider provider = new Provider();

    public ProviderBuilder name(String name){
        provider.setName(name);
        return this;
    }

    public ProviderBuilder email(String email){
        provider.setEmail(email);
        return this;
    }

    public ProviderBuilder password(String password){
        provider.setPassword(password);
        return this;
    }

    public ProviderBuilder avatar(Avatar avatar){
        provider.setAvatar(avatar);
        return this;
    }

    public ProviderBuilder appointments(List<Appointment> appointments){
        provider.setAppointments(appointments);
        return this;
    }

    public User build(){
        return provider;
    }
}
