package concesionario;

public class Coche {

    private String marca;
    private double precio;


    public Coche(String marca, double precio){

        this.marca=marca;
        this.precio=precio;
    }

    public String getMarca(){
        return marca;
    }

    public double getPrecio(){
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioIva(){
        precio=precio*1.21;

        return precio;
    }

    public String empezar_conducir (int a){

        String opcion="";

        switch (a){

            case (1):
                opcion="Arrancar";
                break;
            case (2):
                opcion="Meter Marcha";
                break;
            case (3):
                opcion="Acelerar Coche";
                break;
        }

        return opcion;
    }

    public int compararPrecioCoche (Coche coche){
        int opcion=0;
        double precioA,precioB;




        if(this.precio>coche.getPrecio()){

            opcion=1;

        }else if (this.precio<coche.getPrecio()){

            opcion=-1;

        }else {

            opcion=0;
        }

        return opcion;
    }




}
