package com.example.demoCrud.IRepository;

import com.example.demoCrud.entities.Producto;


import org.springframework.data.repository.CrudRepository;


public interface IProductoRepository extends CrudRepository<Producto, Integer> {

}
