/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class Carrito {

    private int codigo;
    private Date fechayHora;
    private double subTotal;
    private int iva;
    private double total;
    private Cliente cliente;
    private List<Producto> listaProductos;

    public Carrito() {
    }

    public Carrito(int codigo,Date fechayHora, double subTotal, int iva, double total, Cliente cliente, List<Producto> listaProductos) {
        this.fechayHora = fechayHora;
        this.subTotal = subTotal;
        this.iva = iva;
        this.total = total;
        this.cliente = cliente;
        this.listaProductos = listaProductos;
        this.codigo=codigo;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Carrito{" + "codigo=" + codigo + ", fechayHora=" + fechayHora + ", subTotal=" + subTotal + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + ", listaProductos=" + listaProductos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrito other = (Carrito) obj;
        return this.codigo == other.codigo;
    }
    
    

  

}
