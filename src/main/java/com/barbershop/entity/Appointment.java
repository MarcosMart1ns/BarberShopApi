package com.barbershop.entity;

import com.sun.istack.NotNull;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    private Long id;

    @NotNull
    private Date date;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Provider provider;

}
