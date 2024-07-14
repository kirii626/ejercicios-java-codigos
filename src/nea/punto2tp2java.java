package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto2tp2java para calcular el Índice de Masa Corporal (IMC).
 */
public class punto2tp2java {
    
    static float peso, altura; // Declaración de variables estáticas 'peso' y 'altura' de tipo float
    static Scanner scanner = new Scanner(System.in); // Creación de un objeto Scanner para leer desde la entrada estándar
    
    /**
     * Método para calcular el Índice de Masa Corporal (IMC).
     */
    public static void imc() {
        System.out.println("Ingrese el peso en kg: "); // Solicitar al usuario que ingrese el peso en kilogramos
        peso = scanner.nextFloat(); // Leer y almacenar el peso ingresado por el usuario
        
        System.out.println("Ingrese la altura en metros: "); // Solicitar al usuario que ingrese la altura en metros
        altura = scanner.nextFloat(); // Leer y almacenar la altura ingresada por el usuario
        
        // Calcular el Índice de Masa Corporal (IMC) utilizando la fórmula: IMC = peso / (altura * altura)
        float IMC = peso / (altura * altura);
        
        // Mostrar el resultado del cálculo del IMC
        System.out.println("El IMC de la persona es: " + IMC);
    }
    
    public static void main(String[] args) {
        imc(); // Llamar al método imc() para calcular el IMC
        scanner.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
