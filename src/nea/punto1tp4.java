package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Clase punto1tp4 para calcular descuentos en ventas de perfumes.
 */
public class punto1tp4 {
    
    static Scanner leer = new Scanner(System.in); // Creación de un objeto Scanner para leer desde la entrada estándar
    static int valor; // Declaración de la variable estática 'valor' de tipo int
    
    /**
     * Método para calcular descuentos en base al monto de venta ingresado.
     */
    public static void perfumes() {
        System.out.println("Ingrese monto de venta: "); // Solicitar al usuario que ingrese el monto de venta
        valor = leer.nextInt(); // Leer y almacenar el monto de venta ingresado
        
        double porcentaje = 0; // Inicialización de la variable 'porcentaje' para almacenar el descuento porcentual
        double descuento = 0; // Inicialización de la variable 'descuento' para almacenar el valor final con descuento
        
        // Evaluar condiciones basadas en el monto de venta para calcular el descuento
        if (valor < 1000) {
            porcentaje = valor * 0.05; // Calcular el descuento del 5% si el monto es menor a 1000
            descuento = valor - porcentaje; // Calcular el valor final con descuento
        } else if (valor <= 5000) {
            porcentaje = valor * 0.10; // Calcular el descuento del 10% si el monto está entre 1000 y 5000
            descuento = valor - porcentaje; // Calcular el valor final con descuento
        } else if (valor > 5000) {
            porcentaje = valor * 0.20; // Calcular el descuento del 20% si el monto es mayor a 5000
            descuento = valor - porcentaje; // Calcular el valor final con descuento
        }
        
        // Mostrar resultados
        System.out.println("El valor original era " + valor); // Mostrar el monto original ingresado
        System.out.println("El descuento a aplicar " + porcentaje); // Mostrar el descuento aplicado
        System.out.println("El valor final con descuento " + descuento); // Mostrar el valor final con descuento
    }
   
    public static void main(String[] args) {
        perfumes(); // Llamar al método perfumes() para ejecutar el cálculo de descuentos
        leer.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
