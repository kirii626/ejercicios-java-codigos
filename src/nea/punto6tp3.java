package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto6tp3 para convertir pesos argentinos a dólares estadounidenses.
 */
public class punto6tp3 {
    
    static Scanner leer = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    static int valor; // Variable para almacenar la cantidad de pesos ingresada por el usuario
    
    /**
     * Método para realizar la conversión de pesos a dólares.
     */
    public static void Conversion() {
        System.out.println("Ingrese cantidad de pesos: "); // Solicitar al usuario que ingrese la cantidad de pesos
        valor = leer.nextInt(); // Leer la cantidad de pesos ingresada por el usuario
        
        double dolares = valor / 218.41; // Calcular la cantidad equivalente en dólares, asumiendo un tipo de cambio fijo
        System.out.println("El valor de pesos en dolares es: " + dolares); // Mostrar el resultado de la conversión
    }
    
    /**
     * Método principal main para ejecutar el programa.
     */
    public static void main(String[] args) {
        Conversion(); // Llamar al método Conversion para realizar la conversión de pesos a dólares
    }
}
