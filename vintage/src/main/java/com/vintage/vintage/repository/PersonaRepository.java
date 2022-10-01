package com.vintage.vintage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vintage.vintage.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    
}
