package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document("facturas")
public class Factura {

    @Id
    private Integer idFactura;

    @DBRef
    private Cliente cliente;

    private LocalDate fecha;

    private String asesor;

    private List<Producto> listaProductos;

    private int totalaPagar;

    private static Integer IdSiguiente = 1;

    public Factura() {
        idFactura = IdSiguiente;
        IdSiguiente++;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getTotalaPagar() {
        return totalaPagar;
    }

    public void setTotalaPagar(int totalaPagar) {
        this.totalaPagar = totalaPagar;
    }

}
