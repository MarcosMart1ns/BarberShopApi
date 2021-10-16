package com.barbershop.DTO;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String name;
    private String email;
    private String password;
    private boolean provider;

    public UserDTO(String name, String email, String password, boolean provider) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.provider = provider;
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
}
