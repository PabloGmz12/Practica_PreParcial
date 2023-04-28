/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

import java.util.ArrayList;

/**
 *
 * @author umg
 */
public class PersonasModel {
    public ArrayList<Personas> ListaPersonas = new ArrayList<Personas>();
    
    public void AgregarPersonas(String apellidos, String nombre, String telefono){
        Personas nuevaPersona = new Personas(apellidos, nombre, telefono);
        this.ListaPersonas.add(nuevaPersona);
    }
    
    public ArrayList MostrarPersonas(){
        return ListaPersonas;
    }
}
