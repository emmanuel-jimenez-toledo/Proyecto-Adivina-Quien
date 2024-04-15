import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Question_Erick {
       public static boolean pregunta(String la_pregunta) {
       Image iconic = redimensionarImagen
        ("D:\\Escuela\\Universidad\\Programacion\\JAVA2\\Imagenes\\Akinator.jpg",100, 100);
       Object[] opciones = {"SI", "NO","REGRESAR"};
        
        int respuesta = JOptionPane.showOptionDialog(
                null, 
                la_pregunta, 
                "Akinator", 
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


