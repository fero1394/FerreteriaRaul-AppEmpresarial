package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("proveedores")
public class Proveedor {

    @Id
    private String idProveedor;
    //private String idProveedor = UUID.randomUUID().toString().substring(0,100);

    private String nombre;

    private String cedula;

    private String celular;

    public Proveedor(String idProveedor, String nombre, String cedula, String celular) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
    }

    public Proveedor(){}

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor='" + idProveedor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
