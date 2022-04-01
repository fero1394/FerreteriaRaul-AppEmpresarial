package com.example.FerreteriaRaul.controladores;


import com.example.FerreteriaRaul.modelos.Factura;
import com.example.FerreteriaRaul.servicios.IServicioCliente;
import com.example.FerreteriaRaul.servicios.IServicioFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/factura")
public class ControladorFactura {

    @Autowired
    private IServicioFactura iServicioFactura;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Factura> create(@RequestBody Factura factura){
        return iServicioFactura.crearFactura(factura);
    }

    @GetMapping("")
    private Flux<Factura> findAll(){
        return iServicioFactura.mostrarTodos();
    }

    @DeleteMapping("/borrar/{id}")
    private Mono<ResponseEntity<Factura>> delete(@PathVariable("id") Integer id){
        Factura factura = new Factura();
        return iServicioFactura.borrar(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(factura)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/buscaridfactura/{id}")
    private Mono<Factura> findAllByIdFactura(@PathVariable("id")Integer id){
        return iServicioFactura.buscarPorIdFactura(id);
    }

    @PutMapping("/modificar")
    public Mono<Factura> update(@RequestBody Factura factura){
        return iServicioFactura.modificar(factura);
    }
}
