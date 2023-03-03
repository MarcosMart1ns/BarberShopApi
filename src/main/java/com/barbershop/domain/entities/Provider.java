package com.barbershop.domain.entities;

import javax.persistence.Entity;

@Entity
public class Provider extends User {
    private final boolean provider = true;
}