package com.barbershop.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avatar {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String fileName;

    @NotNull
    private String path;

}
