package com.example.FerreteriaRaul.controladores;

import com.example.FerreteriaRaul.dtos.InventarioDTO;
import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Proveedor;
import com.example.FerreteriaRaul.servicios.IServicioInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/inventario")
public class ControladorInventario {

    @Autowired
    private IServicioInventario iservicioInventario;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Inventario> create(@RequestBody Inventario inventario){
        return iservicioInventario.crearInventario(inventario);
    }

    @GetMapping("")
    private Flux<Inventario> findAll(){
        return iservicioInventario.mostrarTodos();
    }

    @DeleteMapping("/borrar/{id}")
    private Mono<ResponseEntity<Inventario>> delete(@PathVariable("id") String id){
        Inventario inventario = new Inventario();
        return iservicioInventario.borrar(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(inventario)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/buscarporproducto/{producto}")
    private Flux<Inventario> findAllByproducto(@PathVariable("producto")String producto){
        return iservicioInventario.buscarPorProducto(producto);
    }

    @PutMapping("/modificar")
    public Mono<Inventario> update(@RequestBody Inventario inventario){
        return iservicioInventario.modificar(inventario);
    }
}
