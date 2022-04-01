package com.example.FerreteriaRaul.controladores;

import com.example.FerreteriaRaul.dtos.InventarioDTO;
import com.example.FerreteriaRaul.dtos.ProveedorDTO;
import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Proveedor;
import com.example.FerreteriaRaul.servicios.IServicioInventario;
import com.example.FerreteriaRaul.servicios.IServicioProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/proveedor")
public class ControladorProveedor {

    @Autowired
    private IServicioProveedor iServicioProveedor;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Proveedor> create(@RequestBody Proveedor proveedor){
        return iServicioProveedor.crearProveedor(proveedor);
    }

    @GetMapping("")
    private Flux<Proveedor> mostrarTodos(){
        return iServicioProveedor.mostrarTodos();
    }


    @DeleteMapping("/borrar/{id}")
    private Mono<ResponseEntity<Proveedor>> delete(@PathVariable("id") String id){
        Proveedor proveedor = new Proveedor();
        return iServicioProveedor.borrar(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(proveedor)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/buscarpornombre/{nombre}")
    private Flux<Proveedor> findAllBynombre(@PathVariable("nombre")String nombre){
        return iServicioProveedor.buscarPorNombre(nombre);
    }
}
