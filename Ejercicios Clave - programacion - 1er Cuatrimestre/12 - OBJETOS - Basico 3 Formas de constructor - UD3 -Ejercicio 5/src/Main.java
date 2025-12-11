import viajes.Pasajero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pasajero pasa1,pasa2=null, pasa3;

        /* En el hipotetico pcaso que solo creemos un objeto
        /* Este constructor funcionaria:
        Pasajero p =new Pasajero ("pepe");

        Este contructor tambien funcionaria
        Pasajero p =new Pasajero ("pepe",1.83);

        Esta sentencia es incorrecta por que no son compatibles el tipo de dato peso, deberia
        ingresar un int y es un double lo que ponemos
        Pasajero p =new Pasajero ("pepe", 65.8, 1.83);

        Esta funcionaria
        Pasajero p =new Pasajero ("Pepe",69, 1.83);


        pasa1=new Pasajero("Jose Luis");
        pasa1=pasa2;

        System.out.println("El pasajero 1 es: " + pasa1.getNombre());
        "Mensaje Cannot invoke \"viajes.Pasajero.getNombre()\" because \"pasa1\" is null"
        */

        pasa3= new Pasajero("Alejandro", 1.75);

        System.out.println("El pasa3 se llama: "+pasa3.getNombre()+" su peso es: "+pasa3.getPeso()+" y su altura es : "+pasa3.getAltura());

    }

}