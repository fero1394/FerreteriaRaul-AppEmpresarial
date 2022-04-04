package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.repositorios.IClienteRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioCliente implements IServicioCliente {

    @Autowired
    private IClienteRepositorio repositorioCliente;


    @Override
    public Mono<Cliente> crearCliente(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Flux<Cliente> mostrarTodos() {
        return repositorioCliente.findAll();
    }

    @Override
    public Mono<Cliente> borrar(String id) {
        return repositorioCliente
                .findById(id)
                .flatMap(p -> repositorioCliente.deleteById(p.getIdCliente()).thenReturn(p));
    }

    @Override
    public Flux<Cliente> buscarPorNombre(String nombre) {
        return repositorioCliente.findAllBynombre(nombre);
    }

    @Override
    public Mono<Cliente> modificar(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }
}
