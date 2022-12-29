package com.barbershop.repository;

import com.barbershop.domain.entities.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

}
