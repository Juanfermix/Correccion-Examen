/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import DAO.ClienteDAO;
import Modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class VistaCliente {

   

    public void vistaC(ClienteDAO CD) {
        var salida = 1;
        String cedula = "";
        while (salida == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Menu Cliente");
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
                    Cliente c = new Cliente("0107161911", "Juan Fernando", "Alvarez Picon", "Chicapamba", "0990081571");
                    Cliente c1 = new Cliente("0987654321", "Daniel", "Diaz", "Miraflores", "0987654321");
                    Cliente c2 = new Cliente("1234567890", "Raul", "Zhicay", "Garaicoa", "032156478");
                    Cliente c3 = new Cliente("4234234234", "Carlos", "Criollo", "Ricaurte", "095231473");
                    CD.create(c);
                    CD.create(c1);
                    CD.create(c2);
                    CD.create(c3);
                    System.out.println("Clientes Creados");
                    break;
                case 2:
                    System.out.println("Ingresa la cedula del cliente: ");
                    cedula = entrada.next();
                    Cliente c4 = (Cliente) CD.read(cedula);
                    System.out.println("Ingresa El nombre del cliente para actualizar:");
                    String nombre = entrada.next();
                    c4.setNombres(nombre);
                    CD.update(c4);
                    System.out.println("Cliente Actualizado");
                    break;
                case 3:
                    System.out.println("Ingresa la cedula del cliente: ");
                    cedula = entrada.next();
                    Cliente c5 = (Cliente) CD.read(cedula);
                    CD.delete(c5);
                    System.out.println("Cliente Eliminado");
                    break;
                case 4:
                     System.out.println("Ingresa la cedula del cliente: ");
                    cedula = entrada.next();
                    Cliente c6 = (Cliente) CD.read(cedula);
                    System.out.println(c6.toString());
                    break;
                case 5:
                    CD.list();
                    break;

                default:
                    salida = 0;
            }
        }
    }

}
