package com.example.FerreteriaRaul.mappers;

import com.example.FerreteriaRaul.dtos.InventarioDTO;
import com.example.FerreteriaRaul.modelos.Inventario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventarioMapper {

    public Inventario fromDTO(InventarioDTO dto){
        Inventario inventario = new Inventario();
        inventario.setIdInventario(dto.getIdProducto());
        inventario.setProducto(dto.getProducto());
        inventario.setCantidad(dto.getCantidad());
        inventario.setProveedor(dto.getProveedor());

        return inventario;
    }

    public InventarioDTO fromInventario(Inventario inventario){
        InventarioDTO inventarioDTO = new InventarioDTO();
        inventarioDTO.setIdProducto(inventario.getIdInventario());
        inventarioDTO.setProducto(inventario.getProducto());
        inventarioDTO.setCantidad(inventario.getCantidad());
        inventarioDTO.setProveedor(inventario.getProveedor());

        return inventarioDTO;
    }

    public List<InventarioDTO> fromInventarioList(List<Inventario> listaInventario){
        if(listaInventario==null){
            return null;
        }
        List<InventarioDTO> list = new ArrayList<>(listaInventario.size());
        Iterator listTrack = listaInventario.iterator();

        while(listTrack.hasNext()){
            Inventario inventario = (Inventario) listTrack.next();
            list.add(fromInventario(inventario));
        }
        return list;
    }

}
