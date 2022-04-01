package com.example.FerreteriaRaul.dtos;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Proveedor;

import java.util.List;
import java.util.UUID;

public class InventarioDTO {

    private Inventario inventario = new Inventario();

    private String idProducto = inventario.getIdProducto();     //UUID.randomUUID().toString().substring(0,100);

    private String producto = inventario.getProducto();

    private Integer cantidad = inventario.getCantidad();

    private Proveedor proveedor = inventario.getProveedor();

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {this.proveedor = proveedor;
    }

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
}
