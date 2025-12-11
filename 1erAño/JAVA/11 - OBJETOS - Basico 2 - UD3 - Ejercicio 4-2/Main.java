import java.util.Scanner;
import concesionario.Coche;

public class Main {
    public static void main(String[] args) {
        Coche auto1, auto2;
        String marca, marca2;
        double precio, precio2;
        int opcion;

        Scanner sc=new Scanner(System.in);

        System.out.println("Por favor ingrese la marca del Vehiculo 1 ");
        marca= sc.nextLine();
        System.out.println("Por favor ingrese el precio del Vehiculo 1 ");
        precio=sc.nextDouble();

        sc.nextLine();

        auto1= new Coche(marca,precio);
        auto1.calcularPrecioIva();

        System.out.println("La marca del Vehiculo 1 es: "+auto1.getMarca() + " y su precio es: € "+ auto1.getPrecio());

        auto2= new Coche("Ford", 5467);

        System.out.println("La marca del Vehiculo 2 es: "+auto2.getMarca() + " y su precio es: €"+ auto2.getPrecio());

        System.out.println("Que quiere hacer con el coche?\n 1- Arrancar, \n 2- Meter Marcha \n 3- Acelerar Coche");
        opcion=sc.nextInt();
        sc.nextLine();
        System.out.println("Usted quiere: "+ auto1.empezar_conducir(opcion)+" el coche");

        System.out.println("El resultado de la comparacion es: "+auto1.compararPrecioCoche(auto2));

        System.out.println("Cambia la marca del Vehiculo 1");
        marca2=sc.nextLine();

        auto1.setMarca(marca2);
        System.out.println("La marca del Vehiculo 1 es: "+ auto1.getMarca() + " y su precio es: € "+ auto1.getPrecio());

    }

}