package com.barbershop.domain.mappers;

import com.barbershop.domain.builders.AvatarBuilder;
import com.barbershop.domain.dto.AvatarDTO;
import com.barbershop.domain.entities.Avatar;

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
