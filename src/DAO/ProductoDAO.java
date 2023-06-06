/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class ProductoDAO implements DaoABS{

    private List<Producto> listaProducto;

    public ProductoDAO() {
        listaProducto = new ArrayList<>();
    }

    @Override
    public void create(Object obj) {
        Producto c = (Producto) obj;
        if (c instanceof Producto) {
            listaProducto.add(c);
        }
    }

    @Override
    public Object read(Object obj) {
        int codigo = (int) obj;
        for (Producto c : listaProducto) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Producto) {
            int codigo = ((Producto) obj).getCodigo();
            for (int i = 0; i < listaProducto.size(); i++) {
                Producto Producto = listaProducto.get(i);
                if (Producto.getCodigo() == codigo) {
                    listaProducto.set(i, (Producto) obj);
                    break;
                }
            }
        }
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Producto) {
            for (int i = 0; i < listaProducto.size(); i++) {
                Producto Producto = listaProducto.get(i);
                if (Producto.equals((Producto) obj)) {
                    listaProducto.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void list() {
        for (Producto c : listaProducto) {
            System.out.println(c.toString());
        }
    }
    
}
