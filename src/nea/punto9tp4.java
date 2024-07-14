package nea;
import java.util.Scanner;

public class punto9tp4 {
    // Método para ordenar tres números de mayor a menor
    public static void ordenamiento() {
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario

        // Solicitar al usuario ingresar los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt(); // Leer el primer número
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt(); // Leer el segundo número
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt(); // Leer el tercer número

        // Comparaciones y reordenamiento de los números
        if (num1 < num2) { // Si el primer número es menor que el segundo
            int temp = num1; // Almacenar el valor de num1 en una variable temporal
            num1 = num2; // Asignar el valor de num2 a num1
            num2 = temp; // Asignar el valor almacenado en la variable temporal a num2
        }
        if (num1 < num3) { // Si el primer número es menor que el tercer número
            int temp = num1; // Almacenar el valor de num1 en una variable temporal
            num1 = num3; // Asignar el valor de num3 a num1
            num3 = temp; // Asignar el valor almacenado en la variable temporal a num3
        }
        if (num2 < num3) { // Si el segundo número es menor que el tercer número
            int temp = num2; // Almacenar el valor de num2 en una variable temporal
            num2 = num3; // Asignar el valor de num3 a num2
            num3 = temp; // Asignar el valor almacenado en la variable temporal a num3
        }

        // Mostrar los números ordenados de mayor a menor
        System.out.println("Los números ordenados de mayor a menor son: " + num1 + ", " + num2 + ", " + num3);
    }

    // Método principal que llama al método ordenamiento para ejecutar el programa
    public static void main(String[] args) {
        ordenamiento(); // Llamar al método ordenamiento para ordenar los números ingresados por el usuario
    }
}
