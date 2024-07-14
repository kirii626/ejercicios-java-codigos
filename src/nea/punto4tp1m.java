package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto4tp1m { // Declaración de la clase punto4tp1m
    public static void main(String[] args) { // Método principal main
        Scanner dato1 = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario (nombre)
        Scanner dato2 = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario (DNI)

        // Solicitar al usuario que ingrese su nombre
        System.out.println("Ingrese su nombre: ");
        String nombre = dato1.nextLine(); // Leer y almacenar el nombre ingresado por el usuario

        // Solicitar al usuario que ingrese su DNI
        System.out.println("Ingrese su DNI: ");
        String dni = dato2.nextLine(); // Leer y almacenar el DNI ingresado por el usuario

        // Mostrar los datos ingresados por el usuario
        System.out.println("Los datos guardados son:");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }
}
