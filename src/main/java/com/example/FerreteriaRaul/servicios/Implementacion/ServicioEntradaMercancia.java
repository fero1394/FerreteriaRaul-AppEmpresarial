package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import com.example.FerreteriaRaul.modelos.Inventario;

import com.example.FerreteriaRaul.repositorios.IEntradaMercanciaRepositorio;
import com.example.FerreteriaRaul.repositorios.IinventarioRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioEntradaMercancia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Predicate;

@Service
public class ServicioEntradaMercancia implements IServicioEntradaMercancia {

    @Autowired
    private IEntradaMercanciaRepositorio ientradaMecanciaRepositorio;

    @Autowired
    private IinventarioRepositorio repositorioInventario;


    @Override
    public Mono<EntradaMercancia> crearEntradaMercancia(EntradaMercancia entradaMercancia) {

        EntradaMercancia entradaProducto = entradaMercancia;

        Predicate<Inventario> predicado = new Predicate<Inventario>() {
            @Override
            public boolean test(Inventario t) {

                return t.getProducto().getNombreProducto().equals(entradaProducto.getNombreProducto());
            }
        };

        repositorioInventario.findAll()
                .filter(predicado)
                .flatMap(p ->
                {
                    p.setCantidad(p.getCantidad() + entradaProducto.getCantidadProducto());
                    return repositorioInventario.save(p);
                }).
                subscribe();

        return ientradaMecanciaRepositorio.save(entradaMercancia);
    }


    @Override
    public Flux<EntradaMercancia> mostrarTodos() {
        return ientradaMecanciaRepositorio.findAll();
    }

    @Override
    public Mono<EntradaMercancia> borrar(String id) {
        return ientradaMecanciaRepositorio
                .findById(id)
                .flatMap(p -> ientradaMecanciaRepositorio.deleteById(p.getIdEntradaMercancia()).thenReturn(p));
    }

    @Override
    public Mono<EntradaMercancia> buscarPorId(String id) {
        return ientradaMecanciaRepositorio.findById(id);
    }

    @Override
    public Mono<EntradaMercancia> modificar(EntradaMercancia entradaMercancia) {
        return ientradaMecanciaRepositorio.save(entradaMercancia);
    }
}
