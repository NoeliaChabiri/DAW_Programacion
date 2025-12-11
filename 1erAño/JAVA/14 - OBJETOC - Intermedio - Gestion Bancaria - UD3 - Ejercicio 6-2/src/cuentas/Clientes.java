package cuentas;

public class Clientes {

    public static int contadorNumeroCuentas = 0;
    private int numeroCuenta;
    private int claveCuenta;
    private String nombreCliente;
    private float saldo;


    public Clientes(int claveCuenta, float saldo, String nombreCliente) {

        contadorNumeroCuentas++;
        this.numeroCuenta = contadorNumeroCuentas;
        this.claveCuenta = claveCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;

    }

    public static int getContadorNumeroCuentas() {
        return contadorNumeroCuentas;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getClaveCuenta() {
        return claveCuenta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public String getNombreCliente() {

        return nombreCliente;
    }


    public static void setContadorNumeroCuentas(int contadorNumeroCuentas) {
        Clientes.contadorNumeroCuentas = contadorNumeroCuentas;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setClaveCuenta(int claveCuenta) {
        this.claveCuenta = claveCuenta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /* como el metodo de la clase lo hacemos Static*/
    public static String identificarCliente(int claveCuenta) {
        String rta; // Solo declaración, no inicialización

        switch (claveCuenta) {
            case 1234:
                rta = "Marta";
                break;
            case 5678:
                rta = "Julio";
                break;
            default:
                rta = "es Erronea";
                // No se necesita 'break' en el default si es la última instrucción
        }

        return rta;
    }

    public String ingresoDinero(float cantidad){
        String rta;
        if(cantidad>0){
            this.saldo=saldo+cantidad;
            rta="Ingreso correto";
        }else{
            rta="Ingreso incorrecto, la cantidad a ingresar debe ser mayo de 0 , \n no puedo realizarce tranferencia";
        }
        return rta;
    }

    public String reintegrarDinero(float cantidad){
        String rta;
        if(cantidad>0){
            this.saldo=saldo-cantidad;
            rta="Reintegro correto";
        }else{
            rta="Ingreso incorrecto, la cantidad a ingresar debe ser mayo de 0 , \n no puedo realizarce tranferencia";
        }

        return rta;
    }

    public void transferir(float dinero, Clientes destino){

        this.saldo=saldo-dinero;
        destino.saldo=destino.saldo+dinero;

    }

    public String cambiarClave(int claveVieja, int claveNueva){

        String rta;

        if (claveVieja==this.claveCuenta){

            this.claveCuenta=claveNueva;

            rta="Se cambio la clave Correctamente";

        }else{

            rta="Ingreso mal la clave antigua, no se pudo cambiar la clave";

        }


        return rta;
    }

}




