package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.modelos.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioFactura {

    Mono<Factura> crearFactura(Factura factura);

    Flux<Factura> mostrarTodos();

    Mono<Factura> borrar(Integer id);

    Mono<Factura> buscarPorIdFactura(Integer idfactura);

    Mono<Factura> modificar(Factura factura);

}
