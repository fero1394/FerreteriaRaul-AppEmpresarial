package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.repositorios.IProductoRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioProducto implements IServicioProducto {

    @Autowired
    private IProductoRepositorio iProductoRepositorio;

    @Override
    public Mono<Producto> crearProducto(Producto producto) {
        return iProductoRepositorio.save(producto);
    }

    @Override
    public Flux<Producto> mostrarTodos() {
        return iProductoRepositorio.findAll();
    }

    @Override
    public Mono<Producto> borrar(String id) {
        return iProductoRepositorio
                .findById(id)
                .flatMap(p -> iProductoRepositorio.deleteById(p.getIdProducto()).thenReturn(p));
    }

    @Override
    public Flux<Producto> buscarPorNombreProducto(String nombreProducto) {
        return iProductoRepositorio.findAllByNombreProducto(nombreProducto);
    }

    @Override
    public Mono<Producto> modificar(Producto producto) {
        return iProductoRepositorio.save(producto);
    }

}
