package com.cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavacompleto.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}