import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        /*  Cálculo de operaciones básicas */

        float a, b, suma, resta, multiplicacion;
        float division = 0;
        String error = "Error, no existe la división entre 0";

        System.out.println("ingrese un número");
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        System.out.println("ingrese segundo número");
        b = input.nextFloat();

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;

        if (b != 0) {
            division = a / b;
            System.out.println("Resultado de división:" + division);
        } else {
            System.out.println(error);}

        System.out.println("La suma es:" +suma);
        System.out.println("La diferencia es:" +resta);
        System.out.println("Resultado de multiplicación:" +multiplicacion);

        
    }
}

















