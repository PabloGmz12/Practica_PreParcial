/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pckModelos.PersonasModel;
import pckVistas.frmPersonas;
import pckVistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class PersonasController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    PersonasModel ModeloPersonas;
    
    //public DefaultTableModel TablaPersonas = new DefaultTableModel();
    
    //Levantar de forma automática el form principal

    public PersonasController(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, PersonasModel ModeloPersonas) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.ModeloPersonas = ModeloPersonas;
        
        //Poner a la escucha el botón del form principal
        this.VistaPrincipal.btnFormPersonas.addActionListener(this);
        
        //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        //Mostrar tabla
        /*this.TablaPersonas.addColumn("APELLIDOS");
        this.TablaPersonas.addColumn("NOMBRE");
        this.TablaPersonas.addColumn("TELEFONO");
        
        this.VistaPersonas.jtTabla.setModel(TablaPersonas);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnFormPersonas){
            //Poner a la escucha
            this.VistaPersonas.btnAgregar.addActionListener(this);
            this.VistaPersonas.btnListar.addActionListener(this);
            
            //Levantar la vista usuarios
            this.VistaPersonas.setLocationRelativeTo(null);
            this.VistaPersonas.setVisible(true);
        }
        
        if(e.getSource()==this.VistaPersonas.btnAgregar){
            this.ModeloPersonas.AgregarPersonas(this.VistaPersonas.txtApellidos.getText(),
            this.VistaPersonas.txtNombre.getText(),
            this.VistaPersonas.txtTelefono.getText());
            JOptionPane.showMessageDialog(null,"Persona agregada!");
            this.VistaPersonas.txtApellidos.setText("");
            this.VistaPersonas.txtNombre.setText("");
            this.VistaPersonas.txtTelefono.setText(""); 
        }
        if(e.getSource()== this.VistaPersonas.btnListar){
            this.VistaPersonas.jtTabla.setModel(this.ModeloPersonas.MostrarPersonas());
        }
    }
}