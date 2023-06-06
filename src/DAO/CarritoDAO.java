/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Carrito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class CarritoDAO implements DaoABS{

    private List<Carrito> listaCarrito;

    public CarritoDAO() {
        listaCarrito = new ArrayList<>();
    }

    @Override
    public void create(Object obj) {
        Carrito c = (Carrito) obj;
        if (c instanceof Carrito) {
            listaCarrito.add(c);
        }
    }

    @Override
    public Object read(Object obj) {
        int codigo = (int) obj;
        for (Carrito c : listaCarrito) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Carrito) {
            int codigo = ((Carrito) obj).getCodigo();
            for (int i = 0; i < listaCarrito.size(); i++) {
                Carrito Carrito = listaCarrito.get(i);
                if (Carrito.getCodigo() == codigo) {
                    listaCarrito.set(i, (Carrito) obj);
                    break;
                }
            }
        }
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Carrito) {
            for (int i = 0; i < listaCarrito.size(); i++) {
                Carrito Carrito = listaCarrito.get(i);
                if (Carrito.equals((Carrito) obj)) {
                    listaCarrito.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void list() {
        for (Carrito c : listaCarrito) {
            System.out.println(c.toString());
        }
    }
    
}

