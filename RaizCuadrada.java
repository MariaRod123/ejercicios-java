import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {

        /* Programa que calcula la raiz cuadrada de un número */

        //variables

        float radicando;
        float raiz;
        String error="No existe la raíz cuadrada de número negativo en el campo de los números reales";

        System.out.println("Ingrese un valor");
        Scanner input= new Scanner(System.in);
        radicando=input.nextInt();


        if(radicando<0) {
            System.out.println(error);
        }
        else if(radicando>=0 ){
            raiz= (float) Math.sqrt(radicando);
            System.out.println("El resultado es: " + raiz);
        }

        }
    }





