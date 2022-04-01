package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("inventario")
public class Inventario {

    @Id
    private String idInventario;
   // private String idProducto = UUID.randomUUID().toString().substring(0,100);

    @DBRef
    private Producto producto;

    private Integer cantidad;

    @DBRef
    private Proveedor proveedor;

    public Inventario(String idInventario, Producto producto, Integer cantidad, Proveedor proveedor) {
        this.idInventario = idInventario;
        this.producto = producto;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public Inventario(){}

    public String getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
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
                "idProducto='" + idInventario + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", proveedor=" + proveedor +
                '}';
    }
}
