package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IEntradaMercanciaRepositorio extends ReactiveMongoRepository<EntradaMercancia,String> {


}
