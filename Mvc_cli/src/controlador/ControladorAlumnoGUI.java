
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorAlumnoGUI implements ActionListener {
    vista.AlumnoGUI va;
    modelo.Seccion ms = new modelo.Seccion();
    
    public void main(){
        va = new vista.AlumnoGUI();
        va.setVisible(true);
        va.getBtnAceptar().addActionListener(this);
        va.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //El parámetro e indica quien está disparando el evento
        e.getActionCommand();
        if(e.getActionCommand().equalsIgnoreCase("ACEPtar")){
            
            modelo.Alumno ma=ms.buscarAlumno(va.getTxtCedula().getText());
            if(ma==null){
            ma = new modelo.Alumno();
            
            ma.setNombre(va.getTxtNombre().getText());
            ma.setCedula(Integer.parseInt(va.getTxtCedula().getText()));
            ma.setNota(Integer.parseInt(va.getTxtTelefono().getText()));
            
            JOptionPane.showMessageDialog(null, "Alumno registrado exitosamente");
            }   
        }else
            if(e.getActionCommand().equalsIgnoreCase("canCELAR")){
                JOptionPane.showMessageDialog(null, "BYE! ");
                System.exit(0);
            }
        
    }
}
