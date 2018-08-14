/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSemana4;
import java.util.Scanner;
/**
 *
 * @author Crystell Reyes
 */
public class TablaPitagorica {
        public static void main(String[] args) {

         Scanner read =new Scanner(System.in);
         
          System.out.println("   \t  ||| T A B L A S   P I T A G O R I C A S  |||    ");       

         int n,contador=0,resultado;
         System.out.print("\n Ingrese un numero:  ");
         n=read.nextInt();
         for(int inicio=1;inicio<=n;inicio++){
             contador+=1;
             for(int inicio2=1;inicio2<=n;inicio2++){
                 
                 resultado=inicio2*contador;
                 System.out.print(resultado+"\t");
             }
             System.out.println("\n  ");
             }
         }      
}

