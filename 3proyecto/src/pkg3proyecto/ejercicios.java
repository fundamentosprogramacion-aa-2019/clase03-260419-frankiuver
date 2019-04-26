/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3proyecto;
import paquete3.Demo;
import paquete4.Demo2;
/**
 *
 * @author JOSE
 */
public class ejercicios {
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        int suma;
        int multiplicacion;

        suma = Demo.valor + Demo2.valorDos;
        multiplicacion = Demo.valor * Demo2.valorDos;
        System.out.printf("%d\n%d\n", suma, multiplicacion);

    }
}
