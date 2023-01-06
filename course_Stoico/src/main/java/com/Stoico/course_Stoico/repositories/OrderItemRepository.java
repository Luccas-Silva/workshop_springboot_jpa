package com.Stoico.course_Stoico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Stoico.course_Stoico.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
