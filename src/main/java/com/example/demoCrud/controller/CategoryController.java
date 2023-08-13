package com.example.demoCrud.controller;


import com.example.demoCrud.entities.Category;
import com.example.demoCrud.service.ServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/category")
public class CategoryController{

    @Autowired
    ServiceCategory service;

    @GetMapping("/getAll")
    public List<Category> getAll(){
        return service.getAll();
    }
    @GetMapping("/getById/{id}")
    public Optional<Category> finById(@PathVariable Integer id){
        return service.getById(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public Category save(@RequestBody Category category){
        return service.save(category);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<Category> update(@RequestBody Category category,@PathVariable Integer id){
        Optional<Category> op = service.getById(id);
            Category update = op.get();
        if (!op.isEmpty()){
           update.setNombre(category.getNombre());
           return Optional.ofNullable(service.save(update));
        }
        return Optional.ofNullable(category);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
