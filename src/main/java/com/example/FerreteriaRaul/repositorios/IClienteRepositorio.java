package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.modelos.Inventario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IClienteRepositorio extends ReactiveMongoRepository<Cliente, String> {
    Flux<Cliente> findAllBynombre(String nombre);
}
