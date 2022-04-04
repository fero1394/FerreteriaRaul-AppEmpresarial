package com.example.FerreteriaRaul.controlador;

import com.example.FerreteriaRaul.servicios.Implementacion.ServicioProducto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ControladorProductoTest {

    @MockBean
    private ServicioProducto servicioProducto;

    @Autowired
    private MockMvc mockMvc;

    @Test

}
