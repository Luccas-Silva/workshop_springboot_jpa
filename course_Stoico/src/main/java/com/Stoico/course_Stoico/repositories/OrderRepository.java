package com.Stoico.course_Stoico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Stoico.course_Stoico.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
