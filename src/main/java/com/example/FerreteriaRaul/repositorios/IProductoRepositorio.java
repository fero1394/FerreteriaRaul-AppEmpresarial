package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IProductoRepositorio extends ReactiveMongoRepository<Producto ,String> {
    Flux<Producto> findAllByNombreProducto(String NombreProducto);
}
