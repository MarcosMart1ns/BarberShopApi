package com.barbershop.domain.mappers;

import com.barbershop.domain.dto.AppointmentDTO;
import com.barbershop.domain.entities.Appointment;

public class AppointmentMapper {

    public AppointmentMapper() {
    }

    public static AppointmentDTO from(Appointment appointment) {
        return AppointmentDTO.builder()
                .id(appointment.getId())
                .date(appointment.getDate())
                .customer(appointment.getCustomer())
                .provider(appointment.getProvider())
                .build();
    }

    public static Appointment from(AppointmentDTO appointmentDTO) {
        return Appointment.builder()
                .id(appointmentDTO.getId())
                .date(appointmentDTO.getDate())
                .customer(appointmentDTO.getCustomer())
                .provider(appointmentDTO.getProvider())
                .build();
    }
}
