package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import com.example.FerreteriaRaul.repositorios.IEntradaMercanciaRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioEntradaMercancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioEntradaMercancia implements IServicioEntradaMercancia {

    @Autowired
    private IEntradaMercanciaRepositorio ientradaMecanciaRepositorio;


    @Override
    public Mono<EntradaMercancia> crearEntradaMercancia(EntradaMercancia entradaMercancia) {
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
