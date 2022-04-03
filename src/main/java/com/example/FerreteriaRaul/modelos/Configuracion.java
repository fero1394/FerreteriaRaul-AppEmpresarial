package com.example.FerreteriaRaul.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document("configuracion")
public class Configuracion {

    @Id
    private String id;

    private Integer maximo;

    private Integer minimo;

    public Configuracion(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Configuracion that = (Configuracion) o;
        return Objects.equals(id, that.id) && Objects.equals(maximo, that.maximo) && Objects.equals(minimo, that.minimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maximo, minimo);
    }

    @Override
    public String toString() {
        return "Configuracion{" +
                "id='" + id + '\'' +
                ", maximo=" + maximo +
                ", minimo=" + minimo +
                '}';
    }
}
