package com.example.demoCrud.IService;

import com.example.demoCrud.entities.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {

    public List<Category> getAll();

    public Category save(Category category);

    public Optional<Category> getById(Integer id);

    public void delete(Integer id);

}
