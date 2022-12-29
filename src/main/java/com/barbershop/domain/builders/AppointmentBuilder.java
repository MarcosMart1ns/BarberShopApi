package com.barbershop.domain.builders;

import com.barbershop.domain.entities.Appointment;
import com.barbershop.domain.entities.Provider;
import com.barbershop.domain.entities.User;

import java.util.Date;

public class AppointmentBuilder {

    Appointment appointment = new Appointment();

    public AppointmentBuilder date(Date date){
        appointment.setDate(date);
        return this;
    }

    public AppointmentBuilder user(User customer){
        appointment.setCustomer(customer);
        return this;
    }

    public AppointmentBuilder provider(Provider provider){
        appointment.setProvider(provider);
        return this;
    }

    public Appointment build(){
        return appointment;
    }
}
