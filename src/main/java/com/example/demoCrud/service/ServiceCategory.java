package com.example.demoCrud.service;


import com.example.demoCrud.IRepository.ICategoryRepository;
import com.example.demoCrud.IService.ICategoryService;
import com.example.demoCrud.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCategory implements ICategoryService {


    @Autowired
    ICategoryRepository repository;
    @Override
    public List<Category> getAll() {
        return (List<Category>) repository.findAll();

    }
    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Optional<Category> getById(Integer id) {
        return repository.findById(id);
    }
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }


}
