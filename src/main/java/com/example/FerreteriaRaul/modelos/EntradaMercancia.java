package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EntradaMercancia {

    @Id
    private String IdEntradaMercancia;

    @DBRef
    private Proveedor provedor;

    private String fecha;

    @DBRef
    private Producto producto;

    public String getIdEntradaMercancia() {
        return IdEntradaMercancia;
    }

    public void setIdEntradaMercancia(String idEntradaMercancia) {
        IdEntradaMercancia = idEntradaMercancia;
    }

    public Proveedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Proveedor provedor) {
        this.provedor = provedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
