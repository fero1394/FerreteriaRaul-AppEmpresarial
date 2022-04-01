package com.example.FerreteriaRaul.servicios;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioProducto {

    Mono<Producto> crearInventario(Producto producto);

    Flux<Producto> mostrarTodos();

    Mono<Producto> borrar(String id);

    Flux<Producto> buscarPorNombreProducto(String nombreProducto);

    Mono<Producto> modificar(Producto producto);

}
