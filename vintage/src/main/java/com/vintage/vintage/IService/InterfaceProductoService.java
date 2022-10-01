package com.vintage.vintage.IService;

import java.util.List;
import java.util.Optional;

import com.vintage.vintage.models.Producto;


public interface InterfaceProductoService {
    
    public List<Producto>mostrar();
    public Optional<Producto> listarId(Long id);
    public Long save(Producto producto);
    public void delete();
}
