/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendavirtual.mibarrio.Modelo;

//import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventario") //nombre de referencia en base de datos
public class Inventario {
    
    // ahora crearemos los atributos
    @Id // le decimos que esta es la columna id de nuestra tabla
    @GeneratedValue (strategy = GenerationType.AUTO) //llave inventarion, 
                                                     // con generacion automatica
    @Column(name = "inv_id_pk") //nombre de la colmna en base de datos
    private Long idpk;
    
    @Column(name = "inv_stock",nullable = false) // le decimos que no permita valores nulos
    private int stock; // si no se utiliza nombre, se pone el nombre del atributo
    
    @Column(name = "inv_sucursal",nullable = false)
    private int sucursal; // id sucursal que realizo el movimiento
    
    /**
     * many to one  =  muchos a uno
     * Fetch        =  carga perezosa
     * una realacion con la tabla producto join colomn
     * json ignore para que no genere error al cargar la lista perezosa
     */
    
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "inv_idproducto_fk")
    @JsonIgnore
    
    private Producto producto;
    
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "inv_idprovedor_fk")
    @JsonIgnore
    private Producto provedor;

    public Long getIdpk() {
        return idpk;
    }

    public void setIdpk(Long idpk) {
        this.idpk = idpk;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProvedor() {
        return provedor;
    }

    public void setProvedor(Producto provedor) {
        this.provedor = provedor;
    }
    
}
