package com.barbershop.builders;

import com.barbershop.entities.Appointment;
import com.barbershop.entities.Provider;
import com.barbershop.entities.User;

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
