package com.example.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova.model.Crud;

public interface CrudRepository extends JpaRepository<Crud, Long>{
    
}
