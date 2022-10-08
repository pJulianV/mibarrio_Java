/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendavirtual.mibarrio.Dao;

import com.tiendavirtual.mibarrio.Modelo.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface ProveedorDao extends JpaRepository<Proveedor, Long>{
    
}
