package com.barbershop.domain.dto;

import com.barbershop.domain.entities.Provider;
import com.barbershop.domain.entities.User;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AppointmentDTO {

    private Long id;

    private Date date;

    private User customer;

    private Provider provider;

    public String toJson(){
        return "{" +
                //TODO: Inserir retorno json de Appointment
                "}";
    }
}
