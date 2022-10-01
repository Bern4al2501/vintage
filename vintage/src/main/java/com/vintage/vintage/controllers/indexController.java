package com.vintage.vintage.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vintage.vintage.models.Persona;
import com.vintage.vintage.service.PersonaServices;

@Controller
@RequestMapping("/")
public class indexController {

    @Autowired
    PersonaServices pServices;

    @GetMapping("/index")
    public String index (){
        return "index";
    }
    @GetMapping("/listar")
    public String listar(ModelMap model){
        List<Persona>personas = pServices.listar();
        model.addAttribute("titulo", "Mostrando los datos ingresados en el form");
        model.addAttribute("personas", personas);
        return "listar";
    }

    @GetMapping("/registrarPersona")
    public String registrarPersona(ModelMap model){
        model.addAttribute("persona", new Persona());
        return "register";
    }

    @PostMapping("/registrarPersona")
    public String guardarPersona(@Valid Persona p, ModelMap model){
        pServices.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/login")
    public String login (){
        return "login";
    }
}
