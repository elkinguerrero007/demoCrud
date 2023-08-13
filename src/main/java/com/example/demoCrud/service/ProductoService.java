package com.example.demoCrud.service;

import com.example.demoCrud.IRepository.IProductoRepository;
import com.example.demoCrud.IService.IProductService;
import com.example.demoCrud.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductService {

    @Autowired
    IProductoRepository repository;

    @Override
    public List<Producto> getAll() {
        return (List<Producto>) repository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Optional<Producto> getById(Integer id) {
        return repository.findById(id);
    }
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
