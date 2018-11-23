
package main;

public class Mvc_cli {

    public static void main(String[] args) {
        controlador.Controlador c=new controlador.Controlador();
        controlador.ControladorAlumnoGui ca=
                new controlador.ControladorAlumnoGui();
        ca.main();
    }
    
}
