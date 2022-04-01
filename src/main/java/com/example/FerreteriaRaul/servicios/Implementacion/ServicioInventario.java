package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.dtos.InventarioDTO;
import com.example.FerreteriaRaul.mappers.InventarioMapper;
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

    private InventarioMapper mapper;


    @Override
    public Mono<Inventario> crearInventario(Inventario inventario) {
        return repositorioInventario.save(inventario);
    }

    @Override
    public Flux<Inventario> mostrarTodos() {
        return repositorioInventario.findAll();
    }
}
