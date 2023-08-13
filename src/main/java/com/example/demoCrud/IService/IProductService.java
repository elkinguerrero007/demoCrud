package com.example.demoCrud.IService;

import com.example.demoCrud.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    public List<Producto> getAll();

    public Optional<Producto> getById(Integer id);

    public Producto save(Producto producto);
    public void delete(Integer id);



}
