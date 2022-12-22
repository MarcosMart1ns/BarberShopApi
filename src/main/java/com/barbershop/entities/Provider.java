package com.barbershop.entities;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "USER")
@Entity
public class Provider extends User {
    public Provider() {
        this.provider = true;
    }
}