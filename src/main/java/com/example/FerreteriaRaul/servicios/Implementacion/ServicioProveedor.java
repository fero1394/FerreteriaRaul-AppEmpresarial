package com.example.FerreteriaRaul.servicios.Implementacion;


import com.example.FerreteriaRaul.modelos.Proveedor;
import com.example.FerreteriaRaul.repositorios.IProveedorRepositorio;
import com.example.FerreteriaRaul.servicios.IServicioProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioProveedor implements IServicioProveedor {
    @Autowired
    IProveedorRepositorio repositorioProveedor;


    @Override
    public Mono<Proveedor> crearProveedor(Proveedor proveedor) {
        return repositorioProveedor.save(proveedor);
    }

    @Override
    public Flux<Proveedor> mostrarTodos() {
        return this.repositorioProveedor.findAll();
    }
}