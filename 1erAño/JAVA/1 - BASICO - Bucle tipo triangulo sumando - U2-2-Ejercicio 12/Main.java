import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num, i,j, control;

        Scanner sc=new Scanner(System.in);

        System.out.println("Por favor Ingrese un número");

        num=sc.nextInt();

        j=0;
        i=1;

        while(i<=num){


            while(j<i){

                System.out.print(" "+i);
                j++;

            }

            j=0;
            System.out.println("");

            i++;

        }

    }

}