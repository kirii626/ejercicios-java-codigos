package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto3tp2 { // Declaración de la clase punto3tp2
    static int A, B; // Variables estáticas para almacenar los valores de A y B
    static Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario

    /**
     * Método para verificar si A es divisible por B.
     */
    public static void esDivisible() {
        System.out.println("Ingrese valor A: ");
        A = scanner.nextInt(); // Leer y almacenar el valor de A ingresado por el usuario
        System.out.println("Ingrese valor B: ");
        B = scanner.nextInt(); // Leer y almacenar el valor de B ingresado por el usuario

        if (A % B == 0) { // Verificar si A es divisible por B
            System.out.println("El número " + A + " es divisible por " + B); // Mostrar mensaje si es divisible
        } else {
            System.out.println("El número " + A + " no es divisible por " + B); // Mostrar mensaje si no es divisible
        }
    }

    public static void main(String[] args) {
        esDivisible(); // Llamar al método para verificar si A es divisible por B
    }
}
