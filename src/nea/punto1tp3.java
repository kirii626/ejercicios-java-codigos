package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto1tp3 para realizar operaciones simples según el valor ingresado por el usuario.
 */
public class punto1tp3 {
    
    static float numero; // Declaración de la variable estática 'numero' de tipo float
    static Scanner in = new Scanner(System.in); // Creación de un objeto Scanner para leer desde la entrada estándar
    
    /**
     * Método para realizar operaciones según el valor ingresado.
     */
    public static void operaciones() {
        System.out.println("Ingrese un valor: "); // Solicitar al usuario que ingrese un valor
        numero = in.nextFloat(); // Leer y almacenar el valor ingresado como float
        
        // Evaluar condiciones basadas en el valor ingresado
        if (numero < -5 || numero > 30) {
            float operacion = numero + 100; // Realizar la operación especificada si se cumple la condición
            System.out.println("El resultado es: " + operacion); // Mostrar el resultado de la operación
        } else if (numero > -5 || numero < 30) {
            float operacion = numero - 50; // Realizar la operación alternativa si se cumple la condición
            System.out.println("El resultado es: " + operacion); // Mostrar el resultado de la operación
        }
    }
    
    public static void main(String[] args) {
        operaciones(); // Llamar al método operaciones() para ejecutar las operaciones según el valor ingresado
        in.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
