/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendavirtual.mibarrio.Service;

import com.tiendavirtual.mibarrio.Modelo.Inventario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ServiceInventario {
    
    List<Inventario> getListaInventario();
    Inventario crearInventario(Inventario inventario);
    Inventario ActualizarStockInventario(Inventario inventario);
    Boolean EliminarInventario(Long id);
    
}
