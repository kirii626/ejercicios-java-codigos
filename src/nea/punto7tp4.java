package nea;

import java.util.Scanner;

public class punto7tp4 {
    static Scanner leer = new Scanner(System.in);
    static int producto = 1; // Variable para almacenar el producto inicializada en 1
    static double cociente; // Variable para almacenar el cociente

    public static void calculos() {
        int numero = 1; // Variable para almacenar el producto inicializada en 1
        for (int i = 0; i < 2; i++) { // Bucle para iterar dos veces
            System.out.print("Ingrese un número: ");
            int valor = leer.nextInt(); // Leer número ingresado por el usuario
            numero *= valor; // Calcular el producto de los números ingresados
            producto *= valor; // Calcular el producto acumulado de los números ingresados
        }
        cociente = (double) numero / producto; // Calcular el cociente como un número decimal
        System.out.println("El producto es: " + producto); // Mostrar el producto acumulado
        System.out.println("El cociente es: " + cociente); // Mostrar el cociente
    }

    public static void main(String[] args) {
        calculos(); // Llamar al método calculos para realizar los cálculos
    }
}
