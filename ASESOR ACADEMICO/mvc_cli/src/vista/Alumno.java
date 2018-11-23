package vista;

import java.util.Scanner;

public class Alumno {
    
    Scanner teclado=new Scanner(System.in);
    String errores[]={
      "Ya esta registrado", 
      "Error al intentar registrar"
    };
    public void mostrarDatosAlumno(
            String cedula,
            String nombre,
            int nota){
        System.out.println(cedula+"     "+nombre+"  "+nota);
    }
    public boolean procesarOtro(){
       System.out.println("Desea registrar otro ? (S/N)");
       String in=teclado.next(); 
       return in.toUpperCase().equals("S");
    }
    public void error(int codigo){
        System.out.println(errores[codigo]);
    }
    public void mostrarInformacion(){
        System.out.println("Registro exitoso");
    }
    public String leerNombre(){
        System.out.println("Nombre:");
        return teclado.next();
    }
    public String leerCedula(){
        System.out.println("Cedula:");
        return teclado.next();
    }
    public int leerNota(){
        System.out.println("Nota:");
        return teclado.nextInt();
    }
}
