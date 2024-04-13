

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Question_Erick {
     public static boolean pregunta(String la_pregunta) {
        int respuesta = JOptionPane.showConfirmDialog(null, la_pregunta, "Akinator", JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }
     
     
       
   public static Image redimensionarImagen(String rutaImagenOriginal, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(rutaImagenOriginal);
        Image imagenOriginal = icono.getImage();
        return imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    }
    
}


