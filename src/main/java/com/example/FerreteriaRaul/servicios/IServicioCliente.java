package com.example.FerreteriaRaul.servicios;


import com.example.FerreteriaRaul.modelos.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicioCliente {

    Mono<Cliente> crearCliente(Cliente cliente);

    Flux<Cliente> mostrarTodos();

    Mono<Cliente> borrar(String id);

    Flux<Cliente> buscarPorNombre(String nombre);

    Mono<Cliente> modificar(Cliente cliente);

}
