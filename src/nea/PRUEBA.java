package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase PRUEBA que evalúa la nota académica ingresada por el usuario y muestra un mensaje según su valor.
 */
public class PRUEBA {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        System.out.println("Ingrese su nota académica:"); // Solicitar al usuario que ingrese su nota académica
        int nota = num.nextInt(); // Leer y almacenar la nota académica ingresada por el usuario
        
        // Evaluar la nota e imprimir un mensaje según su valor
        if (nota > 0 && nota < 5) {
            System.out.println("La nota es insuficiente"); // Mostrar mensaje si la nota está entre 0 y 4 (no inclusivo)
        } else if (nota == 5) {
            System.out.println("La nota no es suficiente"); // Mostrar mensaje si la nota es exactamente 5
        } else if (nota == 6) {
            System.out.println("La nota es suficiente"); // Mostrar mensaje si la nota es exactamente 6
        } else if (nota == 7 || nota == 8) {
            System.out.println("La nota es notable"); // Mostrar mensaje si la nota es 7 u 8
        } else if (nota == 9 || nota == 10) {
            System.out.println("La nota es sobresaliente"); // Mostrar mensaje si la nota es 9 o 10
        }
        
        num.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }  
}

