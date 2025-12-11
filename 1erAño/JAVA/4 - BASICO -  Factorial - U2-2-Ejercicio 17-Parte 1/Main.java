import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, sumaPar, sumaImpar, suma, cuadrado, factorial, sumaCuadrados, num2, anio,mes;


        sumaPar = 0;
        sumaImpar = 0;
        cuadrado = 0;
        suma = 0;
        sumaCuadrados = 0;

        Scanner sc = new Scanner(System.in);

        
        do {

            System.out.println("por favor Ingrese un numero entre 1 y 20");
            num = sc.nextInt();
        } while (num < 0 || num > 20);


        for (int i = 1; i <= num; i++) {

            suma += i;
            if (i % 2 == 0) {

                sumaPar = i + sumaPar;
            } else {
                sumaImpar = sumaImpar + i;
            }
            cuadrado = i * i;
            sumaCuadrados = sumaCuadrados + cuadrado;

            System.out.println("El cuadrado de " + i + " es: " + cuadrado);


        }

        System.out.println("La suma de los números pares es: " + sumaPar);
        System.out.println("La suma de los números impares es: " + sumaImpar);
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La suma de los los cuadrados de los números es: " + sumaCuadrados);




        factorial=1;
        do {

            System.out.println("por favor Ingrese un numero entre 1 y 7");
            num2 = sc.nextInt();

        } while (num2 < 0 || num2 > 7);

        for (int i=1; i<=num2 ; i++){

            factorial = factorial*i;

        }

        System.out.println("El factorial de " + num2 + " es: " + factorial);




        do {
            System.out.println("Por favor Ingrese el mes (en números)");
            mes = sc.nextInt();

            System.out.println("Por favor Ingrese el año ");
            anio = sc.nextInt();

            if (mes<1 || mes>12){
                System.out.println("Ingreso mal el mes, ingrese todo nuevamente ");
            }

        }while(mes<=1 && mes>=12);


        switch (mes){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Este mes tiene 31 días ");
            break;

            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Este mes tiene 30 días ");
            break;

            case 2:

                if (anio%4==0){
                System.out.println("Este mes tiene 29 días ");
                } else {
                System.out.println("Este mes tiene 28 días ");
                }

            break;



        }




    }



}