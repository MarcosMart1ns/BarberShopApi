package com.barbershop.domain.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Data
public class Avatar {

    @Id
    @GeneratedValue
    private long id;

    private String fileName;

    private String path;

}
