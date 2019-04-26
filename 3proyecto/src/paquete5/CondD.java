/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Scanner;
import paquete2.miMensaje;
/**
 *
 * @author JOSE
 */
public class CondD {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su calificación");
        int calificacion = entrada.nextInt();
        String mensaje = miMensaje.mensajeUno;
        String mensaje2 = miMensaje.mensajeDos;
        if (calificacion >= 80) {
            System.out.printf("Su %s es con: %d puntos\n", mensaje, calificacion);
        } else {
            System.out.printf("Su %s  es con: %d puntos\n", mensaje2, calificacion);
        }
    }

    
}
