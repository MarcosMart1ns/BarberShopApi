package com.barbershop.dto;

import com.barbershop.entities.Appointment;

import java.io.Serializable;
import java.util.List;

public class UserDTO implements Serializable {
    private String name;
    private String email;
    private String password;
    private AvatarDTO avatar;
    private List<Appointment> appointments;
    private boolean provider = false;

    public UserDTO(String name, String email, String password,AvatarDTO avatar, List<Appointment> appointments) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.appointments = appointments;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isProvider() {
        return provider;
    }

    public void setProvider(boolean provider) {
        this.provider = provider;
    }

    public AvatarDTO getAvatar() {
        return avatar;
    }

    public void setAvatar(AvatarDTO avatar) {
        this.avatar = avatar;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

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
