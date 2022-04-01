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
    public Mono<InventarioDTO> create(@RequestBody InventarioDTO inventarioDTO){
        return iservicioInventario.crearInventario(inventarioDTO);
    }

    @GetMapping("")
    private Flux<Inventario> findAll(){
        return iservicioInventario.mostrarTodos();
    }


}
