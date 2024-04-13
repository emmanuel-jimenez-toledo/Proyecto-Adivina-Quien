/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Checo
 */
import javax.swing.JOptionPane;

public class AdivinaQuien_Ulises {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                                            ¡Bienvenido al juego de Adivina Quién!
                                            Personajes:
                                            1. Freddie Mercury      11. Terminator          21. Jirafa
                                            2. Taylor Swift         12. Gato                22. León
                                            3. Capitan Americ       13. Quetzal             23. Pantera rosa
                                            4. Iron Man             14. Venom               24. Simón "Ghost" Riley
                                            5. Will Smith           15. Michelle Obama      25. Ariana Grande
                                            6. Perro                16. Iósif Stalin        26. Jaguar
                                            7. Bob Esponja          17. Omar Chaparro       27. Foca
                                            8. El Chavo del 8       18. Chespirito          28. Leonardo DiCaprio
                                            9. Dominic Toretto      19. Spiderman           29. Tiburón
                                            10. Porfirio Díaz       20. Tigre               30. Elefante
                                            Piensa en uno de estos personajes y presiona OK para continuar...""");

        // Iniciar el juego
        adivinaPersonaje();
    }
    // Función para adivinar el personaje
    private static void adivinaPersonaje() {
        JOptionPane.showMessageDialog(null, "Presione 'yes' para sí y 'no' para no.");

        // Preguntas principales
        boolean esReal = pregunta("¿Tu personaje es Real?");
        boolean esImaginario = !esReal ? pregunta("¿Tu personaje es Imaginario?") : false;
        boolean esUnAnimal = !esReal && !esImaginario ? pregunta("¿Tu personaje es un Animal?") : false;

        // Lógica según las respuestas principales
        if (esReal) {
            esReal();
        } else if (esImaginario) {
            esImaginario();
        } else if (esUnAnimal) {
            esUnAnimal();
        } else {
            JOptionPane.showMessageDialog(null, "¡Tu personaje no coincide con ninguna de las características!");
        }
    }

    // Función para adivinar personajes reales
    private static void esReal() {
        JOptionPane.showMessageDialog(null, "¡Vas por el camino de los personajes reales!");
        
        boolean esHombre = pregunta("¿Tu personaje es Hombre?");
        boolean esMujer = false;
        boolean esCantante = false;
        boolean nombre = false;

        if (esHombre) {
            esCantante = pregunta("¿Tu personaje es cantante?");
            nombre = pregunta("¿El nombre de tu personaje empieza con Freddie?");
        } else {
            esMujer = pregunta("¿Tu personaje es mujer?");
            if (esMujer) {
                esCantante = pregunta("¿Tu personaje es cantante?");
                nombre = pregunta("¿El nombre de tu personaje empieza con Taylor?");
            }
        }

        // Lógica para adivinar personajes reales
        if (esHombre || esMujer) {
            // Puedes agregar más lógica aquí para adivinar el personaje real
            if (esHombre && esCantante && nombre) {
                JOptionPane.showMessageDialog(null, "¡Estás pensando en Freddie Mercury!");
            } else if (esMujer && esCantante && nombre) {
                JOptionPane.showMessageDialog(null, "¡Estás pensando en Taylor Swift!");
            } else if (esHombre && !esCantante && !nombre) {
                // Agregamos a Will Smith como opción
                JOptionPane.showMessageDialog(null, "¡Estás pensando en Will Smith!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Tu personaje no coincide con ninguna de las características!");
            }
        }
    }

    // Función para adivinar personajes imaginarios
    private static void esImaginario() {
        JOptionPane.showMessageDialog(null, "¡Vas por el camino de los personajes imaginarios!");

        boolean esHumano = pregunta("¿Tu personaje es un humano?");
        boolean tieneEscudo = false, cyborg = false, volveré = false;
        boolean usaArmadura = false, felino = false, rosa = false;
        boolean esAmarillo = false, espacio = false, enemigoSpidey = false;
        boolean viveEnunBarril = false, soldado = false, mascCalavera = false;
        boolean esCorredor = false, musculoso = false, millonario = false;
        boolean hombre = false, niño = false, poderAraña = false;
        boolean craneoRojo = false, esSuperheroe = false, adolescente = false;
        boolean callofduty = false;
        
        if (esHumano){
            esSuperheroe = pregunta("¿Tu personaje es un superhéroe?");
            if (esSuperheroe){
                //Para el capitan america
                tieneEscudo = pregunta("¿Tu personaje usa un escudo?");
                if (tieneEscudo){
                    craneoRojo = pregunta("¿Tu personaje peleó contra Craneo Rojo?");
                }else{
                    //Para iron man
                    usaArmadura = pregunta("¿Tu personaje usa armadura?");
                    if (usaArmadura){
                        millonario = pregunta("¿Tu personaje es un genio, millonario, playboy, filántropo?");
                    }else{
                        //Spiderman
                        adolescente = pregunta("¿Tu personaje es un adolescente?");
                        if (adolescente){
                            poderAraña = pregunta("¿Tu personaje tiene poderes de araña?");
                        }
                    }
                }
            }else{
                //ghost
                soldado = pregunta("¿Tu personaje es un soldado?");
                if (soldado){
                    mascCalavera = pregunta("¿Tu personaje tiene una mascara de calavera");
                    if (mascCalavera){
                        callofduty = pregunta("¿Tu personaje pertenece a la saga Call of Duty?");
                    }
                }
            }
        }
        /*if (esSuperheroe) {
            tieneEscudo = pregunta("¿Tu personaje usa un escudo?");
            usaArmadura = pregunta("¿Tu personaje usa Armadura?");
        } else {
            esAmarillo = pregunta("¿El personaje es de color amarillo?");
            viveEnunBarril = pregunta("¿Tu personaje vive en un barril?");
            if (!viveEnunBarril) {
                esCorredor = pregunta("¿Tu personaje es corredor de autos?");
            }
        }*/

        // Lógica para adivinar personajes imaginarios
        if (esSuperheroe || esAmarillo || viveEnunBarril || esCorredor) {
            // Puedes agregar más lógica aquí para adivinar el personaje imaginario
            if (esSuperheroe && tieneEscudo && craneoRojo) {
                JOptionPane.showMessageDialog(null, "¡Estás pensando en Capitan America!");
            } else if (esSuperheroe && usaArmadura) {
                JOptionPane.showMessageDialog(null, "¡Estás pensando en Iron Man!");
            } else if (esAmarillo && viveEnunBarril) {
                JOptionPane.showMessageDialog(null, "¡Estás pensando en El Chavo del 8!");
            } else if (esCorredor) {
                JOptionPane.showMessageDialog(null, "¡Estás pensando en Dominic Toretto!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Tu personaje no coincide con ninguna de las características!");
            }
        }
    }

    // Función para adivinar animales
    private static void esUnAnimal() {
        JOptionPane.showMessageDialog(null, "¡Vas por el camino de los animales!");

        boolean esUnAnimal = true; // En este caso, la opción ya fue seleccionada como verdadera
        boolean ladra = pregunta("¿Tu personaje ladra?");
        boolean tieneMelena = pregunta("¿Tu personaje tiene melena?");

        // Lógica para adivinar animales
        if (esUnAnimal && ladra && tieneMelena) {
            JOptionPane.showMessageDialog(null, "¡Estás pensando en un león!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Tu personaje no coincide con ninguna de las características!");
        }
    }

    // Función para hacer preguntas al usuario
    private static boolean pregunta(String pregunta) {
        int respuesta = JOptionPane.showConfirmDialog(null, pregunta, "Adivina Quién", JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }
}
