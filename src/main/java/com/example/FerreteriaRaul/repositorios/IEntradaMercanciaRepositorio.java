package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IEntradaMercanciaRepositorio extends ReactiveMongoRepository<EntradaMercancia,String> {

}
