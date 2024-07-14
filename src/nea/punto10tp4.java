package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class punto10tp4 {
    
    // Método para realizar cálculos de suma y diferencia entre dos números ingresados por el usuario
    public static void calculos() {
        Scanner leer = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        int y = leer.nextInt(); // Leer y almacenar el primer número ingresado
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        int x = leer.nextInt(); // Leer y almacenar el segundo número ingresado
        
        int suma = y + x; // Calcular la suma de los dos números
        int diferencia = y - x; // Calcular la diferencia de los dos números
        
        // Mostrar los resultados de la suma y la diferencia
        System.out.println("La suma de Y + X es: " + suma);
        System.out.println("La diferencia entre Y - X es: " + diferencia);
        
        leer.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
    
    public static void main(String[] args) {
        calculos(); // Llamar al método calculos() para realizar los cálculos de suma y diferencia
    }
}
