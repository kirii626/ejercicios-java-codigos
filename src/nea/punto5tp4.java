package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto5tp4 { // Declaración de la clase punto5tp4
    static Scanner numero = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario
    static int muj, var; // Variables para almacenar la cantidad de mujeres y varones
    
    public static void porcentajito() { // Método para calcular el porcentaje
        System.out.println("Ingrese cantidad de mujeres que hay: ");
        muj = numero.nextInt(); // Leer la cantidad de mujeres ingresada por el usuario
        System.out.println("Ingrese cantidad de varones que hay: ");
        var = numero.nextInt(); // Leer la cantidad de varones ingresada por el usuario
        
        int alumnos = muj + var; // Calcular el total de alumnos sumando mujeres y varones
        
        // Calcular el porcentaje de mujeres y varones
        double porcentaje_m = (muj * 100.0) / alumnos;
        double porcentaje_v = (var * 100.0) / alumnos;
        
        // Mostrar los porcentajes calculados
        System.out.println("El porcentaje de mujeres es: " + porcentaje_m + "%");
        System.out.println("El porcentaje de varones es: " + porcentaje_v + "%");
    }
    
    public static void main(String[] args) { // Método principal main
        porcentajito(); // Llamar al método porcentajito para calcular y mostrar los porcentajes
    }
}
