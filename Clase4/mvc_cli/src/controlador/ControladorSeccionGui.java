
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;

public class ControladorSeccionGui implements ActionListener {
    vista.SeccionGui vs;
    modelo.Seccion ms=new modelo.Seccion();
    
    public void main(){
        vs=new vista.SeccionGui();
        llenarTabla();
        vs.getbtnNuevo().addActionListener(this);
        vs.setVisible(true);
    }
    
    public void llenarTabla(){
        int n=ms.getCantidadAlumnos();
        DefaultTableModel m=
                (DefaultTableModel)vs.getListaAlumnos().getModel();
        m.setRowCount(0);
        for (int i=0;i<n;i++){
            Alumno a=ms.getAlumno(i);
            Object arr[]={
                a.getCedula(),
                a.getNombre(),
                a.getNota()
            };
            m.addRow(arr);
        }            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorAlumnoGui c=new ControladorAlumnoGui(ms);
        c.main();
    }
}
