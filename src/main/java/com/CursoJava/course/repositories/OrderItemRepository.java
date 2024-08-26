package com.CursoJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CursoJava.course.entities.OrderItem;
import com.CursoJava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}