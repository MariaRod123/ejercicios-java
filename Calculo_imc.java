import java.util.Scanner;

public class Calculo_imc {
    public static void main(String[] args) {
        /* programa que calcula el indice de masa corporal*/


        String nombre;
        int edad;
        float peso, altura, imc;

        System.out.println("Escriba su nombre:");
        Scanner input=new Scanner(System.in);
        nombre=input.next();

        System.out.println("Escriba su edad en años:");
        Scanner anios= new Scanner(System.in);
        edad=anios.nextInt();

        System.out.println("Escriba su peso actual en KG");
        Scanner peso_actual= new Scanner(System.in);
        peso = peso_actual.nextFloat();

        System.out.println("Escriba su estatura en metros, sin zapatos");
        Scanner estatura= new Scanner(System.in);
        altura=estatura.nextFloat();

        /*Cálculo del Indice de masa corporal */

        imc= (float) (peso / Math.pow(altura,2));
        System.out.println( "DATOS:" +nombre +" "+edad + "\nSu indice de masa corporal es:" +imc);

        if (imc <= 18.50){
            System.out.println("Su indice de masa corporal es muy bajo");
        }
        else if (imc >18.50 && imc <= 25.00){
            System.out.println("Su indice de masa corporal es normal");
        }
        else if( imc >25.00 && imc<30.00){
            System.out.println("Su indice de masa corporal indica sobrepeso");

        }
        else
            System.out.println("Su indice de masa corporal indica  obesidad");


    }

}





