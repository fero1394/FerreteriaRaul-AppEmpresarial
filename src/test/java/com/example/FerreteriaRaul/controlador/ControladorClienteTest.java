package com.example.FerreteriaRaul.controlador;
import com.example.FerreteriaRaul.modelos.Cliente;
import com.example.FerreteriaRaul.servicios.Implementacion.ServicioCliente;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import reactor.core.publisher.Flux;

public class ControladorClienteTest {

    @MockBean
    private ServicioCliente servicioCliente;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void buscarPorNombre() throws Exception {

        Cliente cliente = new Cliente("1","Carlos","00000","123456");

        Flux flujo = Flux.just(cliente);

        Mockito.when(servicioCliente.buscarPorNombre("Carlos"))
                .thenReturn(flujo);

    }
}
