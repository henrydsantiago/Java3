
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;

public class AlumnoDao extends Dao{

    @Override
    public void create(Object o) {
        Alumno a=(Alumno)o;
        String sql="insert into alumno "+
                "(cedula,nombre,nota) "+
                " values ('"+a.getCedula()+
                "','"+a.getNombre()+
                "',"+a.getNota()+")"; 
        bd.Conexion.ejecutarAccion(sql);
    }

    @Override
    public void delete(Object o) {
        Alumno a=(Alumno)o;
        String sql= "delete from alumno where cedula='"+a.getCedula()+"'";
        bd.Conexion.ejecutarAccion(sql);
    }

    @Override
    public void update(Object o) {
        Alumno a=(Alumno)o;
        String sql="delete from alumno "+
                " where cedula='"+a.getCedula()+"'"; 
        bd.Conexion.ejecutarAccion(sql);
    }

    @Override
    public Object get(String id) {
        String sql="select * from alumno where cedula='"+id+"'";
        ResultSet rs=bd.Conexion.ejecutarConsultar(sql);
        try {
            if (rs!=null && rs.next()){
                Alumno a= new Alumno();
                a.setCedula(rs.getString("cedula"));
                a.setNombre(rs.getString("nombre"));
                a.setNota(rs.getInt("nota"));
                return a;
            }
        } catch (SQLException ex) {
                Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList getAll() {
        String sql="select * from alumno ";
        ResultSet rs=bd.Conexion.ejecutarConsultar(sql);
        ArrayList<Object> alumnos = new ArrayList();
        try {
            if (rs!=null){
                while (rs.next()){
                    Alumno a= new Alumno();
                    a.setCedula(rs.getString("cedula"));
                    a.setNombre(rs.getString("nombre"));
                    a.setNota(rs.getInt("nota"));
                    alumnos.add(a);
                }
            }
        } catch (SQLException ex) {
                Logger.getLogger(AlumnoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos;
    }
    
}
