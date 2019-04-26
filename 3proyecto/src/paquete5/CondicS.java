/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
import paquete2.miMensaje;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class CondicS {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int calificacion, calificacion_2;

        System.out.println("Ingrese la primera calificación");
        calificacion = entrada.nextInt();
        System.out.println("Ingrese la segunda calificación");
        calificacion_2 = entrada.nextInt();

        String mensaje = miMensaje.mensajeUno;
        if (calificacion >= 85) {
            System.out.printf("%s con %d puntos\n", mensaje, calificacion);
        }

        if (calificacion_2 >= 85) {
            System.out.printf("%s con %d puntos\n", mensaje, calificacion_2);

        }
    }
}
