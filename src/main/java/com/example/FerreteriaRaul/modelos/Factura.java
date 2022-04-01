package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("facturas")
public class Factura {

    @Id
    private Integer idFactura;

    @DBRef
    private Cliente cliente;

    private String fecha;

    private String asesor;

    private List<Inventario> listaProductos;

    private int totalaPagar;

    private static Integer IdSiguiente = 1;

    public Factura() {
        idFactura = IdSiguiente;
        IdSiguiente++;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public List<Inventario> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Inventario> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getTotalaPagar() {
        return totalaPagar;
    }

    public void setTotalaPagar(int totalaPagar) {
        this.totalaPagar = totalaPagar;
    }

}
