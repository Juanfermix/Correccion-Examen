/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class ClienteDAO implements DaoABS {

    private List<Cliente> listaCliente;

    public ClienteDAO() {
        listaCliente = new ArrayList<>();
    }

    @Override
    public void create(Object obj) {
        Cliente c = (Cliente) obj;
        if (c instanceof Cliente) {
            listaCliente.add(c);
        }
    }

    @Override
    public Object read(Object obj) {
        String cedula = (String) obj;
        for (Cliente c : listaCliente) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Cliente) {
            String codigo = ((Cliente) obj).getCedula();
            for (int i = 0; i < listaCliente.size(); i++) {
                Cliente cliente = listaCliente.get(i);
                if (cliente.getCedula().equals(codigo)) {
                    listaCliente.set(i, (Cliente) obj);
                    break;
                }
            }
        }
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Cliente) {
            for (int i = 0; i < listaCliente.size(); i++) {
                Cliente cliente = listaCliente.get(i);
                if (cliente.equals((Cliente) obj)) {
                    listaCliente.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void list() {
        for (Cliente c : listaCliente) {
            System.out.println(c.toString());
        }
    }

}
