package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.dtos.InventarioDTO;

import com.example.FerreteriaRaul.modelos.Inventario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioInventario {
    Mono<Inventario> crearInventario(Inventario inventario);

    Flux<Inventario> mostrarTodos();



}
