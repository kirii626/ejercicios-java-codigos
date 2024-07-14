package nea;
import java.util.Scanner;
public class punto3tp4 {
    static Scanner numero = new Scanner(System.in);
    static int fecha,año,mes,dia;
    public static void calculos(){
        System.out.println("Ingrese su dia de nacimiento en formato "+"dd"+" por ejemplo, 06");
        dia = numero.nextInt();
        System.out.println("Ingrese su mes de nacimiento en formato "+"mm"+" por ejemplo, 08");
        mes = numero.nextInt();
        System.out.println("Ingrese su año de nacimiento en formato "+"eeee"+" por ejemplo, 1986");
        año = numero.nextInt();
        int año_nace= 2023-año;
        if ((año_nace==16) || (año_nace==16 && mes<=9)){
            System.out.println("Puede votar");
        }
        else if ((año_nace==18)||(año_nace==18 && mes<=9)){
            System.out.println("Debe votar");
        }
        else if (año_nace>18){
            System.out.println("Debe votar");
        }
        else {
            System.out.println("No debe votar");
        }
    }
    public static void main (String[]args){
        calculos();
    }
}
