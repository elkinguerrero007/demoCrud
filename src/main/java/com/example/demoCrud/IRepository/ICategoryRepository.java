package com.example.demoCrud.IRepository;

import com.example.demoCrud.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Integer> {
}
