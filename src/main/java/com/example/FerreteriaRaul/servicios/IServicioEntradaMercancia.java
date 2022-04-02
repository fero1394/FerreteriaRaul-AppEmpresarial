package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioEntradaMercancia {


    Mono<EntradaMercancia> crearEntradaMercancia(EntradaMercancia entradaMercancia);

    Flux<EntradaMercancia> mostrarTodos();

    Mono<EntradaMercancia> borrar(String id);

    Mono<EntradaMercancia> buscarPorId(String id);

    Mono<EntradaMercancia> modificar(EntradaMercancia entradaMercancia);

}
