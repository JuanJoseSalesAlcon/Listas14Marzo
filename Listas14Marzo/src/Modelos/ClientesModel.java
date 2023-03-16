/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO 2
 */
public class ClientesModel {
Queue<Clientes> ListaClientes = new LinkedList();

    public void EncolarCliente(String ape, String nom)
    {
        Clientes nuevoCliente = new Clientes(ape, nom);
        this.ListaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO A LA LISTA");
    }
    
public Queue ListarClientes()
{
    return this.ListaClientes;
}

public void DesEncolar()
{
    this.ListaClientes.poll();
}

}

