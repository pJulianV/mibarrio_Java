/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendavirtual.mibarrio.Service;

import com.tiendavirtual.mibarrio.Modelo.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ServiceProducto {
    
    List<Producto> getListaProducto();
    Producto crearProducto(Producto producto);
    Producto ActualizarProducto(Producto producto);
    Boolean EliminarProducto(Long id);
    
}
