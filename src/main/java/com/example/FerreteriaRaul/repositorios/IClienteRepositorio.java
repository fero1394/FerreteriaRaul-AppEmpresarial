package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClienteRepositorio extends ReactiveMongoRepository<Cliente, String> {
}
