/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Clientes;
import Modelos.ClientesModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USUARIO 2
 */
public class ListaController implements ActionListener{
frmListas VistaLista;
ClientesModel ModeloClientes;

    public ListaController(frmListas VistaLista, ClientesModel ModeloClientes) {
        this.VistaLista = VistaLista;
        this.ModeloClientes = ModeloClientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        //LEVANTAR LA VISTA LISTAs
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnIngresarCliente)
        {
            this.ModeloClientes.EncolarCliente(this.VistaLista.txtApellidos.getText(), 
                    this.VistaLista.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<Clientes> listaLocal = this.ModeloClientes.ListarClientes();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(Clientes MiListaClientes: listaLocal)
                {
                    Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
                    this.VistaLista.txtListaClientes.setText(Cadena);
                }
        }    
    }
}
