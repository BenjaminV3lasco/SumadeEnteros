
package sumadeenteros;
import java.lang.*;
import java.io.*;
import java.util.*;

public class SumadeEnteros {

    public static void main(String[] args) {
      int numero_1, numero_3, resultado ;
      
      Scanner Teclado = new Scanner (System.in);
      
      System.out.println("Inserte el primer número:");
      numero_1 = Teclado.nextInt();
      
      System.out.println("Inserte el segundo número:");
      numero_3 = Teclado.nextInt();
      
      resultado=numero_1 + numero_3;
      
      System.out.println("El resultado es: "+resultado);
      
    }
    
}
