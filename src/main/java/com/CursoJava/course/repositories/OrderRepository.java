package com.CursoJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CursoJava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
