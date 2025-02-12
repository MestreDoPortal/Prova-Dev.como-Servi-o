package com.example.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prova.model.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Long>{
    
}
