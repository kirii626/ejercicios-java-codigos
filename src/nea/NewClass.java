package nea; // Definición del paquete 'nea'
///* Este programa solicita al usuario ingresar la temperatura y luego determina en qué rango se encuentra 
///*la temperatura ingresada para imprimir un mensaje.


import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class NewClass {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        System.out.print("La temperatura es "); // Solicitar al usuario que ingrese la temperatura
        int Temp = Leer.nextInt(); // Leer y almacenar la temperatura ingresada por el usuario
        
        // Evaluar la temperatura e imprimir un mensaje según el rango en el que se encuentre
        if (Temp < 10 && Temp == 10) { // Si la temperatura es exactamente 10 (rango <10)
            System.out.print("La temperatura es fría"); // Mostrar mensaje de temperatura fría
        } else if (Temp < 10 && Temp > 20 && Temp == 20) { // Si la temperatura está entre 10 y 20 (rango <10)
            System.out.print("La temperatura es nublada"); // Mostrar mensaje de temperatura nublada
        } else if (Temp > 20 && Temp < 30 && Temp == 30) { // Si la temperatura está entre 20 y 30 (rango >20)
            System.out.print("La temperatura es calurosa"); // Mostrar mensaje de temperatura calurosa
        } else if (Temp > 30) { // Si la temperatura es mayor que 30
            System.out.print("La temperatura es tropical"); // Mostrar mensaje de temperatura tropical
        }
        
        Leer.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
