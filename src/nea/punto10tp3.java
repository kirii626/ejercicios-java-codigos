package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto10tp3 {
    static Scanner leer = new Scanner(System.in); // Objeto Scanner para leer desde la entrada estándar
    static int valor; // Variable estática para almacenar el valor ingresado por el usuario
    
    // Método para calcular el valor absoluto del número ingresado
    public static void Calculo() {
        System.out.println("Ingrese un valor: "); // Solicitar al usuario que ingrese un valor
        valor = leer.nextInt(); // Leer y almacenar el valor ingresado por el usuario
        
        int valorabs = Math.abs(valor); // Calcular el valor absoluto utilizando Math.abs()
        
        System.out.println("El valor absoluto es " + valorabs); // Mostrar el valor absoluto calculado
    }
    
    public static void main(String[] args) {
        Calculo(); // Llamar al método Calculo() para calcular y mostrar el valor absoluto
    }
}
