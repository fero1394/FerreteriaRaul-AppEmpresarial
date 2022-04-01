package com.example.FerreteriaRaul.controladores;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.servicios.IServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ControladorCliente {

    @Autowired
    private IServicioCliente iServicioCliente;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Cliente> create(@RequestBody Cliente cliente){
        return iServicioCliente.crearCliente(cliente);
    }

    @GetMapping("")
    private Flux<Cliente> findAll(){
        return iServicioCliente.mostrarTodos();
    }

    @DeleteMapping("/borrar/{id}")
    private Mono<ResponseEntity<Cliente>> delete(@PathVariable("id") String id){
        Cliente cliente = new Cliente();
        return iServicioCliente.borrar(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(cliente)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/buscarpornombre/{nombre}")
    private Flux<Cliente> findAllByNombre(@PathVariable("nombre")String nombre){
        return iServicioCliente.buscarPorNombre(nombre);
    }
}
