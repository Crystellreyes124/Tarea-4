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
public class Fibonacci {
            public static void main(String[] args) {

         Scanner read =new Scanner(System.in);
         
          System.out.println("   \t  ||| S E R I E   F I B O N A C C I  |||    ");       

         int numero,fibonacci=0,resultado=1,inicio=1,cont=0,contador=0;
         System.out.print("\n Ingrese un numero mayor a 1:  ");
         numero=read.nextInt();
         
         for(int n=1;n<numero;n++){
             resultado=inicio+cont;
             
             
             cont=inicio;
             inicio=resultado;
             
             
             contador+=1;
             }
         System.out.println("\n El numero Fibonacci es:  "+resultado);
         }  
    
}
