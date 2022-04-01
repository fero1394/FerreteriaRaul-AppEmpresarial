package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.modelos.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioFactura {

    Mono<Factura> crearFactura(Factura factura);

    Flux<Factura> mostrarTodos();

    Mono<Factura> borrar(String id);

    Flux<Factura> buscarPorNombre(String factura);

    Mono<Factura> modificar(Factura factura);

}
