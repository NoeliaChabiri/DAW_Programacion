package cadenas;

public class UtilCadena {


    public static int calcularLongitud(String texto){
        int rta;

        rta=texto.length();

        return rta;
    }

    public static String convertirMayusculas(String texto){
        String rta="";

        rta=texto.toUpperCase();

        return rta;
    }

    public static String convertirMinusculas(String texto){
        String rta="";

        rta=texto.toLowerCase();

        return rta;
    }


    public static String sacarSubcadena(String texto){
        String rta="";
        int longitud;
        longitud=texto.length();

        if (longitud >= 3){
            rta=texto.substring(1,3);
        }else {
            rta="La cadena es demaciado pequeña";
        }

        return rta;
    }

    public static int contarCaracteres(String texto, char caracter){
        int rta=0;

        //Toma un numero , que seria la posición.

        for (int i=0 ; i<texto.length() ; i++){

            if (caracter==texto.charAt(i)){
                rta++;
            }
        }
        return rta;
    }

}
