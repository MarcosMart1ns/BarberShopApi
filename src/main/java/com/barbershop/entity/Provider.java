package com.barbershop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "USER")
@Entity
public class Provider extends User {

    public Provider(String name, String email, String password) {
        super(name, email, password);
        this.provider = true;
    }

    public Provider() {
        this.provider = true;
    }
}