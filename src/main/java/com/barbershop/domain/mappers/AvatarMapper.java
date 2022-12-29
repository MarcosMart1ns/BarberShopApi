package com.barbershop.domain.mappers;

import com.barbershop.domain.builders.AvatarBuilder;
import com.barbershop.domain.dto.AvatarDTO;
import com.barbershop.domain.entities.Avatar;

public class AvatarMapper {

    private AvatarMapper(){
        throw new IllegalArgumentException("Classe utilitária");
    }

    public static AvatarDTO toDTO(Avatar avatar){

        AvatarDTO avatarDTO = new AvatarDTO();
        avatarDTO.setId(avatar.getId());
        avatarDTO.setFilename(avatar.getFileName());
        avatarDTO.setPath(avatarDTO.getPath());

        return avatarDTO;
    }

    public static Avatar toObject(AvatarDTO avatarDTO){
        return new AvatarBuilder()
                .filename(avatarDTO.getFilename())
                .path(avatarDTO.getPath())
                .build();
    }
}
