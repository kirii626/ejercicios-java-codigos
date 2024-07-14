package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto1tp2 {
    
    static int Numero; // Declaración de la variable estática Numero
    static Scanner scanner = new Scanner(System.in); // Creación de un objeto Scanner para leer desde la entrada estándar
    
    /**
     * Método para obtener el resultado de FizzBuzz.
     */
    public static void obtener_fizzbuzz() {
        System.out.println("Ingrese un valor: "); // Solicitar al usuario que ingrese un valor
        Numero = scanner.nextInt(); // Leer y almacenar el valor ingresado
        
        // Evaluar las condiciones para FizzBuzz
        if (Numero % 3 == 0 && Numero % 5 == 0) {
            System.out.println("FizzBuzz"); // Si es divisible por 3 y por 5, imprimir "FizzBuzz"
        } else if (Numero % 3 == 0) {
            System.out.println("Fizz"); // Si es divisible solo por 3, imprimir "Fizz"
        } else if (Numero % 5 == 0) {
            System.out.println("Buzz"); // Si es divisible solo por 5, imprimir "Buzz"
        } else {
            System.out.println("El número introducido es " + Numero); // Si no cumple ninguna condición, imprimir el número
        }
    }
    
    public static void main(String[] args) {
        obtener_fizzbuzz(); // Llamar al método obtener_fizzbuzz() para ejecutar la lógica del j
    }
}
