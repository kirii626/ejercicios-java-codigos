package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto5tp1 { // Declaración de la clase punto5tp1
    public static void main(String[] args) { // Método principal main
        Scanner num1 = new Scanner(System.in); // Objeto Scanner para leer el primer número
        Scanner num2 = new Scanner(System.in); // Objeto Scanner para leer el segundo número
        
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese el primer numero: ");
        int numuno = num1.nextInt(); // Leer y almacenar el primer número ingresado
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese segundo numero: ");
        int numdos = num2.nextInt(); // Leer y almacenar el segundo número ingresado
        
        // Comparar los dos números ingresados y mostrar el resultado
        if (numuno > numdos) {
            System.out.println(numuno + " ES MAYOR");
        } else if (numuno < numdos) {
            System.out.println(numdos + " ES MAYOR");
        } else {
            System.out.println("SON IGUALES");
        }
        
        num1.close(); // Cerrar el objeto Scanner num1 para liberar recursos
        num2.close(); // Cerrar el objeto Scanner num2 para liberar recursos
    }
}
