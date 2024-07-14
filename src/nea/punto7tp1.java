package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto7tp1 para verificar nombre de usuario y contraseña.
 */
public class punto7tp1 {
    
    /**
     * Método principal main para ejecutar el programa.
     */
    public static void main(String[] args) {
        Scanner nom = new Scanner(System.in); // Crear un objeto Scanner para leer el nombre de usuario
        Scanner cont = new Scanner(System.in); // Crear otro objeto Scanner para leer la contraseña
        System.out.println("Ingrese su nombre de usuario: "); // Solicitar al usuario que ingrese su nombre de usuario
        String usuario = nom.nextLine(); // Leer y almacenar el nombre de usuario ingresado por el usuario
        System.out.println("Ingrese contraseña numerica: "); // Solicitar al usuario que ingrese la contraseña numérica
        int uscont = cont.nextInt(); // Leer y almacenar la contraseña ingresada por el usuario
        
        // Definir los valores predefinidos para el nombre de usuario y la contraseña
        String nombre = "pepito";
        int contraseña = 205618;
        
        // Verificar si el nombre de usuario y la contraseña ingresados coinciden con los predefinidos
        if (usuario.equals(nombre) && contraseña == uscont) {
            System.out.println("Bienvenido al Sistema"); // Mostrar mensaje de bienvenida si coinciden
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos"); // Mostrar mensaje de error si no coinciden
        }
    }
}
