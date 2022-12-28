package com.barbershop.business;

import com.barbershop.entities.Avatar;
import com.barbershop.repository.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvatarBUImpl implements AvatarBU {

    @Autowired
    AvatarRepository avatarRepository;

    @Override
    public Avatar insertAvatar(Avatar avatar) {
        return avatarRepository.saveAndFlush(avatar);
    }
}
