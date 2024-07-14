package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto4tp4 { // Declaración de la clase punto4tp4
    static Scanner leer = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    static int lado1, lado2, lado3; // Variables estáticas para almacenar los lados del triángulo

    /**
     * Método para determinar el tipo de triángulo según los lados ingresados.
     */
    public static void numeritos() {
        System.out.println("Ingrese valor del primer lado: ");
        lado1 = leer.nextInt(); // Leer y almacenar el valor del primer lado del triángulo
        System.out.println("Ingrese valor del segundo lado: ");
        lado2 = leer.nextInt(); // Leer y almacenar el valor del segundo lado del triángulo
        System.out.println("Ingrese valor del tercer lado: ");
        lado3 = leer.nextInt(); // Leer y almacenar el valor del tercer lado del triángulo

        if (lado1 == lado2 && lado2 == lado3) { // Verificar si todos los lados son iguales
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) { // Verificar si al menos dos lados son iguales
            System.out.println("El triángulo es isósceles");
        } else { // Si todos los lados son diferentes
            System.out.println("El triángulo es escaleno");
        }
    }

    public static void main(String[] args) {
        numeritos(); // Llamar al método para determinar el tipo de triángulo según los lados ingresados
    }
}
