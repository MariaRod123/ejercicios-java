import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {

        /* programa que calcula el valor absoluto de un número
         
        Definición :  |x|= x ó |-x|= x para x!=0 ; si x=0 --> |x|=0

        */

        int valor;
        int valor_absoluto;

        System.out.println("Ingrese un número");
        Scanner input= new Scanner(System.in);
        valor=input.nextInt();

        if (valor!=0){
            valor_absoluto=Math.abs(valor);
            System.out.println("|" + valor + "| = " + valor_absoluto );
        }
        else{
            valor_absoluto=0;
            System.out.println("|" + valor + "| = " + valor_absoluto );
        }

    }
}








