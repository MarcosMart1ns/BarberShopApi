package com.barbershop.repository;

import com.barbershop.entities.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

}
