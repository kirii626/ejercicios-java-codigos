package nea;
import java.util.Scanner;

public class punto8tp4 {
    static Scanner numero = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario
    static int a, b, operacion; // Variables estáticas para almacenar valores de A, B y el resultado de la operación

    // Método para realizar las operaciones según los valores de A y B
    public static void numeritos() {
        System.out.println("Ingrese valor de A"); // Solicita al usuario ingresar el valor de A
        a = numero.nextInt(); // Lee el valor ingresado para A

        System.out.println("Ingrese valor de B"); // Solicita al usuario ingresar el valor de B
        b = numero.nextInt(); // Lee el valor ingresado para B

        if (a > b) { // Si A es mayor que B
            operacion = a * b; // Realiza la multiplicación de A por B
            System.out.println("El resultado es " + operacion); // Muestra el resultado de la multiplicación
        } else if (a < b) { // Si B es mayor que A
            operacion = b - a; // Realiza la resta de B menos A
            System.out.println("El resultado es " + operacion); // Muestra el resultado de la resta
        } else { // Si A y B son iguales
            operacion = a + b; // Realiza la suma de A y B
            System.out.println("El resultado es " + operacion); // Muestra el resultado de la suma
        }
    }

    // Método principal que llama al método numeritos para ejecutar las operaciones
    public static void main(String[] args) {
        numeritos(); // Llama al método numeritos para realizar las operaciones con A y B
    }
}
