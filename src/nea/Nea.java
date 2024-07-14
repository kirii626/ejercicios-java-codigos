package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class Nea {

    public static void main(String[] args) {
       
        int Res; // Variable para almacenar la respuesta de la operación seleccionada
        int num1; // Variable para almacenar el primer número ingresado
        int num2; // Variable para almacenar el segundo número ingresado
        
        Scanner Leer = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        num1 = Leer.nextInt(); // Leer el primer número ingresado por el usuario
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        num2 = Leer.nextInt(); // Leer el segundo número ingresado por el usuario
        
        // Solicitar al usuario que ingrese la operación deseada
        System.out.println("Ingrese la operación que necesita:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. División");
        System.out.println("4. Multiplicación");
        Res = Leer.nextInt(); // Leer la operación seleccionada por el usuario
        
        // Evaluar la respuesta y realizar la operación correspondiente
        if (Res == 1) {
            System.out.println("Suma: " + (num1 + num2)); // Mostrar el resultado de la suma
        } else if (Res == 2) {
            System.out.println("Resta: " + (num1 - num2)); // Mostrar el resultado de la resta
        } else if (Res == 3) {
            System.out.println("División: " + (num1 / num2)); // Mostrar el resultado de la división
        } else if (Res == 4) {
            System.out.println("Multiplicación: " + (num1 * num2)); // Mostrar el resultado de la multiplicación
        } else {
            System.out.println("Opción no válida"); // Mostrar un mensaje si la respuesta no es válida
        }
        
        Leer.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
