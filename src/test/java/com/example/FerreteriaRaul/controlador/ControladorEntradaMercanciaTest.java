package com.example.FerreteriaRaul.controlador;

import com.example.FerreteriaRaul.modelos.EntradaMercancia;
import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.modelos.Proveedor;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioEntradaMercancia;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioInventario;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
@AutoConfigureMockMvc
public class ControladorEntradaMercanciaTest {

    @MockBean
    private ServicioEntradaMercancia servicioEntradaMercancia;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void buscarPorNombreProducto() throws Exception {

        Proveedor proveedor = new Proveedor("1","Carlos","00000","123456");
        EntradaMercancia entradaMercancia = new EntradaMercancia("20",proveedor, "pinza", 20);

        Mono flujo = Mono.just(entradaMercancia);

        Mockito.when(servicioEntradaMercancia.buscarPorId("20"))
                .thenReturn(flujo);

    }
}
