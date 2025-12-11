import java.util.Scanner;
import cuentas.Clientes;

public class Principal {
    public static void main(String[] args) {
        Clientes a, b, clienteActual=null, cuentaDestino=null;
        float ingreso,transferir;
        int claveNueva,claveVieja;
        String rta;
        int opcion=1;
        int clave=0;

        Scanner sc=new Scanner(System.in);

        a=new Clientes(1234, 15000, "Marta ");
        b=new Clientes(5678, 12000, "julio ");

        do {

            System.out.println("Por favor ingrese su clave ");
            clave=sc.nextInt();
            rta=Clientes.identificarCliente(clave);
            System.out.println("La Clave "+rta);
            System.out.print(clave);

        } while(clave==0);


        if (rta=="Marta"){
            clienteActual=a;
            cuentaDestino=b;
        } else if (rta=="Julio") {
            clienteActual=b;
            cuentaDestino=a;
        }

        System.out.println("\nLa cuenta actual es de "+rta+" Su clave es "+clienteActual.getClaveCuenta()+ " y su número de cuenta es: "+ clienteActual.getNumeroCuenta()+" Su saldo es :"+clienteActual.getSaldo());
        System.out.println("\nLa cuenta de destino tiene de clave "+cuentaDestino.getClaveCuenta()+ " y su número de cuenta es: "+ cuentaDestino.getNumeroCuenta()+ "Su saldo es: "+ cuentaDestino.getSaldo());

        while(opcion!=0){

            System.out.println("\nPor Favor ingrese la opcion que desea realizar \n 1- Ingresar Dinero \n 2- Reintegrar o retirar dinero \n 3- Realizar Transferencia \n 4- Cambiar Clave \n 5- Conocer Saldo \n 6- Salir ");
            opcion=sc.nextInt();

            switch (opcion){

                case (1):
                    //Ingresar Dinero
                    System.out.println("Por favor indique la cantidad de dinero que quiera ingresar ");
                    ingreso=sc.nextFloat();
                    clienteActual.ingresoDinero(ingreso);
                    System.out.println("Su saldo actual es: " + clienteActual.getSaldo());
                    break;

                case (2):

                    //Reintegrar Dinero
                    System.out.println("Por favor indique la cantidad de dinero que quiera reintegrar ");
                    ingreso=sc.nextFloat();
                    clienteActual.reintegrarDinero(ingreso);
                    System.out.println("Su saldo actual es: " + clienteActual.getSaldo());
                    break;

                case (3):
                    //Transferir Dinero

                    System.out.println("¿Cuanto dinero desea transferir? ");
                    transferir=sc.nextFloat();
                    clienteActual.transferir(transferir,cuentaDestino);
                    System.out.println("El dinero de la cuenta de destino es ahora: "+ cuentaDestino.getSaldo());
                    System.out.println("El dinero de su cuenta es: "+ clienteActual.getSaldo());


                    break;

                case (4):

                    System.out.println("Por favor ingrese la clave vieja: ");
                    claveVieja=sc.nextInt();
                    System.out.println("Por favor ingrese la clave nueva: ");
                    claveNueva=sc.nextInt();
                    System.out.println(clienteActual.cambiarClave(claveVieja,claveNueva));

                    break;

                case (5):
                    System.out.println("Su saldo es: €" + clienteActual.getSaldo());

                    break;


                case (6):
                    //Salir
                    opcion=0;
                    break;

            }
        }
    }
}