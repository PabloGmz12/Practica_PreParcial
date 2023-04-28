
import pckControladores.PersonasController;
import pckModelos.PersonasModel;
import pckVistas.frmPersonas;
import pckVistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
        PersonasModel ModeloPersonas = new PersonasModel();
        
        PersonasController ControladorPersona = new PersonasController(VistaPrincipal, VistaPersonas,
        ModeloPersonas);
    }
    
}
