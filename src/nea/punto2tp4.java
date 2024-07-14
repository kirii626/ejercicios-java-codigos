package nea;

import java.util.Scanner;

public class punto2tp4 {
    static Scanner numero = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario
    static int notas, prom; // Variables estáticas para almacenar las notas y el promedio
    static double rdo; // Variable estática para almacenar el resultado del promedio

    /**
     * Método para ingresar y calcular el promedio de cuatro notas.
     */
    public static void notas() {
        int i;
        for (i = 0; i < 4; i++) { // Ciclo para ingresar las cuatro notas
            System.out.println("Ingrese nota: ");
            notas = numero.nextInt(); // Leer y almacenar cada nota ingresada
            prom = prom + notas; // Sumar las notas para calcular el promedio
        }
        rdo = prom / 4.0; // Calcular el promedio como un número decimal
    }

    /**
     * Método para determinar el criterio según el promedio calculado.
     */
    public static void criterios() {
        if (rdo >= 7) {
            System.out.println("APROBADO"); // Si el promedio es mayor o igual a 7, mostrar "APROBADO"
        } else if (rdo >= 4 && rdo < 7) {
            System.out.println("DICIEMBRE"); // Si el promedio está entre 4 y 7 (no inclusivo), mostrar "DICIEMBRE"
        } else if (rdo < 4) {
            System.out.println("MARZO"); // Si el promedio es menor a 4, mostrar "MARZO"
        }
    }

    public static void main(String[] args) {
        notas(); // Llamar al método para ingresar y calcular las notas
        criterios(); // Llamar al método para determinar el criterio según el promedio
        numero.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
