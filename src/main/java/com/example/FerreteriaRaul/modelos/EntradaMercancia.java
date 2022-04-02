package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("entradaMercancia")
public class EntradaMercancia {

    @Id
    private String idEntradaMercancia;

    @DBRef
    private Proveedor proveedor;

    private LocalDate fecha;

    @DBRef
    private Producto producto;


    public EntradaMercancia() {
        this.fecha = LocalDate.now();

    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getIdEntradaMercancia() {
        return idEntradaMercancia;
    }

    public void setIdEntradaMercancia(String idEntradaMercancia) {
        this.idEntradaMercancia = idEntradaMercancia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
