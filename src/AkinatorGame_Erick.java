
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AkinatorGame_Erick {
    public static void main(String[] args) {
       // Cambia el color de fondo del JOptionPane
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.getHSBColor(100, 50, 30));
        UI.put("Panel.background", Color.getHSBColor(100, 50, 30));
        
        
        
        boolean genio = pregunta("¿Es el personaje un genio?");
        if (genio) {
            boolean web = pregunta("¿Funciona en la web?" );
            if (web) {
                System.out.println("¡Eres Akinator!");
                System.exit(0);
            }
        } //genio
        
        boolean amarillo = pregunta("Tu personaje es amarillo");
        if (amarillo) {
            boolean cuadrado = pregunta("¿Es cuadrado?");
            if (cuadrado) {
               boolean fondo = pregunta("¿Vive en el fondo del mar?");
               if(fondo){
                   System.out.println("Es bob esponja!");
                       System.exit(0);
               }
            } 
        } // bob esponja
        
        
        
        
        
        //ANIMALES
        boolean animal = pregunta("Tu personaje es un animal?");
        if (animal) {
            //AREA DE FELINOS
            boolean felino = pregunta("¿Es felino?");
            if (felino) {
               boolean rayas = pregunta("¿Tiene rayas negras?");
               if(rayas){
                    boolean patas = pregunta("¿Tiene cuatro patas?");
                    if(patas){
                         JOptionPane.showMessageDialog(null,"Es un tigre!");
                       System.exit(0); 
                    }
               }
                boolean cafe = pregunta("¿Es cafe??");
                if(cafe){
                     JOptionPane.showMessageDialog(null,"Es un Leon");
                    System.exit(0);
                }
               boolean negro = pregunta("¿Es negro?");
                if(negro){
                    JOptionPane.showMessageDialog(null,"Es un JAguar negro");
                    System.exit(0);
                }
                
            } //felino
        } 
        
        
        
         if (animal) {
             //AREA DE MARINOS
         boolean marino = pregunta("¿Es marino");
           if(marino){
          boolean azul = pregunta("Es azul?");
             if(azul){
               // Cargar la imagen redimensionada
               Image imagenRedimensionada = Question_Erick.redimensionarImagen
               ("D:\\Escuela\\Universidad\\Programacion\\JAVA2\\Imagenes\\delfin.jpeg", 200, 200);

                // Mostrar el mensaje con la imagen
                JOptionPane.showMessageDialog(
                    null,
                    "Es un delfín",
                    "Akinator",
                    JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(imagenRedimensionada)
                );
                System.exit(0);
             }
             
           }//marino
         }
        
        
         if (animal) {
             //AREA DE AVES
        boolean ave = pregunta("Es un ave?");
         }
         
         
     
        
         
    
        
    }
    //No se puede usar los package, porque no tiene paquete propio el programa, así que lo pasé aquí
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
