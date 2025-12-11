
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, random,divisor,puesto;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        num=sc.nextInt();
        divisor=0;

        random=(int)(Math.random()*20)+1;

        for (int i=1 ; i<=num ; i++){

            if (num%i==0){

                divisor=divisor+1;

            }


        }
        if (divisor==2){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número es compuesto");
        }

        System.out.println("Ingrese el puesto que quedo");
        puesto=sc.nextInt();

        switch (puesto){
            case 1: System.out.println("Medalla de oro");
                break;
            case 2: System.out.println("Medalla de plata");
                break;
            case 3: System.out.println("Medalla de bronce");
                break;

            default: System.out.println("Gracias por participar");

        }


    }
}