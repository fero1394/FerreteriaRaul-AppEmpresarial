package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.dtos.InventarioDTO;
import com.example.FerreteriaRaul.modelos.Inventario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IinventarioRepositorio extends ReactiveMongoRepository<Inventario,String> {
    Flux<Inventario> findAllByProducto(String producto);
}
