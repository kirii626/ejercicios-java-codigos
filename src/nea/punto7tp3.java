package nea;

import java.util.Scanner;

public class punto7tp3 {
    // Declaración de Scanner para leer la entrada del usuario
    static Scanner leer = new Scanner(System.in);
    
    // Variable estática para almacenar el valor del lado del cuadrado
    static int valor;
    
    // Método para calcular el perímetro y la superficie del cuadrado
    public static void Calculos() {
        // Solicitar al usuario que ingrese el valor del lado del cuadrado
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        
        // Leer el valor del lado del cuadrado desde la entrada estándar
        valor = leer.nextInt();
        
        // Calcular el perímetro del cuadrado (lado * 4)
        int perimetro = valor * 4;
        
        // Calcular la superficie del cuadrado (lado * lado)
        int superficie = valor * valor;
        
        // Mostrar el resultado del perímetro y la superficie del cuadrado
        System.out.println("El valor del perimetro es " + perimetro + " y el valor de superficie es " + superficie);
    }
    
    // Método principal para iniciar el programa
    public static void main(String[] args) {
        // Llamar al método Calculos para realizar los cálculos del cuadrado
        Calculos();
    }
}
