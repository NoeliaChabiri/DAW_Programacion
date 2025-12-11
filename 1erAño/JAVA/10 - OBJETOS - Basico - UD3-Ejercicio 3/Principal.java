
import ejercicio3.Calculo;
import java.util.Scanner;

public class Principal {

    public static void main(String[]arg){

        float precio, total=0f;
        Calculo c;
        int puntos=0;

        Scanner sc=new Scanner(System.in);

        // Se crea un objeto dde la clase Calculo llamado //
        c=new Calculo();

        System.out.println("Por favor  ingrese un precio");
        precio= sc.nextFloat();

        // Se invoca el método setPrecio, pasandole como parametro real el valor 43 //
        c.setPrecio(precio);

        // Para acceder al valor de precio se debe hacer a travéz de su método accesor,
        //esto es debido a que precio es un atributo privado.

        // Aqui le decrementa a Total
        System.out.println("Por favor  ingrese el precio a descontar");
        total=sc.nextFloat();
        c.descontar(total);

        // Aqui le incrementa a puntuacion
        System.out.println("Por favor  ingrese los puntos a incrementar");
        puntos= sc.nextInt();
        c.incrementar(puntos);

        System.out.println(c.getPrecio());
        System.out.println(c.getTotal());
        System.out.println(c.getPuntuacion());

    }


}