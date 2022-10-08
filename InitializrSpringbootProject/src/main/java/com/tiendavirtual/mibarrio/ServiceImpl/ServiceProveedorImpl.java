/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendavirtual.mibarrio.ServiceImpl;

import com.tiendavirtual.mibarrio.Dao.ProveedorDao;
import com.tiendavirtual.mibarrio.Modelo.Proveedor;
import com.tiendavirtual.mibarrio.Service.ServiceProveedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ServiceProveedorImpl implements ServiceProveedor {
    
    @Autowired
    private ProveedorDao getDao;

    @Override
    public List<Proveedor> getListaProveedor() {
        return getDao.findAll();
    }
    @Override
    public Proveedor crearProveedor(Proveedor proveedor) {
        if (proveedor != null) {
            return getDao.save(proveedor);
        }
        return null;
    }
    @Override
    public Proveedor ActualizarProveedor(Proveedor proveedor) {
        if (proveedor != null && proveedor.getIdpk() != 0) {
            Proveedor proveedorBD = getDao.getReferenceById(proveedor.getIdpk());
            if (proveedorBD != null) {
                proveedorBD.setNombre(proveedor.getNombre());
                proveedorBD.setNit(proveedor.getNit());
                proveedorBD.setTelefono(proveedor.getTelefono());
                return getDao.save(proveedorBD);
            }
        }
        return null;
    }
    @Override
    public Boolean EliminarProveedor(Long id) {
 
        if(id != null && id != 0){
            Proveedor proveedorBD = getDao.getReferenceById(id);
            if(proveedorBD != null){
                getDao.deleteById(id);
                 return true;
            }
          }
           return false;
    }

    
}
