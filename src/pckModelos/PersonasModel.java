/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author umg
 */
public class PersonasModel {
    public ArrayList ListaPersonas = new ArrayList();
    DefaultTableModel ModeloTabla;
    public void AgregarPersonas(String apellidos, String nombre, String telefono){
        Personas nuevaPersona = new Personas(apellidos, nombre, telefono);
        this.ListaPersonas.add(nuevaPersona);
    }
    
    public DefaultTableModel MostrarPersonas(){
        ArrayList<Personas> ListaLocal = ListaPersonas;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        
        for(Personas MiListaDePersonas: ListaLocal){
            this.ModeloTabla.addRow(new Object[]{MiListaDePersonas.getApellidos(),
            MiListaDePersonas.getNombre(),MiListaDePersonas.getTelefono()});
        }
        return ModeloTabla;
    }
}
