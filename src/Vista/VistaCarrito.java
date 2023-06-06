/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import DAO.CarritoDAO;
import DAO.ClienteDAO;
import DAO.ProductoDAO;
import Modelo.Carrito;
import Modelo.Cliente;
import Modelo.Producto;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class VistaCarrito {

    private List<Producto> listaProductos = new ArrayList<>();

    public void vistaCc(CarritoDAO carritoDAO, ProductoDAO productoDAO, ClienteDAO clienteDAO, Cliente cliente, Producto producto, Carrito carrito) {

        var salida = 1;
        String cedula = "";
        int cantidad = 0;
        int idCodigo = 0;
        int iva = 0;
        double ivaValor = 0;
        double subtotal = 0;
        double total = 0;

        Date horaActual = new Date();

        while (salida == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Menu Carrito");
            System.out.println("1.Crear");
            System.out.println("2.Actualizar");
            System.out.println("3.Eliminar");
            System.out.println("4.Buscar");
            System.out.println("5.Listar");
            System.out.println("6.Salir");
            System.out.println("Selecciona la OP");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa la cedula del cliente para buscar: ");
                    cedula = entrada.next();
                    cliente = (Cliente) clienteDAO.read(cedula);
                    if (cliente == null) {
                        System.out.println("CLiente no encontrado");
                        break;
                    }
                    System.out.println("Cliente Encontrado " + cliente);
                    System.out.println("Ingresa la cantidad de productos que vas a comprar");
                    cantidad = entrada.nextInt();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Ingresa el codigo del producto");
                        idCodigo = entrada.nextInt();
                        producto = (Producto) productoDAO.read(idCodigo);
                        subtotal = subtotal + producto.getPrecio();
                        listaProductos.add(producto);
                    }

                    iva = 12;
                    ivaValor = (subtotal * iva) / 100;
                    total = subtotal + ivaValor;

                    carrito = new Carrito(1, horaActual, subtotal, iva, total, cliente, listaProductos);
                    carritoDAO.create(carrito);
                    System.out.println("Carrito Creado");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    carritoDAO.list();
                    break;
                default:
                    salida = 0;
            }
        }
    }
}
