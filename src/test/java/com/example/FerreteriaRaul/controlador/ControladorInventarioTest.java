package com.example.FerreteriaRaul.controlador;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.modelos.Proveedor;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioInventario;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioProducto;
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
public class ControladorInventarioTest {

    @MockBean
    private ServicioInventario servicioInventario;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void buscarPorNombreProducto() throws Exception {

        Proveedor proveedor = new Proveedor("1","Carlos","00000","123456");
        Producto producto = new Producto("50","destornillador",10000);
        Inventario inventario = new Inventario(producto,5,proveedor);

        Flux flujo = Flux.just(producto,5,proveedor);

        Mockito.when(servicioInventario.buscarPorProducto(String.valueOf(producto)))
                .thenReturn(flujo);

    }
}
