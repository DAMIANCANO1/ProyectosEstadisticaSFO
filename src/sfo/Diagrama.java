/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Diagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       System.out.print("Cantidad de Datos Totales: ");
       int cantidadTotal = entrada.nextInt();
       ArrayList<Integer> listaTotal = new ArrayList<>();
        
       System.out.println("Ingresa los Datos Totales:");
       for (int i = 0; i < cantidadTotal; i++) {
           listaTotal.add(entrada.nextInt());
      }
        System.out.print("Cantidad de Datos de A: ");
       int cantidadA = entrada.nextInt();
        ArrayList<Integer> listaA = new ArrayList<>();        
        System.out.println("Ingresa los Datos de A:");
        for (int i = 0; i < cantidadA; i++) {
            listaA.add(entrada.nextInt());        }

        System.out.print("Cantidad de Datos de B: ");
        int cantidadB = entrada.nextInt();
        ArrayList<Integer> listaB = new ArrayList<>();
        
        System.out.println("Ingresa los Datos de B:");
        for (int i = 0; i < cantidadB; i++) {
            listaB.add(entrada.nextInt());
        }

        ArrayList<Integer> interseccion = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> afuera = new ArrayList<>();
        ArrayList<Integer> diferencia = new ArrayList<>(); 

        // 
        for (int i = 0; i < cantidadTotal; i++) {
            int numero = listaTotal.get(i); 
            boolean perteneceA = listaA.contains(numero);
            boolean perteneceB = listaB.contains(numero);
            // Si está en A o en B  Unión
            if (perteneceA || perteneceB) {
                union.add(numero);            }
           
         // Si está en A y también en B Intersección
            if (perteneceA && perteneceB) {
                interseccion.add(numero);
            }          // Si no está ni en A ni en B Afuera
            if (!perteneceA && !perteneceB) {
                afuera.add(numero);
            }         
            // Si NO es una intersección 
            if (!(perteneceA && perteneceB)) {
                diferencia.add(numero);
            }
        }      
        System.out.println("Datos de A:           " + listaA);
        System.out.println("Datos de B:           " + listaB);
        System.out.println("Interseccion:         " + interseccion);
        System.out.println("Fuera de los circulos:" + afuera);  
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("P (A U B)             " + ((double) union.size() / cantidadTotal * 100) + "%");
        System.out.println("P (A N B)             " + ((double) interseccion.size() / cantidadTotal * 100) + "%");
        System.out.println("P (A)                 " + ((double) listaA.size() / cantidadTotal * 100) + "%");
        System.out.println("P (B)                 " + ((double) listaB.size() / cantidadTotal * 100) + "%");
        System.out.println("P (A U B negado)      " + ((double) afuera.size() / cantidadTotal * 100) + "%");
        System.out.println("P (A N B negados)     " + ((double) diferencia.size() / cantidadTotal * 100) + "%");
    }
}
    
    
    

