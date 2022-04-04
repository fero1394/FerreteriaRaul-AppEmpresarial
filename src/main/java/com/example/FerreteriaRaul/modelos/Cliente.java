package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document("clientes")
public class Cliente {

    @Id
    private String idCliente;// UUID.randomUUID().toString().substring(0,100);

    private String nombre;

    private String cedula;

    private String celular;

    public Cliente(){}
    public Cliente(String idCliente, String nombre, String cedula, String celular) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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
        return "Cliente{" +
                "idCliente='" + idCliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente) && Objects.equals(nombre, cliente.nombre) && Objects.equals(cedula, cliente.cedula) && Objects.equals(celular, cliente.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, cedula, celular);
    }
}
