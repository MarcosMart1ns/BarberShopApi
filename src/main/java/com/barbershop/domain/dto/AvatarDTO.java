package com.barbershop.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class AvatarDTO implements Serializable {

    private long id;

    private String filename;

    private String path;

    public String toJson() {
        return "{\n" +
                "\t\"filename\": \"" + filename + "\",\n" +
                "\t\"path\":\"" + path + "\"}";
    }
}
