package com.vintage.vintage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vintage.vintage.IService.InterfacePersonaService;
import com.vintage.vintage.models.Persona;
import com.vintage.vintage.repository.PersonaRepository;

@Service
public class PersonaServices implements InterfacePersonaService{

    @Autowired
    private PersonaRepository data;

    @Override
    public List<Persona> listar() {
        // TODO Auto-generated method stub
        return (List<Persona>) data.findAll() ;
    }

    @Override
    public Optional<Persona> listarId(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Long save(Persona p) {
        // TODO Auto-generated method stub
        Long res = 0L;
        Persona persona = data.save(p);
        if(!persona.equals(null)){
            res = 1L;
        }
        return res;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }
    
}
