package com.barbershop.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "USER")
@Entity
public class Provider extends User {

    private final boolean provider = true;
    public Provider() {
    }
}