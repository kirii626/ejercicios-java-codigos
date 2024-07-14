package Nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto3tp1 { // Declaración de la clase punto3tp1
    public static void main(String[] args) { // Método principal main
        Scanner num1 = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        Scanner num2 = new Scanner(System.in); // Otro objeto Scanner para leer la entrada del usuario

        // Solicitar al usuario que ingrese el valor de la base del triángulo
        System.out.println("Ingrese el valor de la base: ");
        int base = num1.nextInt(); // Leer y almacenar el valor de la base ingresado por el usuario

        // Solicitar al usuario que ingrese el valor de la altura del triángulo
        System.out.println("Ingrese valor de la altura del triángulo: ");
        int altura = num2.nextInt(); // Leer y almacenar el valor de la altura ingresado por el usuario

        int area = base * altura; // Calcular el área del triángulo (base * altura)
        System.out.println("El área del triángulo es: " + (area / 2)); // Mostrar el área calculada dividida por 2
    }
}
