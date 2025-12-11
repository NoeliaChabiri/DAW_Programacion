import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("U2-2 Ejercicio 4\n");
        int mes, diasMes = 0, anio;
        String esBisiesto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa analizara un año y el mes que se indique, respondera si es bisiesto y cuandos días tiene el mes \nEnero:1 - Febrero:2 - Marzo:3 - Abril:4 - Mayo:5 - Junio:6 - Julio:7 - Agosto:8 - Septiembre:9 - Octubre:10 - Noviembre:11 - Diciembre:12");
        System.out.println("Ingrese en número el mes según corresponda: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el año de la consulta:");
        anio = sc.nextInt();

        // Determina si el año es bisiesto
        esBisiesto = (anio % 4 == 0) ? "si" : "no";

        if (esBisiesto == "si") {
            esBisiesto = " es bisiesto";

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    break;
                case 2:
                    diasMes = 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasMes = 30;
                    break;
                default:
                    System.out.println("Ingreso mal el mes, da error, deberá reiniciar programa");
                    return;
            }

        } else {
            esBisiesto = " no es bisiesto";

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    break;
                case 2:
                    diasMes = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasMes = 30;
                    break;
                default:
                    System.out.println("Ingreso mal el mes, da error, deberá reiniciar programa");
                    return;
            }
        }

        System.out.println("El año" + esBisiesto + " y el mes tiene " + diasMes + " días.");
    }
}
