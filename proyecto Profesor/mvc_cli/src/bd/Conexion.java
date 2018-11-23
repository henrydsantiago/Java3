package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {
       private static Connection c;
    private static Statement instruccion;
    
    public static boolean ejecutarAccion(String sql) {
   
        try {
             conectar();
            return instruccion.execute(sql);
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar consulta: "+ex.getMessage());
            return false;
        }
    }
    
    public static ResultSet ejecutarConsultar(String sql) {
        
        try {
             conectar();
            return instruccion.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar consulta: "+ex.getMessage());
            return null;
        }
    }
    
    public static boolean conectar() {
        
        try {
            //Patrón Singleton
            if (c==null) {
                //Class.forName("com.mysql.jdbc.Driver").newInstance();
                //c=DriverManager.getConnection("jdbc:mysql://localhost/x","root","");
                String url="jdbc:sqlite:bd.db";
                c=DriverManager.getConnection(url);
                
            }
            instruccion=c.createStatement();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
