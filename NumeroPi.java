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
public class NumeroPi {
          public static void main(String[] args) {

         Scanner read =new Scanner(System.in);
         
          System.out.println("   \t  ||| ESTIME EL VALOR DE PÍ |||    ");
          
          System.out.print("\n Ingrese cantidad de terminos deseados:   ");
          int numero=read.nextInt();
          
          
          
          System.out.println("Numero "+numero+" : pí= "+pi(numero));
          
          }
          
          
          public static double pi(int numero){
         double pi2=0,termino,s=0;
         int d=1,sig=1;
         double pi1;
         
         
         for(pi1=1;pi1<=numero;pi1++){
             termino=(double) 1/d * sig;
             s+=termino;
             d+=2;
             sig*= -1;
            }
          
          return s*4;
}
}