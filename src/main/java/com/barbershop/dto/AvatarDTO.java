package com.barbershop.dto;

import java.io.Serializable;

public class AvatarDTO implements Serializable {

    public AvatarDTO(long id, String filename, String path) {
        this.id = id;
        this.filename = filename;
        this.path = path;
    }

    public AvatarDTO() {
    }

    private long id;

    private String filename;

    private String path;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String toJson() {
        return "{\n" +
                "\t\"filename\": \"" + filename + "\",\n" +
                "\t\"path\":\"" + path + "\"}";
    }
}
