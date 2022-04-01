package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface IProveedorRepositorio extends ReactiveMongoRepository<Proveedor, String> {
    Flux<Proveedor> findAllByNombre(String nombre);
}
