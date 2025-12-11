package ejercicio3;

public class Calculo {

    private float precio;
    private int puntuacion;
    private float total;

    public Calculo(){
        precio=0f;
        puntuacion=0;
        total=1000f;
    }

    public float getPrecio(){
        return precio;
    }



    public float getTotal(){
        return total;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public void setPrecio(float precioCoste){

        precio=precioCoste;
    }

    /* Este metodo es un mutador*/

    public void incrementar(int puntos){

        puntuacion=puntuacion+puntos;

    }

    public void descontar (float cantidad ){
        total=total-cantidad;

    }

}
