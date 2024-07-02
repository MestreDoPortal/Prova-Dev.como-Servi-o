package com.example.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova.model.crud;

public interface crudRepository extends JpaRepository<crud, Long>{
    
}
