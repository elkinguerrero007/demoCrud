package com.example.demoCrud.controller;


import com.example.demoCrud.entities.Producto;
import com.example.demoCrud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin("*")
public class ProductoController {

    @Autowired
    ProductoService service;

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    List<Producto> getAll(){
      return service.getAll();
  }

    @GetMapping("/getById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Producto> getById(@PathVariable int id){
        return service.getById(id);
  }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto save(@RequestBody Producto producto){   

        return service.save(producto);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Producto> update(@PathVariable Integer id,@RequestBody Producto producto){
        Optional<Producto> op = service.getById(id);
        Producto update = op.get();

        if (!op.isEmpty()){
            update.setTitulo(producto.getTitulo());
            update.setImagen(producto.getImagen());
            update.setNombre(producto.getNombre());
            update.setPrecio(producto.getPrecio());
            update.setDescripcion(producto.getDescripcion());

            return Optional.ofNullable(service.save(update));
        }
        return Optional.ofNullable(producto);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }

}
