package com.vintage.vintage.repository;

import org.springframework.data.repository.CrudRepository;

import com.vintage.vintage.models.Producto;

public interface ProductoRepository extends CrudRepository<Producto,Long> {
    
}
