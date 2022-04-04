package com.example.FerreteriaRaul.controlador;

import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioProducto;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import reactor.core.publisher.Flux;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class ControladorProductoTest {

    @MockBean
    private ServicioProducto servicioProducto;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void buscarPorNombreProducto() throws Exception {

        Producto producto = new Producto("50","destornillador",10000);

        Flux flujo = Flux.just("50","destornillador",10000);

        Mockito.when(servicioProducto.buscarPorNombreProducto("destornillador"))
                .thenReturn(flujo);


    }
}
