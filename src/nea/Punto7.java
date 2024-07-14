package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class Punto7 {
    public static void main(String[] angs) {
        Scanner Leer = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        // Solicitar al usuario que ingrese su nombre
        System.out.println("Ingrese el nombre: ");
        String Pelado = Leer.nextLine(); // Leer y almacenar el nombre ingresado
        
        // Definir el nombre y la contraseña esperada
        String nombre = "Leonardo";
        int Contraseña = 12345;
        
        // Solicitar al usuario que ingrese la contraseña
        System.out.println("Ingrese la contraseña: ");
        int Con = Leer.nextInt(); // Leer y almacenar la contraseña ingresada
        
        // Verificar si el nombre y la contraseña ingresados coinciden con los esperados
        if (Pelado.equals(nombre) && Con == Contraseña) {
            System.out.println("Bienvenido al sistema."); // Mensaje de bienvenida si la autenticación es exitosa
        } else {
            System.out.println("El usuario o la contraseña son incorrectos."); // Mensaje de error si la autenticación falla
        }
        
        Leer.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }   
}
