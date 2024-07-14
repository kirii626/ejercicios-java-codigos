package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class for_nombres {
    static Scanner leer = new Scanner(System.in); // Objeto Scanner para leer desde la entrada estándar
    static String nombre; // Variable estática para almacenar el nombre ingresado por el usuario
    
    // Método para imprimir una secuencia de números del 0 al 10 junto con el nombre
    public static void ciclo_posi() {
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine(); // Leer y almacenar el nombre ingresado por el usuario
        
        // Bucle 'for' que imprime el nombre seguido de números del 0 al 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(nombre + ", " + i);
        }
    }
    
    // Método para imprimir una secuencia de números del 10 al 0 junto con el nombre
    public static void ciclo_neg() {
        // Bucle 'for' que imprime el nombre seguido de números del 10 al 0
        for (int j = 10; j >= 0; j--) {
            System.out.println(nombre + ", " + j);
        }
    }
    
    public static void main(String[] args) {
        ciclo_posi(); // Llamar al método ciclo_posi() para imprimir la secuencia del 0 al 10
        ciclo_neg(); // Llamar al método ciclo_neg() para imprimir la secuencia del 10 al 0
    }
}
