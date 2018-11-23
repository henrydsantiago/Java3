package vista;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Alumno {
    Scanner teclado = new Scanner(System.in);
    
    public void mostrarInformacion(){
        System.out.println("Registro exitoso");
                
    }
    
    public String leerNombre(){
        System.out.println("Nombre: ");
        return teclado.next();
    }
    
    public int leerNota(){
        System.out.println("Nota: ");
        return teclado.nextInt();
    }
    
    public int leerCedula(){
        System.out.println("Cedula: ");
        return teclado.nextInt();
    }
    
    public int buscarPorCedula(){
        System.out.println("Ingrese la cedula a buscar: ");
        return teclado.nextInt();
    }
    
    public void error(){
        System.out.println("Error. Este alumno ya está registrado");
    }
   
}
