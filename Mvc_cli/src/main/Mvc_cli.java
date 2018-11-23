
package main;

public class Mvc_cli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        controlador.controlador c = new controlador.controlador();
        controlador.ControladorAlumnoGUI ca = new controlador.ControladorAlumnoGUI();
        ca.main();
    }
    
}
