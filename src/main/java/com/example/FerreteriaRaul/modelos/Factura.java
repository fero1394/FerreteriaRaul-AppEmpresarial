package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Document("facturas")
public class Factura {

    @Id
    private Integer idFactura;

    @DBRef
    private Cliente cliente;

    private LocalDate fecha;

    private String asesor;

    //private List<String> listaProductos;

    private Integer cantidadProducto;

    private String nombreProducto;

    private Integer precio;

    private Integer totalaPagar;

    private static Integer IdSiguiente = 1;

    public Factura() {
        idFactura = IdSiguiente;
        IdSiguiente++;
        this.fecha = LocalDate.now();
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public int getTotalaPagar() {
        return totalaPagar;
    }

    public void setTotalaPagar(int totalaPagar) {
        this.totalaPagar = totalaPagar;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return totalaPagar == factura.totalaPagar && Objects.equals(idFactura, factura.idFactura) && Objects.equals(cliente, factura.cliente) && Objects.equals(fecha, factura.fecha) && Objects.equals(asesor, factura.asesor) && Objects.equals(cantidadProducto, factura.cantidadProducto) && Objects.equals(nombreProducto, factura.nombreProducto) && Objects.equals(precio, factura.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, cliente, fecha, asesor, cantidadProducto, nombreProducto, precio, totalaPagar);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", asesor='" + asesor + '\'' +
                ", cantidadProducto=" + cantidadProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", totalaPagar=" + totalaPagar +
                '}';
    }
}
