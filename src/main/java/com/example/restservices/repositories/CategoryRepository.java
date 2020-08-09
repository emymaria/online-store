package com.example.restservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
