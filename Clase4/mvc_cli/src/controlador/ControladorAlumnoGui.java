
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorAlumnoGui implements ActionListener {
    vista.AlumnoGui va;
    modelo.Seccion ms;
    
    public ControladorAlumnoGui(modelo.Seccion ms){
        this.ms=ms;
    }
    
    public void main(){
        va = new vista.AlumnoGui();
        va.setVisible(true);
        va.getBtnAceptar().addActionListener(this);
        va.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aceptar")){
            
            modelo.Alumno ma=ms.buscarAlumno(va.getTxtCedula().getText());
            if (ma==null){
                ma=new modelo.Alumno();

                ma.setCedula(va.getTxtCedula().getText());
                ma.setNombre(va.getTxtNombre().getText());
                ma.setNota(Integer.parseInt(va.getTxtNota().getText()));
                
                ms.agregarAlumno(ma);
                JOptionPane.showMessageDialog(null,
                        "Se registro exitosamente");
                va.limpiar();
            }else
            {
                va.getTxtNombre().setText(ma.getNombre());
                va.getTxtNota().setText(String.valueOf(ma.getNota()));
            }
        }else
            if (e.getActionCommand().equals("Cancelar"))
                System.exit(0);
        
    }
}
