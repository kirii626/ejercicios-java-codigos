package nea;

import java.util.Scanner;

public class punto2tp3 {
    static float numero; // Variable estática para almacenar el número ingresado
    static Scanner in = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario
    
    /**
     * Método para realizar operaciones según el valor ingresado.
     */
    public static void operaciones() {
        System.out.println("Ingrese un valor: "); // Solicitar al usuario que ingrese un valor
        numero = in.nextFloat(); // Leer y almacenar el número ingresado por el usuario
        
        if (numero < -5 || numero > 30) { // Verificar si el número está fuera del rango [-5, 30]
            float operacion = numero * (-10); // Calcular el resultado multiplicando por -10
            System.out.println("El resultado es: " + operacion); // Mostrar el resultado calculado
        } else { // Si el número está dentro del rango [-5, 30]
            System.out.println("El número original fue: " + numero); // Mostrar el número original
        }
    }
    
    public static void main(String[] args) {
        operaciones(); // Llamar al método operaciones() para realizar las operaciones necesarias
        in.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
