package com.example.FerreteriaRaul.controlador;

import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.modelos.Proveedor;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioProducto;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioProveedor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import reactor.core.publisher.Flux;

@SpringBootTest
@AutoConfigureMockMvc
public class ControladorProveedorTest {

    @MockBean
    private ServicioProveedor servicioProveedor;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void buscarPorNombre()throws Exception {

        Proveedor proveedor = new Proveedor("1","Carlos","00000","123456");

        Flux flujo = Flux.just("1","Carlos","00000","123456");

        Mockito.when(servicioProveedor.buscarPorNombre("1"))
                .thenReturn(flujo);


    }
}
