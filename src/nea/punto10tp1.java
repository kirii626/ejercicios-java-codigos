package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto10tp1 para clasificar temperaturas según rangos específicos.
 */
public class punto10tp1 {
   
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        System.out.println("Ingrese una temperatura: "); // Solicitar al usuario que ingrese una temperatura
        int temperatura = temp.nextInt(); // Leer y almacenar la temperatura ingresada
        
        // Utilizar estructuras condicionales para clasificar la temperatura en categorías
        if (temperatura <= 10) {
            System.out.println("La temperatura es fria"); // Temperatura menor o igual a 10
        } else if (temperatura > 10 && temperatura < 20) {
            System.out.println("La temperatura es nublada"); // Temperatura mayor que 10 y menor que 20
        } else if (temperatura >= 20 && temperatura < 30) {
            System.out.println("La temperatura es calurosa"); // Temperatura mayor o igual a 20 y menor que 30
        } else if (temperatura >= 30) {
            System.out.println("La temperatura es tropical"); // Temperatura mayor o igual a 30
        }
        
        temp.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
