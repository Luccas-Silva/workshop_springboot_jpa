package com.Stoico.course_Stoico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Stoico.course_Stoico.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
