package com.example.FerreteriaRaul.controladores;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.servicios.IServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/producto")
public class ControladorProducto {

    @Autowired
    private IServicioProducto iServicioProducto;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Producto> create(@RequestBody Producto producto){
        return iServicioProducto.crearInventario(producto);
    }

    @GetMapping("")
    private Flux<Producto> findAll(){
        return iServicioProducto.mostrarTodos();
    }

    @DeleteMapping("/borrar/{id}")
    private Mono<ResponseEntity<Producto>> delete(@PathVariable("id") String id){
        Producto producto = new Producto();
        return iServicioProducto.borrar(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(producto)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/buscarporproducto/{producto}")
    private Flux<Producto> findAllByproducto(@PathVariable("producto")String producto){
        return iServicioProducto.buscarPorNombreProducto(producto);
    }

    @PutMapping("/modificar")
    public Mono<Producto> update(@RequestBody Producto producto){
        return iServicioProducto.modificar(producto);
    }
}
