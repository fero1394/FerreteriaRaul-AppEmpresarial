package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProductoRepositorio extends ReactiveMongoRepository<Producto ,String> {
}
