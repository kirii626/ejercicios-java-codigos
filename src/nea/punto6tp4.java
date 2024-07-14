package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto6tp4 para realizar operaciones con dos números ingresados por el usuario.
 */
public class punto6tp4 {
    
    static Scanner numero = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    static int a, b; // Variables para almacenar los valores ingresados por el usuario
    
    /**
     * Método para realizar operaciones con los valores ingresados.
     */
    public static void numeritos() {
        System.out.println("Ingrese valor de A: "); // Solicitar al usuario que ingrese el valor de A
        a = numero.nextInt(); // Leer y almacenar el valor de A ingresado por el usuario
        
        System.out.println("Ingrese valor de B: "); // Solicitar al usuario que ingrese el valor de B
        b = numero.nextInt(); // Leer y almacenar el valor de B ingresado por el usuario
        
        int num_a = a * 10; // Multiplicar el valor de A por 10 y almacenarlo en num_a
        int num_b = b + 30; // Sumar 30 al valor de B y almacenarlo en num_b
        
        if (num_a > num_b) {
            int operacion = num_a * num_b; // Calcular el producto de num_a y num_b
            // Mostrar resultados en la consola
            System.out.println("El número de A fue " + a + " y su resultado es " + num_a);
            System.out.println("El número de B fue " + b + " y su resultado es " + num_b);
            System.out.println("El resultado del producto es " + operacion);
        } else if (num_a < num_b) {
            int operacion = num_a + num_b; // Calcular la suma de num_a y num_b
            // Mostrar resultados en la consola
            System.out.println("El número de A fue " + a + " y su resultado es " + num_a);
            System.out.println("El número de B fue " + b + " y su resultado es " + num_b);
            System.out.println("El resultado de la suma es " + operacion);
        }
    }
    
    /**
     * Método principal main para ejecutar el programa.
     */
    public static void main(String[] args) {
        numeritos(); // Llamar al método numeritos para realizar las operaciones con los números ingresados
    }
}

