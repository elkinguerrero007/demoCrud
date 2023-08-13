package com.example.demoCrud.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto")
@Data
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String imagen;
    private String nombre;
    private int precio;

    @ManyToOne
    @JsonIgnoreProperties("productos")
    @JoinColumn(name = "categoryId")
    private Category category;
    private String descripcion;


    public Producto() {
    }

    public Producto(String titulo, String imagen, String nombre, int precio, Category category, String descripcion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
        this.category = category;
        this.descripcion = descripcion;
    }
    

}
