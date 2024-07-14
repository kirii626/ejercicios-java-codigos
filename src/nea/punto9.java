package nea; // Definición del paquete 'nea'

import java.util.Scanner; // Importación de la clase Scanner desde el paquete java.util

/**
 * Programa para calcular el promedio de notas de un alumno en tres trimestres.
 * Se solicita al usuario ingresar el nombre del alumno, el nombre de la materia,
 * el nombre del curso y las notas de los tres trimestres. Luego, se calcula el
 * promedio de notas y se muestra la información ingresada junto con el promedio.
 */
public class punto9 {
 
    public static void main(String[] args){
       Scanner Leer = new Scanner(System.in); // Objeto Scanner para leer cadenas de texto
       Scanner Num = new Scanner(System.in); // Objeto Scanner para leer números enteros
       
       // Solicitar al usuario que ingrese el nombre del alumno
       System.out.print("Ingrese el nombre del alumno: ");
       String Nombre = Leer.nextLine(); // Leer el nombre ingresado por el usuario
       
       // Solicitar al usuario que ingrese el nombre de la materia
       System.out.print("Ingrese el nombre de la materia: ");
       String NomMateria = Leer.nextLine(); // Leer el nombre de la materia ingresado por el usuario
       
       // Solicitar al usuario que ingrese el nombre del curso
       System.out.print("Ingrese el nombre del curso: ");
       String Curso = Leer.nextLine(); // Leer el nombre del curso ingresado por el usuario
       
       // Solicitar al usuario que ingrese la nota del primer trimestre
       System.out.print("Ingrese la nota del primer trimestre: ");
       int Notaprimer = Num.nextInt(); // Leer la nota del primer trimestre ingresada por el usuario
       
       // Solicitar al usuario que ingrese la nota del segundo trimestre
       System.out.print("Ingrese la nota del segundo trimestre: ");
       int Notaseg = Num.nextInt(); // Leer la nota del segundo trimestre ingresada por el usuario
       
       // Solicitar al usuario que ingrese la nota del tercer trimestre
       System.out.print("Ingrese la nota del tercer trimestre: ");
       int Notatercer = Num.nextInt(); // Leer la nota del tercer trimestre ingresada por el usuario
       
       // Calcular el promedio de notas
       float Promedio = (Notaprimer + Notaseg + Notatercer) / 3.0f;
       
       // Mostrar la información ingresada por el usuario y el promedio de notas calculado
       System.out.println("Nombre del alumno: " + Nombre);
       System.out.println("Materia: " + NomMateria);
       System.out.println("Curso: " + Curso);
       System.out.println("Nota del primer trimestre: " + Notaprimer);
       System.out.println("Nota del segundo trimestre: " + Notaseg);
       System.out.println("Nota del tercer trimestre: " + Notatercer);
       System.out.println("Promedio de notas: " + Promedio);
    } 
}

