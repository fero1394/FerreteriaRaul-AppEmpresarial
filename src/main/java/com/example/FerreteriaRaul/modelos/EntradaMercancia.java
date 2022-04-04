package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document("entradaMercancia")
public class EntradaMercancia {

    @Id
    private String idEntradaMercancia;

    @DBRef
    private Proveedor proveedor;

    private LocalDate fecha;

    private  String nombreProducto;

    private Integer cantidadProducto;

    public EntradaMercancia() {
        this.fecha = LocalDate.now();

    }

    public EntradaMercancia(String idEntradaMercancia, Proveedor proveedor, String nombreProducto, Integer cantidadProducto) {
        this.idEntradaMercancia = idEntradaMercancia;
        this.proveedor = proveedor;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.fecha = LocalDate.now();
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaMercancia that = (EntradaMercancia) o;
        return Objects.equals(idEntradaMercancia, that.idEntradaMercancia) && Objects.equals(proveedor, that.proveedor) && Objects.equals(fecha, that.fecha) && Objects.equals(nombreProducto, that.nombreProducto) && Objects.equals(cantidadProducto, that.cantidadProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEntradaMercancia, proveedor, fecha, nombreProducto, cantidadProducto);
    }

    @Override
    public String toString() {
        return "EntradaMercancia{" +
                "idEntradaMercancia='" + idEntradaMercancia + '\'' +
                ", proveedor=" + proveedor +
                ", fecha=" + fecha +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", cantidadProducto=" + cantidadProducto +
                '}';
    }
}
