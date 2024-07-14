package nea;
import java.util.Scanner;
public class punto9tp3 {
    static Scanner leer = new Scanner(System.in);
    static int valor;
    public static void Calculo(){
        System.out.println("Ingrese valor de radio de la circunferencia");
        valor = leer.nextInt();
        double area = 3.14*valor*valor;
        System.out.println("El area del circulo es "+area);
        }
    public static void main (String[] args){
        Calculo();
    }
}
