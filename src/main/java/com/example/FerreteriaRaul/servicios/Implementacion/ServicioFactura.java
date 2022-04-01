package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.Factura;
import com.example.FerreteriaRaul.repositorios.IFacturaRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioFactura;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ServicioFactura implements IServicioFactura {

    @Autowired
    private IFacturaRepositorio ifacturaRepositorio;

    @Override
    public Mono<Factura> crearFactura(Factura factura) {
        return null;
    }

    @Override
    public Flux<Factura> mostrarTodos() {
        return null;
    }

    @Override
    public Mono<Factura> borrar(String id) {
        return null;
    }

    @Override
    public Flux<Factura> buscarPorNombre(String factura) {
        return null;
    }

    @Override
    public Mono<Factura> modificar(Factura factura) {
        return null;
    }
}
