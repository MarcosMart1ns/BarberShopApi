package com.barbershop.domain.mappers;

import com.barbershop.domain.dto.AvatarDTO;
import com.barbershop.domain.entities.Avatar;

public class AvatarMapper {

    private AvatarMapper(){
        throw new IllegalArgumentException("Utility Class");
    }

    public static AvatarDTO toDTO(Avatar avatar){
        return AvatarDTO.builder()
                .id(avatar.getId())
                .filename(avatar.getFileName())
                .path(avatar.getPath())
                .build();
    }

    public static Avatar toObject(AvatarDTO avatarDTO){
        return Avatar.builder()
                .fileName(avatarDTO.getFilename())
                .path(avatarDTO.getPath())
                .build();
    }
}
