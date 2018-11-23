
package modelo;

import DAO.AlumnoDao;
import java.util.ArrayList;

public class Seccion {
    private AlumnoDao alumnoDao= new AlumnoDao();
    private ArrayList<Alumno> alumnos;
    public final int MAXIMO=10;
    
    public Alumno getAlumno(int i){
        if (i>=alumnos.size())
            return null;
        else
            return alumnos.get(i);
    }
    public int getCantidadAlumnos(){
        return alumnos.size();
    }
    public Alumno buscarAlumno(String cedula){
        for (Alumno a:alumnos){
            if (a.getCedula().equals(cedula))
                return a;
        }
        return null;
    }
    public boolean agregarAlumno(Alumno a){
        if (alumnos.size()<MAXIMO){
            alumnoDao.create(a);
            alumnos.add(a);
            return true;
        }else
            return false;
    }
    public Seccion(){
        alumnos=new ArrayList();
        alumnos=alumnoDao.getAll();
    }
}
