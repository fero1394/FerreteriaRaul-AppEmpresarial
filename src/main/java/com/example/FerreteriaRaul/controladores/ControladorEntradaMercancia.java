package com.example.FerreteriaRaul.controladores;

import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import com.example.FerreteriaRaul.servicios.IServicioCliente;
import com.example.FerreteriaRaul.servicios.IServicioEntradaMercancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/entradamercancia")
public class ControladorEntradaMercancia {

    @Autowired
    private IServicioEntradaMercancia iServicioEntradaMercancia;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<EntradaMercancia> create(@RequestBody EntradaMercancia entradaMercancia){
        return iServicioEntradaMercancia.crearEntradaMercancia(entradaMercancia);
    }

    @GetMapping("")
    private Flux<EntradaMercancia> findAll(){
        return iServicioEntradaMercancia.mostrarTodos();
    }

    @DeleteMapping("/borrar/{id}")
    private Mono<ResponseEntity<EntradaMercancia>> delete(@PathVariable("id") String id){
        EntradaMercancia entradaMercancia = new EntradaMercancia();
        return iServicioEntradaMercancia.borrar(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(entradaMercancia)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/buscarporid/{id}")
    private Mono<EntradaMercancia> findAllByid(@PathVariable("id")String id){
        return iServicioEntradaMercancia.buscarPorId(id);
    }

    @PutMapping("/modificar")
    public Mono<EntradaMercancia> update(@RequestBody EntradaMercancia entradaMeracancia){
        return iServicioEntradaMercancia.modificar(entradaMeracancia);
    }
}
