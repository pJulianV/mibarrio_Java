/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendavirtual.mibarrio.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "inv_id_pk")
    private Long idpk;
    
    @Column(name = "inv_stock",nullable = false)
    private int stock;
    
    @Column(name = "inv_sucursal",nullable = false)
    private int sucursal;
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
