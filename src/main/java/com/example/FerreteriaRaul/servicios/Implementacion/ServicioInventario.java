package com.example.FerreteriaRaul.servicios.Implementacion;

import com.example.FerreteriaRaul.repositorios.IinventarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioInventario {

    @Autowired
    private IinventarioRepositorio repositorioInventario;

    
}
