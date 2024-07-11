package com.CursoJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CursoJava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
