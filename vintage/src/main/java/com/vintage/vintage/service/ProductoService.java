package com.vintage.vintage.service;
import java.util.List;
import java.util.Optional;

import com.vintage.vintage.IService.InterfaceProductoService;
import com.vintage.vintage.models.Producto;
import com.vintage.vintage.repository.ProductoRepository;

public class ProductoService implements InterfaceProductoService{

    ProductoRepository data;
    @Override
    public List<Producto> mostrar() {
        // TODO Auto-generated method stub
        return (List<Producto>) data.findAll();
    }

    @Override
    public Optional<Producto> listarId(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Long save(Producto producto) {
        // TODO Auto-generated method stub
        Long res = 0L;
        Producto p = data.save(producto);
        if(!p.equals(null)){
            res = 1L;
        }
        return res;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }
    
}
