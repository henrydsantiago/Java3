package controlador;

public class controlador {
   
    public void registrarAlumnos(){
        vista.Alumno va= new vista.Alumno();
        modelo.Alumno ma = new modelo.Alumno();
        modelo.Seccion secc = new modelo.Seccion();
        
        String nombre= va.leerNombre();
        int nota = va.leerNota();
        int cedula = va.leerCedula();
        
        
        
        ma.setNombre(nombre);
        ma.setNota(nota);
        ma.setCedula(cedula);

        if((secc.buscarAlumno(nombre) != null) && (secc.buscarPorCedula(cedula))!=null ){
            secc.agregarAlumno(ma);
            va.mostrarInformacion();
        }else
            va.error();
        
    }
}
