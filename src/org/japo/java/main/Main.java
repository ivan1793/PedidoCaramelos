/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

/**
 *
 * @author CicloM
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables y constantes
        int unidades;
        double precio_unidad_suelta=0.07;
        int bolsa=100;
        int precio_bolsa=5;
        //scanner  
        Scanner scn = new Scanner(System.in,"ISO-8859-1");
        
        try{
           
            System.out.print("¿Cuantos caramelos quieres?..:");
        //algoritmos    
            unidades = scn.nextInt();
            int completa = unidades/bolsa;
            int sueltos=unidades-completa*bolsa;
            double importe_bolsas=precio_bolsa*completa;
            double importe_suelto=precio_unidad_suelta*sueltos;
            double importe_previo=importe_bolsas+importe_suelto;
            double iva=importe_previo*21/100;    
            double importe_pvp=importe_previo+iva;
            
            System.out.printf("¿Cuantos caramelos?: %d\n",unidades);
            System.out.printf("Eso son bolsas completas: %d\n", completa);
            System.out.printf("Y hay caramelos sueltos :%d\n",sueltos);
            System.out.printf("El precio de las bolsas :%.2f\n",importe_bolsas);
            System.out.printf("El precio de los caramelos sueltos :%.2f\n",importe_suelto);
            System.out.printf("Importe previo: %.2f\n",importe_previo);
            System.out.printf("IVA 21: %.2f\n",iva);
            System.out.printf("IMPORTE PVP: %.2f\n",importe_pvp);
         
        }
        catch (Exception e)  
        { System.out.print("Error de entrada");
            
        }
        
        
             
    }
    
}
