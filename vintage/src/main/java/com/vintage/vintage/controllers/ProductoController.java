package com.vintage.vintage.controllers;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.vintage.vintage.models.Producto;
import com.vintage.vintage.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    
    ProductoService prodService;


    @GetMapping("/registrarProducto")
    public String registrarProducto(ModelMap model){
        model.addAttribute("producto", new Producto());
        return "registro-producto";
    }
    @PostMapping("/registrarProducto")
    public String registrarProducto(ModelMap model, @Valid Producto product,@RequestParam("file") MultipartFile imagen){
        if(!imagen.isEmpty()){
            Path directorioImagenes = Paths.get("src//main//resources//static/img");
            String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();

            try {
                byte[] bytesImg = imagen.getBytes();
                Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
                Files.write(rutaCompleta, bytesImg);

                product.setImagenProducto(imagen.getOriginalFilename());
                
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        prodService.save(product);
        return "redirect:/producto/catalogo";
    }

    @GetMapping("/catalogo")
    public String catalogo(){
        return "catalogo";
    }

}
