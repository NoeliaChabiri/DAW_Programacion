package rrhh;

public class Empleado {

    private static int numero=0;
    private int numeroEmpleado;

    public Empleado(){
        numero++;
        numeroEmpleado=numero;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }


}
