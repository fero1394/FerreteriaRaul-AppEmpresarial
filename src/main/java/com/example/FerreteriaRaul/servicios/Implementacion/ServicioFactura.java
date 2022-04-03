package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.FerreteriaRaulApplication;
import com.example.FerreteriaRaul.modelos.Factura;
import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.repositorios.IFacturaRepositorio;
import com.example.FerreteriaRaul.repositorios.IinventarioRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioFactura;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Predicate;

@Service
public class ServicioFactura implements IServicioFactura {

    private static final Logger log = LoggerFactory.getLogger(ServicioFactura.class);

    @Autowired
    private IFacturaRepositorio ifacturaRepositorio;

    @Autowired
    private IinventarioRepositorio repositorioInventario;

    @Override
    public Mono<Factura> crearFactura(Factura factura) {

        Factura salidaProducto = factura;

        Predicate<Inventario> predicado = new Predicate<Inventario>() {
            @Override
            public boolean test(Inventario t) {

                return t.getProducto().getNombreProducto().equals(salidaProducto);
            }
        };

        salidaProducto.getListaProductos().stream().   subscribe(p -> log.info(toString()));

        repositorioInventario.findAll()
                .filter(p -> p.)




        /*
        repositorioInventario.findAll()
                .filter(predicado)
                .flatMap(p ->
                {
                    p.setCantidad(p.getCantidad() + salidaProducto.getCantidadProducto());
                    return repositorioInventario.save(p);
                }).
                subscribe();

         */






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
