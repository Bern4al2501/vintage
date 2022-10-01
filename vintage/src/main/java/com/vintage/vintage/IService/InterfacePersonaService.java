package com.vintage.vintage.IService;

import java.util.List;
import java.util.Optional;

import com.vintage.vintage.models.Persona;

public interface InterfacePersonaService {

    public List<Persona> listar();
    public Optional<Persona> listarId(Long id);
    public Long save(Persona p);
    public void delete();
}
