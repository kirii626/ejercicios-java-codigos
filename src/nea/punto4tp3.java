package nea; // Declaración del paquete

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto4tp3 { // Declaración de la clase punto4tp3
    static Scanner Leer = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    static int compra; // Variable estática para almacenar el monto de la compra

    /**
     * Método para calcular el descuento basado en el monto de la compra.
     */
    public static void Compra() {
        System.out.println("Ingrese el valor de la compra: ");
        compra = Leer.nextInt(); // Leer y almacenar el valor de la compra ingresado por el usuario

        if (compra >= 1000) { // Verificar si el monto de la compra es igual o mayor a 1000
            int descuento = compra - 80; // Aplicar un descuento fijo de 80 unidades al monto de la compra
            System.out.println("El valor de la compra fue: " + compra + ". Su descuento es de 80 y el importe final es: " + descuento);
        } else {
            // Si la compra es menor a 1000, no se aplica descuento
            System.out.println("El valor de la compra fue: " + compra + ". No se aplicó ningún descuento.");
        }
    }

    public static void main(String[] args) {
        Compra(); // Llamar al método para calcular el descuento basado en el monto de la compra
    }
}
