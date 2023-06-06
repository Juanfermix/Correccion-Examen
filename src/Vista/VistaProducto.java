/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import DAO.ProductoDAO;
import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class VistaProducto {
    
   
    private Producto producto = new Producto();
    
    public void vistaP(ProductoDAO pD) {
        
        var salida = 1;
        
        int codigo = 0;
        
        while (salida == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Menu Producto");
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
                    producto = new Producto(1, "Espejo", "Para ver la cara", 5.40);
                    pD.create(producto);
                    
                    producto = new Producto(2, "Casa", "Para vivir", 200000);
                    pD.create(producto);
                    
                    producto = new Producto(3, "Perro", "Para jugar", 500);
                    pD.create(producto);
                    
                    producto = new Producto(4, "Computadora", "Para programar", 540);
                    pD.create(producto);
                    System.out.println("Producto Creado");
                    break;
                case 2:
                    System.out.println("Ingresa el Codigo del producto ");
                    codigo = entrada.nextInt();
                    producto = (Producto) pD.read(codigo);
                    producto.setDescripción("Abcdefghij");
                    producto.setNombre("Abcedario");
                    producto.setPrecio(20.5);
                    pD.update(producto);
                    System.out.println("Producto Actualiado");
                    break;
                case 3:
                    System.out.println("Ingresa el Codigo del producto ");
                    codigo = entrada.nextInt();
                    producto = (Producto) pD.read(codigo);
                    pD.delete(producto);
                    System.out.println("Producto Eliminado");
                    break;
                case 4:
                    System.out.println("Ingresa el Codigo del producto ");
                    codigo = entrada.nextInt();
                    producto = (Producto) pD.read(codigo);
                    System.out.println(producto);
                    System.out.println("Producto Encontrado");
                    break;
                case 5:
                    pD.list();
                    break;
                default:
                    salida = 0;
            }
        }
    }
}
