package com.barbershop.domain.dto;

import com.barbershop.domain.entities.Appointment;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class UserDTO{
    private String name;
    private String email;
    private String password;
    private AvatarDTO avatar;
    private List<AppointmentDTO> appointments;
    private boolean provider = false;

    public String toJson(){
        return "{\n" +
                "\t\"name\": \"" + name + "\",\n" +
                "\t\"email\":\"" + email + "\",\n" +
                "\t\"password\":\"" + password + "\",\n" +
                "\t\"appointments\":" + appointments.toString() + ",\n" +
                "\t\"avatar\":" + (avatar == null ? null : avatar.toJson()) + ",\n" + //TODO: code smell, resolver depois
                "\t\"provider\":" + provider +
                "\n}";
    }
}
