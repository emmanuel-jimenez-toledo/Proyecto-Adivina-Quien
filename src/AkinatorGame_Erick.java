import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AkinatorGame_Erick {
    
   public static void iniciarJuego() {
        //public static void main(String args[]){
            
       // Cambia el color de fondo del JOptionPane
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.getHSBColor(134, 25, 98));
        UI.put("Panel.background", Color.getHSBColor(134, 25, 98));
        
        
        //////////REALES/////////
        boolean real = pregunta("Tu personaje es una persona real?");
        if (real) {
            
        //Historia
        boolean muerto = pregunta("¿Esta muerto");
        if (muerto) {
            boolean sovietico = pregunta("¿Goberno la Union Sovietica?");
            if (sovietico) {
               boolean bigote = pregunta("¿Tiene bigote?");
               if(bigote){
                  boolean ww2 = pregunta("¿Participo en la WW2?");
                   if(ww2){
                     boolean urss = pregunta("¿Promovió la colectivización de la agricultura?");
                        if(urss){
                          JOptionPane.showMessageDialog(null,"Es Iosif Stalin!");
                        System.exit(0);
                        }
                   }
               }
            } 
            boolean mexico = pregunta("¿Fue gobernante de mexico?");
            if(mexico){
                boolean pais = pregunta("¿Mejoro la eocnomia del pais?");
                if(pais){
                    boolean general = pregunta("¿Fue general?");
                    if(general){
                        boolean nueve = pregunta("¿Se reeligio 9 veces?");
                        if(nueve){
                            boolean diaz = pregunta("¿Tuvo un periodo con su nombre?");
                            if(diaz){
                                JOptionPane.showMessageDialog(null,"Es Porfirio Diaz");
                             System.exit(0);
                            }
                        }
                    }
                }
            } //comediante
            boolean come = pregunta("¿Es comediante?");
            if(come){
                boolean esposo = pregunta("¿Es esposo de Florinda Mesa?");
                    if(esposo){
                        boolean personaje = pregunta("¿Su personaje es el Chavo del 8?");
                        if(personaje){
                        JOptionPane.showMessageDialog(null, "Es Roberto Gomez Bolaños");
                       System.exit(0); 
                    }
                }
            }
           //artista
           boolean artista = pregunta("¿Es compositor y cantante?");
           if(artista){
               boolean britanico = pregunta("¿Es un artista britanico?");
               if(britanico){
                   boolean rock = pregunta("¿Es conocido como el rey del Rock?");
                   if(rock){
                       JOptionPane.showMessageDialog(null, "Es Freddie Mercury");
                       System.exit(0); 
                   }
               }
           }
        }
      //Historia
        boolean mujer = pregunta("¿Es mujer?");
        if(mujer){
           boolean Usa = pregunta ("¿Es estadounidense?");
           if(Usa){
               boolean cel = pregunta("¿Es una celebridad?");
               if(cel){
                    boolean ex = pregunta("¿Es la Ex primera dama de Estados Unidos?");
                    if(ex){
                        JOptionPane.showMessageDialog(null, "Es Michelle Obama");
                       System.exit(0);
                    }//artistas
                    boolean arts = pregunta("¿Es cantante y compositor?"); 
                    if(arts){
                        boolean pelo = pregunta("¿Es rubia?");
                        if(pelo){
                            boolean tour = pregunta("¿Se relaciona con “The Eras Tour”?");
                            if(tour){
                                JOptionPane.showMessageDialog(null, "	Taylor Swift");
                              System.exit(0);
                            }
                        }
                    }
                    boolean cola = pregunta("¿Su peinado Caracteristico es una Coleta Alta?");
                    if(cola){
                        boolean act = pregunta("¿Participó en “Victorius” y en “Sam y Cat”?");
                        if(act){
                            JOptionPane.showMessageDialog(null, " Ariana Grande");
                              System.exit(0);
                        }
                    }
               }
           } 
        }//Comediante 
        boolean mexicano = pregunta("¿Es Mexicano?");
        if(mexicano){
            boolean comediante = pregunta("¿Es comediante?");
            if(comediante){
                {
                  boolean chaparro = pregunta("¿Es Chaparro?");
                   if(chaparro){
                        JOptionPane.showMessageDialog(null, "ES Omar Chaparro");
                       System.exit(0); 
                    }
                    
                }
            }
        }//artista
       boolean USA = pregunta ("¿Es estadounidense?");
           if(USA){
               boolean cele = pregunta("¿Es una celebridad?");
               if(cele){
                   boolean actor = pregunta("¿Es Actor?");
                   if(actor){
                       boolean ala = pregunta("¿Interpretó al genio de “Aladdin”?");
                       if(ala){
                           JOptionPane.showMessageDialog(null, "Es Will Smith");
                       System.exit(0);
                       }
                   }
                   boolean tic = pregunta ("¿Protagonista del Titanic?");
                   if(tic){
                        boolean oscar = pregunta("¿Ganador al Oscar por la película “El renacido”?");
                        if(oscar){
                           JOptionPane.showMessageDialog(null, "¡Es Leonardo DiCaprio!");
                           System.exit(0);
                        }
                   }
               }
        }
        }
        
        //////////ANIMALES//////////
        boolean ladrar = false;         boolean cuatro_patas = false;
        boolean canino = false;         boolean mejor_amigo = false;    
        boolean omnivoro = false;       boolean felino = false;     
        boolean maullar = false;        boolean pariente = false;    
        boolean carnivoro = false;      boolean ave = false;
        boolean ruge = false;           boolean disney = false;                          
        boolean selva = false;          boolean naranja_rayas = false;    
        boolean villano = false;        boolean culturas = false;    
        boolean manchas_negras = false; boolean mar_tierra = false;
        boolean trucos = false;         boolean dos_patas = false; 
        boolean maritimo = false;       boolean temido = false;                          
        boolean nacional = false;       boolean loro = false;  
        boolean extincion = false;      boolean herviboro = false;    
        boolean sabana= false;          boolean cuello_largo= false;  
        boolean manchas_moteadas = false;    boolean melena = false;
        boolean africa = false;         boolean pacifico_atlantico = false; 
        boolean depredadores = false;   boolean versiones = false;
        boolean mamut = false;          boolean trompa = false;
        boolean terrestre = false;    
         
        boolean animal = pregunta("Tu personaje es un animal?");    
        
         //BIEN
    if(animal){
     //Cuatro patas   
     cuatro_patas = pregunta("¿Tiene cuatro patas?");
    if(cuatro_patas){
         omnivoro = pregunta("¿Se alimenta de plantas y carne?");
        if(omnivoro){
          canino = pregunta("¿Es canino?");
         if(canino){
         mejor_amigo = pregunta("¿Es el mejor amigo del hombre?");
        if(mejor_amigo){
            ladrar = pregunta("¿Ladra?");
            if(ladrar){
             JOptionPane.showMessageDialog(null,"¡Es un perro!");
        System.exit(0);
                }      
            }
        }
        }//omnivoro
        
   
         herviboro = pregunta("Es un herviboro?");
        if(herviboro){
           sabana = pregunta("Se encuentra en la sabana?");
          if(sabana){
            manchas_moteadas = pregunta("Tiene manchas moteadas?");
            if(manchas_moteadas){
            cuello_largo = pregunta("Tiene cuello largo?");
            if(cuello_largo){
              JOptionPane.showMessageDialog(null,"Es una jirafa");
               System.exit(0);
            }
            }
           
         terrestre = pregunta("Es el animal terrestre mas pesado?");
         if(terrestre){
         mamut = pregunta("Es descendiente del mamut?");
         if(mamut){
         trompa = pregunta("Tiene una trompa larga?");
         if(trompa){
           JOptionPane.showMessageDialog(null,"Es un Elefante");
          System.exit(0);
         }
         }
         }
        
          }//sabana
          
       
          }//HERVIBORO
   
        
        carnivoro = pregunta("es carnivoro?");
       if(carnivoro){
            felino = pregunta("es felino?");
           if(felino){
            pariente = pregunta("es pariente del tigre?");
           if(pariente){
            maullar = pregunta("maulla?");
           if(maullar){
               JOptionPane.showMessageDialog(null, "Es un gato");
               System.exit(0);
           }
           }
           
           africa = pregunta("Viven en Africa");
           if(africa){
           ruge = pregunta("Ruge?");
           if(ruge){
           melena = pregunta("Los machos tienen melena?");
           if(melena){
           disney = pregunta("Tiene su propia pelicula de Disney?");
           if(disney){
             JOptionPane.showMessageDialog(null,"Es un Leon");
            System.exit(0);
           }
           }
           }//ruge
           }//africa
           
           ruge = pregunta("Ruge?");
           if(ruge){
           naranja_rayas = pregunta("Es de color Naranja con rayas negras?");
           if(naranja_rayas){
           villano = pregunta("Es  el villano de -El libro de la selva-?");
           if(villano){
                 JOptionPane.showMessageDialog(null,"Es un Tigre");
                 System.exit(0);
           }
           }
           }
           
           selva = pregunta("Se encuentra en la selva?");
           if(selva){
           culturas = pregunta("Es venerado por las culturas mesoamericas?");
           if(culturas){
           manchas_negras = pregunta("Tiene manchas negras?");
           if(manchas_negras){
             JOptionPane.showMessageDialog(null,"Es un Jaguar");
             System.exit(0);
           }
           }
           }
           
           
        }//felino
           
       
        }//carnivoro
        }//cuatro patas
    
    
    
    
    
    
      
        //AREA DE AVES
         loro = pregunta("son parecidos a los loros?");
        if(loro){
            selva = pregunta("se encuentra en la selva?");
           if(selva){
            nacional = pregunta("es un animal nacional de Guatemala?");
           if(nacional){
            herviboro = pregunta("es un herviboro?");
           if(herviboro){
            extincion = pregunta("Estan en peligro de extincion?");
           if(extincion){
           JOptionPane.showMessageDialog(null, "Es un quetzal");
           System.exit(0);
           }
           }//herviboro
           }
           }
          
        }//lorors
        
      
     
       maritimo = pregunta("Es marino?");
        if(maritimo){
            carnivoro = pregunta("Son carnivoros?");
            if(carnivoro){
              mar_tierra = pregunta("Puede estar en el mar y en la tierra?");
        if(mar_tierra){
        trucos = pregunta("Es usado en trucos y espectaculos en acuarios?");
        if(trucos){
        dos_patas = pregunta("Cuenta cos dos patas en forma de aleta?");
        if(dos_patas){
          JOptionPane.showMessageDialog(null,"Es una foca");
             System.exit(0);
        }
        }
        }
        temido = pregunta("Temidos por las personas?");
        if(temido){
        pacifico_atlantico = pregunta("Se encuentran en los oceanos pacifio y atlantico?");
        if(pacifico_atlantico){
        depredadores = pregunta("Son depredadores de los oceanos?");
        if(depredadores){
        versiones = pregunta("Tiene versiones martillo y tigre?");
        if(versiones){
          JOptionPane.showMessageDialog(null,"Es un tiburon");
             System.exit(0);
        }
        }
        }
        }
        }//carnivoro
        }//maritimo
      
    
    
      
      
    
    }//animal
    
       
        
        
    }
        public static boolean pregunta(String la_pregunta) {
       Image iconic = redimensionarImagen
        ("D:\\Escuela\\Universidad\\Programacion\\JAVA2\\Imagenes\\Akinator.jpg",100, 100);
       Object[] opciones = {"SI", "NO","SALIR"};
        
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
