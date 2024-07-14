package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto11tp1 para mostrar el nombre de un mes basado en su número.
 */
public class punto11tp1 {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        // Solicitar al usuario que ingrese un mes en valor numérico
        System.out.println("Ingrese el mes en valor numérico (por ejemplo, agosto = 8): ");
        int mes = num.nextInt(); // Leer y almacenar el número de mes ingresado
        
        // Estructura switch para mostrar el nombre del mes basado en el número ingresado
        switch (mes) {
            case 1:
                System.out.println("El mes ingresado fue Enero");
                break;
            case 2:
                System.out.println("El mes ingresado fue Febrero");
                break;
            case 3:
                System.out.println("El mes ingresado fue Marzo");
                break;
            case 4:
                System.out.println("El mes ingresado fue Abril");
                break;
            case 5:
                System.out.println("El mes ingresado fue Mayo");
                break;
            case 6:
                System.out.println("El mes ingresado fue Junio");
                break;
            case 7:
                System.out.println("El mes ingresado fue Julio");
                break;
            case 8:
                System.out.println("El mes ingresado fue Agosto");
                break;
            case 9:
                System.out.println("El mes ingresado fue Septiembre");
                break;
            case 10:
                System.out.println("El mes ingresado fue Octubre");
                break;
            case 11:
                System.out.println("El mes ingresado fue Noviembre");
                break;
            case 12:
                System.out.println("El mes ingresado fue Diciembre");
                break;
            default:
                System.out.println("Número de mes no válido"); // Mensaje por defecto si el número no está entre 1 y 12
                break;
        }
        
        num.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
    
}
