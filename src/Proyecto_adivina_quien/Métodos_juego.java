package Proyecto_adivina_quien;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Métodos_juego {
       public static boolean pregunta(String la_pregunta) {
       Image iconic = redimensionarImagen
        ("C:\\Users\\toled\\Downloads\\El acertijo.png",320, 300);
       Object[] opciones = {"SI", "NO", "FINALIZAR"};
        
        int respuesta = JOptionPane.showOptionDialog(
                null, 
                la_pregunta, 
                "Adivina Quién", 
                0,
                JOptionPane.QUESTION_MESSAGE,
                 new ImageIcon(iconic),
                opciones,
                0
                );
        
        if (respuesta == 0) {
            return true; 
        } else if (respuesta == 1) {
            return false;
        }else if (respuesta == 2){
            System.exit(0);
            return false;
        }else{
        return false;
        }
    }
     
     
       
   public static Image redimensionarImagen(String rutaImagenOriginal, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(rutaImagenOriginal);
        Image imagenOriginal = icono.getImage();
        return imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    }
   
 
    
   
    
}


