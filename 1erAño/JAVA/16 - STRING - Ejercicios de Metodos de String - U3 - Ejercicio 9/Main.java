//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadena1="Este Ejercicio es sobre la clase String";
        String palabra=" palabra ";
        String palabra2="Prueba";

        System.out.println("La cadena tiene "+cadena1.length()+" caracteres");

        System.out.println("\n"+cadena1.substring(5,14));

        cadena1=cadena1.replace("clase","modificar");
        System.out.println(cadena1);

        cadena1=cadena1.toLowerCase();
        System.out.println(cadena1);

        cadena1=cadena1.concat(" Palabra Añadida");
        System.out.println(cadena1);

        System.out.println(cadena1.charAt(5));

        System.out.println(palabra);
        palabra=palabra.trim();
        System.out.println(palabra);

        System.out.println(palabra2.equals(palabra));

        System.out.println(palabra2.equalsIgnoreCase(palabra));

        System.out.println(palabra.toUpperCase());
        



    }
}