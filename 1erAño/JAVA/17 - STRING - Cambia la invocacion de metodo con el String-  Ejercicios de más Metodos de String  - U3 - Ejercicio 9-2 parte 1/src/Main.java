import java.util.Scanner;
import cadenas.UtilCadena;

import static cadenas.UtilCadena.*;

public class Main {
    public static void main(String[] args) {
        String control="", cadena="";
        char caracter ;

        control="continua";

        Scanner sc=new Scanner(System.in);

        while(!control.equals("fin")){

            System.out.println("Por favor ingrese una cadena de letras");
            cadena=sc.nextLine();

            System.out.println("Por favor ingrese una letra");
            caracter=sc.next().charAt(0);

            sc.nextLine();

            System.out.println("el caracter que ingreso es: "+caracter);

            System.out.println("Si desea salir del programa ingrese fin: ");
            control=sc.nextLine();
            control=control.toLowerCase();

            System.out.println("La cadena tiene "+calcularLongitud(cadena)+" caracteres");
            System.out.println(convertirMayusculas(cadena));
            System.out.println(convertirMinusculas(cadena));
            System.out.println("La subcadena entre 1 y 3 es: " + sacarSubcadena(cadena));
            System.out.println("La cadena tiene " + contarCaracteres(cadena,caracter)+" "+caracter);



        }
    }
}