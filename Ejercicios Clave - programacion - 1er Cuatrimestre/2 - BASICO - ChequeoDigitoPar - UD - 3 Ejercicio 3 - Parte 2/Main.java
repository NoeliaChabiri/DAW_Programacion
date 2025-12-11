
import java.util.Scanner;

public class Main {

    public static boolean calcularImparPar(int num) {
        boolean impar;
        impar = false;
        for (int i = 1; i <= 4; i++) {

            if (num % 2 != 0) {

                impar = true;

            } else {
                impar = false;
            }

            num = num / 10;
        }
        return impar;
    }

    public static void main(String[] args) {

        int num;
        boolean rta;
        num = 1;
        rta = false;

        Scanner sc = new Scanner(System.in);


        do {



            while (num < 999 || num >= 10000) {
                System.out.println("Por favor ingrese un número de 4 digitos");
                num = sc.nextInt();

                if (num==0){
                    return;
                }

                rta = calcularImparPar(num);

                if(num > 999 || num >= 10000) {
                    if (rta == false) {

                        System.out.println("El número tiene todos números pares");

                    } else {
                        System.out.println("El número tiene números Impares ");
                    }
                }else{
                    System.out.println("Ingrese Nuevamente el numero lo Ingreso mal");
                }

                num=1;

            }

        } while (num != 0);

    }

}

