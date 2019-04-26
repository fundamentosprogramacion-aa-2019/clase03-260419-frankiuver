/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
import java.util.Scanner;
import paquete2.miMensaje2;

/**
 *
 * @author JOSE
 */
public class CondAnid {
    public static void main(String[] args) {
        // documentacion
        String mensaje = miMensaje2.mensaje;
        String mensajeUno = miMensaje2.mensajeUno;
        String mensajeDos = miMensaje2.mensajeDos;
        String mensajeTres = miMensaje2.mensajeTres;
        String mensajeReprobatorio = miMensaje2.mensajeReprobatorio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su calificación");
        int calificacion = entrada.nextInt();

        if (calificacion >= 90) {
            System.out.printf("%s %s con %d\n", mensaje, mensajeUno,
                    calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s %s con %d\n", mensaje, mensajeDos,
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s %s con %d\n", mensaje, mensajeTres,
                            calificacion);

                } else {
                    System.out.printf("%s con %d\n", mensajeReprobatorio,
                            calificacion);
                }
            }
        }
    }
    
}
