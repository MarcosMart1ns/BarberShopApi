package com.barbershop.domain.entities;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Builder
public class Appointment implements Serializable {

    @Id
    private Long id;

    @NotNull
    private Date date;

    @ManyToOne
    private User customer;

    @ManyToOne
    private Provider provider;

    public Appointment() {

    }
}
