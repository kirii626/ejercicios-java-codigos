package nea;

import java.util.Scanner;

public class punto8tp1m {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        System.out.println("Ingrese su nota académica:");
        int nota = num.nextInt(); // Leer la nota ingresada por el usuario

        // Evaluar la nota y mostrar el mensaje correspondiente
        if (nota > 0 && nota < 5) {
            System.out.println("La nota es insuficiente");
        } else if (nota == 5) {
            System.out.println("La nota no es suficiente");
        } else if (nota == 6) {
            System.out.println("La nota es suficiente");
        } else if (nota == 7 || nota == 8) {
            System.out.println("La nota es notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("La nota es sobresaliente");
        } else {
            System.out.println("Nota inválida. Debe ser un número entre 0 y 10.");
        }
    }
}
