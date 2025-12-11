
/* Ralizar un programa que calcule la hipotenusa de un triangulo rectangulo, en fuincion de sus cateto */

import java.util.Scanner;

public class Main {

    public static double calcularPrecio(double num1, double num2){

        double resultado,raiz;

        resultado=(num1*num1)+(num2*num2);
        raiz=Math.sqrt(resultado);

        return raiz;
    }


    public static void main(String[] args) {

        double cateto1, cateto2, hipotenusa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer cateto: ");
        cateto1=sc.nextDouble();
        System.out.println("Por favor ingrese el segundo cateto: ");
        cateto2=sc.nextDouble();

        hipotenusa=calcularPrecio(cateto1,cateto2);

        System.out.println("La hipotenusa del triangulo es: "+hipotenusa);

    }
    
}