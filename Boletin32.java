
package Boletin32;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Alumno.Enderezo ox = new Alumno().new Enderezo(" Gran via",23);  
      Alumno a = new Alumno("Uxia",5,ox);
      a.amosar();
      byte nota=Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce correcion de la nota"));
      a.setNota(nota);
      a.amosar();

    }
    
}