package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

public class Punto11 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in); // Crear un objeto Scanner para leer desde la entrada estándar
        
        System.out.print("Ingrese el valor del mes en números: "); // Solicitar al usuario que ingrese el número de mes
        int Mes = Leer.nextInt(); // Leer y almacenar el número de mes ingresado por el usuario
        
        // Utilizar el switch para imprimir el nombre del mes según el número ingresado
        switch (Mes) {
            case 1:
                System.out.print("El mes es enero ");
                break;
            case 2:
                System.out.print("El mes es febrero ");
                break;
            case 3:
                System.out.print("El mes es marzo ");
                break;
            case 4:
                System.out.print("El mes es abril ");
                break;
            case 5:
                System.out.print("El mes es mayo ");
                break;
            case 6:
                System.out.print("El mes es junio ");
                break;
            case 7:
                System.out.print("El mes es julio ");
                break;
            case 8:
                System.out.print("El mes es agosto ");
                break;
            case 9:
                System.out.print("El mes es septiembre ");
                break;
            case 10:
                System.out.print("El mes es octubre ");
                break;
            case 11:
                System.out.print("El mes es noviembre ");
                break;
            case 12:
                System.out.print("El mes es diciembre ");
                break;
            default:
                System.out.print("Número de mes no válido"); // Mensaje si el número de mes no está en el rango de 1 a 12
                break;
        }
        
        Leer.close(); // Cerrar el objeto Scanner al finalizar su uso para liberar recursos
    }
}
