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

    private String nombreProducto;

    private int totalaPagar;

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

    public List<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<String> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return totalaPagar == factura.totalaPagar && Objects.equals(idFactura, factura.idFactura) && Objects.equals(cliente, factura.cliente) && Objects.equals(fecha, factura.fecha) && Objects.equals(asesor, factura.asesor) && Objects.equals(listaProductos, factura.listaProductos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, cliente, fecha, asesor, listaProductos, totalaPagar);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", asesor='" + asesor + '\'' +
                ", listaProductos=" + listaProductos +
                ", totalaPagar=" + totalaPagar +
                '}';
    }
}
