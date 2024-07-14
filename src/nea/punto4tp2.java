package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto4tp2 { // Declaración de la clase punto4tp2
    static int A; // Variable estática para almacenar el valor ingresado por el usuario
    static Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario

    /**
     * Método para verificar si el número ingresado es primo.
     */
    public static void esPrimo() {
        System.out.println("Ingrese un valor: ");
        A = scanner.nextInt(); // Leer y almacenar el valor ingresado por el usuario

        // Verificar si el número es mayor que 1 y no es divisible por 2, 3 o 5
        if ((A > 1 && A != 2 && A != 3 && A != 5) && (A % 2 == 0 || A % 3 == 0 || A % 5 == 0)) {
            System.out.println("El número " + A + " no es primo");
        } else {
            System.out.println("El número " + A + " es primo");
        }
    }

    public static void main(String[] args) {
        esPrimo(); // Llamar al método para verificar si el número ingresado es primo
        scanner.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}

