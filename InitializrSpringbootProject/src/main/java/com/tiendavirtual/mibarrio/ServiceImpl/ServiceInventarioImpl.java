/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendavirtual.mibarrio.ServiceImpl;

import com.tiendavirtual.mibarrio.Dao.InventarioDao;
import com.tiendavirtual.mibarrio.Modelo.Inventario;
import com.tiendavirtual.mibarrio.Service.ServiceInventario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service

public class ServiceInventarioImpl implements ServiceInventario{

    @Autowired
    private InventarioDao getDao;
    
    @Override
    public List<Inventario> getListaInventario() {
        return getDao.findAll();
    }
    @Override
    public Inventario crearInventario(Inventario inventario) {
        if(inventario != null){
            return getDao.save(inventario);
        }
        return null;
    }
    @Override
    public Inventario ActualizarStockInventario(Inventario inventario) {
        if(inventario != null && inventario.getIdpk() != 0){
            Inventario inventarioBD = getDao.getReferenceById(inventario.getIdpk());
            if(inventarioBD != null){
                inventarioBD.setStock(inventario.getStock()==0?inventarioBD.getStock()
                        :inventarioBD.getStock()+inventarioBD.getStock());
                return getDao.save(inventarioBD);
            } 
        }
        return null;
    }
    @Override
    public Boolean EliminarInventario(Long id) {
          if(id != null && id != 0){
            Inventario inventarioBD = getDao.getReferenceById(id);
            if(inventarioBD != null){
                getDao.deleteById(id);
                 return true;
            }
          }
           return false;
    }
  
}
