import java.util.Scanner;
import animales.Gato;

public class Main {
    public static void main(String[] args) {
        String cadena1="Mi primera cadena",cadena2="Se ha modificado la cadena";
        Gato gato1, gato2;

        gato1=new Gato("Felix", "Persa", 35, 4.5, "Blanco");

        gato2=gato1;

        gato1.setColor("Marrón");

        System.out.println(gato1.getColor());
        System.out.println(gato2.getColor());

        //Como apunta a la posicion de memoria tabbien cambia el color del gato 2.

        cadena1="Se ha modificado la cadena";

        System.out.println(cadena1);
        System.out.println(cadena2);

        // Se cambia e valor de la cadena son dos String diferentes.
    }

}