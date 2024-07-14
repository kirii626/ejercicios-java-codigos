package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto5tp3 { // Declaración de la clase punto5tp3
    static Scanner leer = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario
    static int compra; // Variable para almacenar el monto de la compra
    
    public static void Compra() { // Método para calcular el descuento
        System.out.println("Ingrese valor de la compra: ");
        compra = leer.nextInt(); // Leer el monto de la compra ingresado por el usuario
        
        if (compra >= 2000) { // Verificar si el monto de la compra es mayor o igual a 2000
            double desc = compra * 0.1; // Calcular el descuento del 10%
            double montoFinal = compra - desc; // Calcular el monto final con descuento
            
            // Mostrar el resultado al usuario
            System.out.println("El monto de la compra fue " + compra + ". Se aplicó un descuento del 10% y");
            System.out.println("el valor final es " + montoFinal);
        } else { // Si el monto de la compra es menor a 2000, no se aplica descuento
            System.out.println("El monto de la compra fue " + compra + ". No aplica descuento.");
        }
    }
    
    public static void main(String[] args) { // Método principal main
        Compra(); // Llamar al método Compra para ejecutar el cálculo del descuento
    }
}
