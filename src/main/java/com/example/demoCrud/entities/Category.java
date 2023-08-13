package com.example.demoCrud.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



@Entity
@Table(name = "category")
@Data
public class Category implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private int id;
    private String nombre;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Producto> productos;


    public Category() {
    }

    public Category(String nombre) {
        this.nombre = nombre;
    }

    public Category(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }
}
