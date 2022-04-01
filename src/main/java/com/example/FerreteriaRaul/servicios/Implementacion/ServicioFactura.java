package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.Factura;
import com.example.FerreteriaRaul.repositorios.IFacturaRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioFactura implements IServicioFactura {

    @Autowired
    private IFacturaRepositorio ifacturaRepositorio;

    @Override
    public Mono<Factura> crearFactura(Factura factura) {
        return ifacturaRepositorio.save(factura);
    }

    @Override
    public Flux<Factura> mostrarTodos() {
        return ifacturaRepositorio.findAll();
    }

    @Override
    public Mono<Factura> borrar(Integer id) {
        return ifacturaRepositorio
                .findById(id)
                .flatMap(p -> ifacturaRepositorio.deleteById(p.getIdFactura()).thenReturn(p));
    }

    @Override
    public Mono<Factura> buscarPorIdFactura(Integer idfactura) {
        return ifacturaRepositorio.findById(idfactura);
    }

    @Override
    public Mono<Factura> modificar(Factura factura) {
        return ifacturaRepositorio.save(factura);
    }
}
