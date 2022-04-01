package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.dtos.InventarioDTO;

import com.example.FerreteriaRaul.modelos.Inventario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioInventario {
    InventarioDTO crearInventario(InventarioDTO inventarioDTO);

    Flux<Inventario> mostrarTodos();



}
