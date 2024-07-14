package nea;
import java.util.Scanner;

public class punto8tp3 {
    static Scanner leer = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario
    static int valor; // Variable para almacenar la cantidad de pulgadas

    // Método para realizar la conversión de pulgadas a centímetros
    public static void Conversion() {
        System.out.println("Ingrese cantidad de pulgadas"); // Solicita al usuario ingresar las pulgadas
        valor = leer.nextInt(); // Lee el valor ingresado por el usuario
        double cm = valor * 2.54; // Calcula los centímetros equivalentes
        System.out.println("El resultado en cm es " + cm); // Muestra el resultado de la conversión
    }

    // Método principal que llama al método de conversión
    public static void main(String[] args) {
        Conversion(); // Llama al método Conversion para ejecutar la conversión de pulgadas a centímetros
    }
}

