import java.util.Scanner;

public class Main {

    public static int calcularNumero(int posicion) {
        int posicion1, posicion2, resultado;
        resultado=0;
        posicion1=0;
        posicion2=1;

        if (posicion==1){
            return 0;
        }else if (posicion >=3){

            for (int i =3 ; i<=posicion ; i++){

                resultado=posicion1+posicion2;
                posicion1=posicion2;
                posicion2=resultado;

            }

        }
        return resultado;
    }

    public static void main(String[] args) {

        int posicion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introuce el número de la posicion que quieres calcular");
        posicion = sc.nextInt();


        System.out.println("El numero de esa posicion "+calcularNumero(posicion));


    }
}