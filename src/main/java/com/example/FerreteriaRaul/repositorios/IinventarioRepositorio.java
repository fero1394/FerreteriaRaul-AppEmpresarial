package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.dtos.InventarioDTO;
import com.example.FerreteriaRaul.modelos.Inventario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IinventarioRepositorio extends ReactiveMongoRepository<Inventario,String> {
}
