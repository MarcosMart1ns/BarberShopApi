package com.barbershop.builders;

import com.barbershop.entities.Avatar;

public class AvatarBuilder {

    Avatar avatar = new Avatar();

    public AvatarBuilder filename(String filename){
        avatar.setFileName(filename);
        return this;
    }

    public AvatarBuilder path(String path){
        avatar.setFileName(path);
        return this;
    }

    public Avatar build(){
        return avatar;
    }
}
