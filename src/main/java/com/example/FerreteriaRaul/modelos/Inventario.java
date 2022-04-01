package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.UUID;

@Document("inventario")
public class Inventario {

    @Id
    private String idProducto;
   // private String idProducto = UUID.randomUUID().toString().substring(0,100);

    private String producto;

    private Integer cantidad;

    //@DBRef
    private Proveedor proveedor;

    public Inventario(String idProducto, String producto, Integer cantidad, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public Inventario(){}

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idProducto='" + idProducto + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", proveedor=" + proveedor +
                '}';
    }
}