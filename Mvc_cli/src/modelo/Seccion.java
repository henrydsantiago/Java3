package modelo;

import java.util.ArrayList;

public class Seccion {
    private ArrayList<Alumno> alumnos;  //Atributo privado
    
    public boolean agregarAlumno(Alumno a){ //Método agregar alumno
        if(alumnos.size()<10){
            alumnos.add(a);
            return true;
        }else
            return false;
    }
    
    public Seccion(){   //Constructor
        alumnos = new ArrayList();
    }
    
    public Alumno buscarAlumno(String nombre){
        for(Alumno a:alumnos){
            if(a.getNombre().equals(nombre))
                return a;
        }
        return null;
    }
    
    public Alumno buscarPorCedula(int cedula){
        for(Alumno a:alumnos){
            if(a.getCedula()==(cedula))
                return a;
        }
        return null;
    }

    
    
}
