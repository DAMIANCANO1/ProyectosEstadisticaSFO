/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sfo;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class DiagramadeVenn {
    public static void main(String[] args) {
       Scanner entradaConsola = new Scanner(System.in);
        System.out.print("Cantidad de Datos Totales: ");
        int numTotales = entradaConsola.nextInt();
        int[] arrTotales = new int[numTotales];
        System.out.println("Ingresa los Datos Totales:");
        for (int i = 0; i < numTotales; i++) {
            arrTotales[i] = entradaConsola.nextInt();
        }
        System.out.print("Cantidad de Datos de A: ");
        int numA = entradaConsola.nextInt();
        int[] arrA = new int[numA];
        System.out.println("Ingresa los Datos de A:");
        for (int j = 0; j < numA; j++) {
            arrA[j] = entradaConsola.nextInt();
        }
        System.out.print("Cantidad de Datos de B: ");
        int numB = entradaConsola.nextInt();
        int[] arrB = new int[numB];
        System.out.println("Ingresa los Datos de B:");
        for (int k = 0; k < numB; k++) {
            arrB[k] = entradaConsola.nextInt();
        }
        int contAUB = 0;
        int contANB = 0;
        int contA = 0;
        int contB = 0;
        int contAUBnegado = 0;
        int contANBnegados = 0;
        String textoA = "";
        String textoB = "";
        String textoInterseccion = "";
        String textoAfuera = "";

        for (int i = 0; i < numTotales; i++) {
            int datoActual = arrTotales[i];
            int halladoA = 0;
            for (int j = 0; j < numA; j++) {
                if (arrA[j] == datoActual) halladoA++;
            }
            int halladoB = 0;
            for (int k = 0; k < numB; k++) {
                if (arrB[k] == datoActual) halladoB++;
            }if (halladoA > 0 || halladoB > 0) contAUB++;
            if (halladoA > 0 && halladoB > 0) {
                contANB++;
                textoInterseccion += datoActual + " ";
            } if (halladoA > 0) {
                contA++;
                textoA += datoActual + " ";
            } if (halladoB > 0) {
                contB++;
                textoB += datoActual + " ";
            }if (halladoA == 0 && halladoB == 0) {
                contAUBnegado++;
                textoAfuera += datoActual + " ";
            }  if (!(halladoA > 0 && halladoB > 0)) contANBnegados++;
        } 
        double p1 = (double) contAUB / numTotales ;
        double p2 = (double) contANB / numTotales ;
        double p3 = (double) contA / numTotales ;
        double p4 = (double) contB / numTotales;
        double p5 = (double) contAUBnegado / numTotales;
        double p6 = (double) contANBnegados / numTotales;
        System.out.println();
        System.out.println("======= ELEMENTOS =======");
        System.out.print("Datos en A: ["); 
        System.out.print(textoA.trim()); 
        System.out.println("]");
        System.out.print("Datos en B: ["); 
        System.out.print(textoB.trim()); 
        System.out.println("]");
        System.out.print("Interseccion (A N B): ["); 
        System.out.print(textoInterseccion.trim()); 
        System.out.println("]");
        System.out.print("Datos fuera de A y B: ["); 
        System.out.print(textoAfuera.trim()); 
        System.out.println("]");
        System.out.println();
        System.out.println("======= RESULTADOS =======");
        System.out.println("P (A U B)        " + p1 + "%");
        System.out.println("P (A N B)       " + p2 + "%");
        System.out.println("P (A)        " + p3 + "%");
        System.out.println("P (B)            " + p4 + "%");
        System.out.println("P (A U B)      " + p5 + "%");
        System.out.println("P (A N B)     " + p6 + "%");
    }
      
    
}
