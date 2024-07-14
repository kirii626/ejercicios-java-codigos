package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto6tp1m para realizar operaciones matemáticas básicas entre dos números ingresados por el usuario.
 */
public class punto6tp1m {
    
    public static void main(String[] args) { // Método principal main
        Scanner num1 = new Scanner(System.in); // Objeto Scanner para leer el primer número
        Scanner num2 = new Scanner(System.in); // Objeto Scanner para leer el segundo número
        Scanner dato = new Scanner(System.in); // Objeto Scanner para leer la opción de operación
        
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese un numero: ");
        int numuno = num1.nextInt(); // Leer el primer número ingresado por el usuario
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese otro numero: ");
        int numdos = num2.nextInt(); // Leer el segundo número ingresado por el usuario
        
        // Mostrar las opciones de operaciones disponibles
        System.out.println("Ingrese la operacion que quiere realizar:");
        System.out.println("1 para SUMA, 2 para RESTA, 3 para MULTIPLICACION, y 4 para DIVISION");
        int operacion = dato.nextInt(); // Leer la opción de operación ingresada por el usuario
        
        // Evaluar la opción de operación seleccionada por el usuario y realizar la operación correspondiente
        switch (operacion) {
            case 1:
                System.out.println("El resultado de la SUMA es: " + (numuno + numdos));
                break;
            case 2:
                System.out.println("El resultado de la RESTA es: " + (numuno - numdos));
                break;
            case 3:
                System.out.println("El resultado de la MULTIPLICACION es: " + (numuno * numdos));
                break;
            case 4:
                // Verificar que el divisor no sea cero para evitar división por cero
                if (numdos != 0) {
                    System.out.println("El resultado de la DIVISION es: " + (numuno / numdos));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción de operación no válida.");
                break;
        }
    }
}
