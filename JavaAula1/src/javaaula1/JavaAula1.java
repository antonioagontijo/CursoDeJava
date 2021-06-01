
package javaaula1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class JavaAula1 {

    public static void main(String[] args) {
       
        System.out.println("Olá Mundo!");
        System.out.println("Hello");
        
        
        Date relogio = new Date();
        
        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString());
        
        
        System.getProperties();
        System.out.println(System.getProperty("user.language"));
        
        //Para mostrar resolução da tela
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        System.out.println("A resolução da tela é: " +d.width + "x" +d.height);
        
        //Para mostrar idioma do sistema
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do seu sistema é " + idioma.getDisplayLanguage());
        //System.out.println(idioma.getDisplayLanguage());
        
        
        
        
    }
    
}
