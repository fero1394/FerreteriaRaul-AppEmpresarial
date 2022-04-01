package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.repositorios.IinventarioRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioInventario implements IServicioInventario {

    @Autowired
    private IinventarioRepositorio repositorioInventario;


    @Override
    public Mono<Inventario> crearInventario(Inventario inventario) {
        return repositorioInventario.save(inventario);
    }

    @Override
    public Flux<Inventario> mostrarTodos() {
        return repositorioInventario.findAll();
    }

    @Override
    public Mono<Inventario> borrar(String id) {
        return repositorioInventario
                .findById(id)
                .flatMap(p -> repositorioInventario.deleteById(p.getIdInventario()).thenReturn(p));
    }

    @Override
    public Flux<Inventario> buscarPorProducto(String producto) {
        return repositorioInventario.findAllByProducto(producto);
    }

    @Override
    public Mono<Inventario> modificar(Inventario inventario) {
        return repositorioInventario.save(inventario);
    }


}
