package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProveedorRepositorio extends ReactiveMongoRepository<Proveedor, String> {
}
