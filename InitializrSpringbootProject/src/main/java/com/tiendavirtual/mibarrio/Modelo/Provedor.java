/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendavirtual.mibarrio.Modelo;

import javax.persistence.Column; // Maven?
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

// Con "@" Se llama y usa lo importado
@Entity
@Table(name = "provedor")
public class Provedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // LLAve primaria provedor y generacion automatica
    @Column(name = "prov_id_pk") // Columna ID 
    private Long idpk;
    
    @Column(name = "prov_nombre", nullable = false)
    private String nombre;
    /**
     * validamos que sea null o no pero esta vez con "size" para fijar una 
     * cantidad de caracteres y aceptar
     */
    @Column(name = "prov_nit")
    @Size(min = 9, max = 11, message = "En el nit solo se permiten 9 a 11 caracteres")
    // limitar numero de caracteres
    private String nit;
    
    @Column(name = "prov_tel")
    @Size(min = 8, max = 15, message = "El numero de telefono solo permite un "
            + "rango de 9 a 15 caracteres")
    private String telefono;
    
    public Provedor(){
    }
    
}
