
package javaaula_tiposprimitivos;

import java.util.Scanner;

public class JavaAula_TiposPrimitivos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota de %s foi %.2f. \n", nome, nota);
        
        
    }
           
}


