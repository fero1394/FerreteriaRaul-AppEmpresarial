package com.example.FerreteriaRaul.repositorios;


import com.example.FerreteriaRaul.modelos.Inventario;

import com.example.FerreteriaRaul.modelos.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface IinventarioRepositorio extends ReactiveMongoRepository<Inventario, String> {
    Flux<Inventario> findAllByProducto(String producto);

    Flux<Inventario> findFirstByProducto(Producto producto);

    Mono<Inventario> findIdByProducto(Producto producto);

}
