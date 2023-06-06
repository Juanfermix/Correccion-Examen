/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import DAO.CarritoDAO;
import DAO.ClienteDAO;
import DAO.ProductoDAO;
import Modelo.Carrito;
import Modelo.Cliente;
import Modelo.Producto;
import Vista.VistaCarrito;
import Vista.VistaCliente;
import Vista.VistaProducto;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
     //Controladores DAO
    private static CarritoDAO carritoDAO = new CarritoDAO();
    private static ProductoDAO productoDAO = new ProductoDAO();
    private static ClienteDAO clienteDAO = new ClienteDAO();

    //Modelos
    private static Cliente cliente = new Cliente();
    private static Producto producto = new Producto();
    private static Carrito carrito = new Carrito();
    public static void main(String[] args) {

        var salida = 1;
        while (salida == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Carrito");
            System.out.println("1.Cliente");
            System.out.println("2.Producto");
            System.out.println("3.Carrito");
            System.out.println("4.Salir");
            System.out.println("Selecciona la OP");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    VistaCliente v = new VistaCliente();
                    v.vistaC(clienteDAO);
                    break;
                case 2:
                    VistaProducto p = new VistaProducto();
                    p.vistaP(productoDAO);
                    break;
                case 3:
                    VistaCarrito c = new VistaCarrito();
                    c.vistaCc(carritoDAO, productoDAO, clienteDAO, cliente, producto, carrito);
                    break;

                default:
                    salida = 0;
            }
        }

    }

}
