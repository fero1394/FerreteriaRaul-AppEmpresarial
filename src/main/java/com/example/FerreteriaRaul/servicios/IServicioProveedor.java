package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.dtos.ProveedorDTO;
import com.example.FerreteriaRaul.modelos.Proveedor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IServicioProveedor {
    Mono<Proveedor> crearProveedor(Proveedor proveedor);

    Flux<Proveedor> mostrarTodos();

    Mono<Proveedor> borrar(String id);

    Flux<Proveedor> buscarPorNombre(String nombre);
}
