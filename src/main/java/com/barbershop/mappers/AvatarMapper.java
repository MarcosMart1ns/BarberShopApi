package com.barbershop.mappers;

import com.barbershop.builders.AvatarBuilder;
import com.barbershop.dto.AvatarDTO;
import com.barbershop.entities.Avatar;

public class AvatarMapper {
    public static AvatarDTO toDTO(Avatar avatar){
        return new AvatarDTO(
          avatar .getId(),
          avatar.getFileName(),
          avatar.getPath()
        );
    }

    public static Avatar toObject(AvatarDTO avatarDTO){
        return new AvatarBuilder()
                .filename(avatarDTO.getFilename())
                .path(avatarDTO.getPath())
                .build();
    }
}
