package com.vintage.vintage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idProducto;
    public String nombreProducto;
    public String descripcionProducto;
    public String talla;
    public String imagenProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, String descripcionProducto, String talla, String imagenProducto) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.talla = talla;
        this.imagenProducto = imagenProducto;
    }


    public Producto(Long idProducto, String nombreProducto, String descripcionProducto, String talla,
            String imagenProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.talla = talla;
        this.imagenProducto = imagenProducto;
    }

    
    //Getters and setters
    public Long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcionProducto() {
        return descripcionProducto;
    }
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getImagenProducto() {
        return imagenProducto;
    }
    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

}
