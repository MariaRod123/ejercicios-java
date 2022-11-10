import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        int num;
        String error = "Error, el factorial de un número sólo se puede calcular para valores mayores o igual a 0";
        long n = 1;  /* n= factorial de un número, cuando num=0 --> n=1 (ej: expresión matemática: 0!=1) */  
            System.out.println("Ingrese un número");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

           

            if (num >= 0) {
                for (int i = num; i > 0; i--) {
                    n = n * i * 1;
                }
                System.out.println(+num + "!" + "=" + n);

            } else
                System.out.println(error);
        }
        
    }
