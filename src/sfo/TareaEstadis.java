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
public class TareaEstadis {
    public static void main(String[] args) {
    Scanner lectorDatos = new Scanner(System.in);


    
        System.out.print("Cantidad de Datos Totales: ");
        int cantGlobal = lectorDatos.nextInt();
        int[] arregloGlobal = new int[cantGlobal];
        System.out.println("Ingresa los Datos Totales:");
        for (int i = 0; i < cantGlobal; i++) {
            arregloGlobal[i] = lectorDatos.nextInt();
        }
        System.out.print("Cantidad de Datos de A: ");
        int cantA = lectorDatos.nextInt();
        int[] elementosA = new int[cantA];
       System.out.println("Ingresa los Datos de A:");
        for (int i = 0; i < cantA; i++) {
            elementosA[i] = lectorDatos.nextInt();
        }
        System.out.print("Cantidad de Datos de B: ");
        int cantB = lectorDatos.nextInt();
        int[] elementosB = new int[cantB];
        System.out.println("Ingresa los Datos de B:");
        for (int i = 0; i < cantB; i++) {
            elementosB[i] = lectorDatos.nextInt();
        }
        String textoA = "";
        String textoB = "";
        String textoCruce = "";
        String textoExterior = "";

        int valorUnion = 0;
        int valorCruce = 0;
        int valorA = 0;
        int valorB = 0;
        int valorAfuera = 0;
        int valorDiferentes = 0;

        for (int i = 0; i < cantGlobal; i++) {
            int numeroViendo = arregloGlobal[i];
            
            boolean enA = false;
            boolean enB = false;
            for (int a = 0; a < cantA; a++) {
                if (elementosA[a] == numeroViendo) {
                    enA = true;
                }
            }
            for (int b = 0; b < cantB; b++) {
                if (elementosB[b] == numeroViendo) {
                    enB = true;
                }
            }
            if (enA == true) {
                valorA = valorA + 1;
                textoA = textoA + numeroViendo + " ";
            }
            if (enB == true) {
                valorB = valorB + 1;
                textoB = textoB + numeroViendo + " ";
            }
            if (enA == true) {
                valorUnion = valorUnion + 1;
            } else {
                if (enB == true) {
                    valorUnion = valorUnion + 1;
                }
            }
            if (enA == true) {
                if (enB == true) {
                    valorCruce = valorCruce + 1;
                    textoCruce = textoCruce + numeroViendo + " ";
                }
            }
            if (enA == false) {
                if (enB == false) {
                    valorAfuera = valorAfuera + 1;
                    textoExterior = textoExterior + numeroViendo + " ";
                }
            }
            boolean esCruce = false;
            if (enA == true) {
                if (enB == true) {
                    esCruce = true;
                }
            }
            if (esCruce == false) {
                valorDiferentes = valorDiferentes + 1;
            }
        }
        System.out.println("--- Valores de A y B  ---");
        
        String muestraA = "Datos de A: [";
        muestraA = muestraA + textoA;
        muestraA = muestraA + "]";
        System.out.println(muestraA);

        String muestraB = "Datos de B: [";
        muestraB = muestraB + textoB;
        muestraB = muestraB + "]";
        System.out.println(muestraB);

        String muestraCruce = "Interseccion: [";
        muestraCruce = muestraCruce + textoCruce;
        muestraCruce = muestraCruce + "]";
        System.out.println(muestraCruce);

        String muestraFuera = "Fuera de los circulos: [";
        muestraFuera = muestraFuera + textoExterior;
        muestraFuera = muestraFuera + "]";
        System.out.println(muestraFuera);
     double calcUnion = valorUnion;
        calcUnion = calcUnion / cantGlobal;
        
        double calcCruce = valorCruce;
        calcCruce = calcCruce / cantGlobal;
        
        double calcA = valorA;
        calcA = calcA / cantGlobal;
        
        double calcB = valorB;
        calcB = calcB / cantGlobal;
        
       double calcAfuera = valorAfuera;
        calcAfuera = calcAfuera / cantGlobal;
        
       double calcDif = valorDiferentes;
        calcDif = calcDif / cantGlobal;
        
        System.out.println("");
        System.out.println("--- RESULTADOS ---");
        String linea1 = "P (A U B)             ";
        linea1 = linea1 + calcUnion;
        linea1 = linea1 + "%";
        System.out.println(linea1);
        String linea2 = "P (A N B)             ";
        linea2 = linea2 + calcCruce;
        linea2 = linea2 + "%";
        System.out.println(linea2);

        
        String linea3 = "P (A)                 ";
        linea3 = linea3 + calcA;
        linea3 = linea3 + "%";
        System.out.println(linea3);

        
        String linea4 = "P (B)                 ";
        linea4 = linea4 + calcB;
        linea4 = linea4 + "%";
        System.out.println(linea4);
        String linea5 = "P (A U B )      ";
        linea5 = linea5 + calcAfuera;
        linea5 = linea5 + "%";
        System.out.println(linea5);
        String linea6 = "P (A N B)     ";
        linea6 = linea6 + calcDif;
        linea6 = linea6 + "%";
        System.out.println(linea6);
    }
    
}
