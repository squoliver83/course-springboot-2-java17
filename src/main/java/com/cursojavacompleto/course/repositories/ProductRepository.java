package com.cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavacompleto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}