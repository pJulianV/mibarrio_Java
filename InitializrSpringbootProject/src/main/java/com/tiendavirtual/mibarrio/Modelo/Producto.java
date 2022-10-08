/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendavirtual.mibarrio.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "producto") //nombre de referencia en base de datos
public class Producto {

    
    @Id // columna id tabla
    @GeneratedValue(strategy = GenerationType.AUTO)// llave primaria producto
    
    @Column (name = "pro_id_pk") // columna id
    private Long idpk; // el id en si
    
    @Column(name = "prod_descripcion") // columna descripcion
    @NotNull(message = "El campo descripcion no puede estar null")
    private String descripcion; // La descripcion en si
    
    /**
     * PRO TIP: La libreria de validacion valida...
     * si un campo viene null o vacio
     */
    @Column(name = "prod_costo") // Columna costo
    @NotNull(message = "El campo costo no puede estar null")
    private double costo;
    
    public Producto(){
    }
   
    public Long getIdpk(){
        return idpk;
    }
    public void setIdpk(Long idpk){
        this.idpk = idpk;
    }
}
