
package controlador;

public class Controlador {
    
    vista.Alumno va=new vista.Alumno();
    modelo.Seccion secc=new modelo.Seccion();
        
    public void main(){
        registrarAlumnos();
        mostrarAlumnos();
    }
    
    public void mostrarAlumnos(){
        System.out.println("Listado de alumnos:");
        for (int i=0;i<secc.getCantidadAlumnos();i++)
        {
            modelo.Alumno a=secc.getAlumno(i);
            va.mostrarDatosAlumno(
                    a.getCedula(), 
                    a.getNombre(),
                    a.getNota());
        }
    }
    public void registrarAlumnos(){
        
        modelo.Alumno ma;
        do{
            
            int nota=va.leerNota();
            ma=secc.buscarAlumno(nota);
            if (ma!=null){
                va.error(0);
                va.mostrarDatosAlumno(
                    ma.getCedula(), 
                    ma.getNombre(),
                    ma.getNota());
            }else{
                String nombre=va.leerNombre();
                
                String cedula=va.leerCedula();
                ma=new modelo.Alumno();
                ma.setCedula(cedula);
                ma.setNombre(nombre);
                ma.setNota(nota);

                if (secc.agregarAlumno(ma))
                    va.mostrarInformacion();
                else
                    va.error(1);
            }
        }while (va.procesarOtro());
    }
}
