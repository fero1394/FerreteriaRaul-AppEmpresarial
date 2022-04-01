package com.example.FerreteriaRaul.repositorios;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.modelos.Factura;
import com.example.FerreteriaRaul.modelos.Inventario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IFacturaRepositorio extends ReactiveMongoRepository<Factura, Integer> {
    Flux<Factura> findAllByidFactura(Integer idFactura);
}
