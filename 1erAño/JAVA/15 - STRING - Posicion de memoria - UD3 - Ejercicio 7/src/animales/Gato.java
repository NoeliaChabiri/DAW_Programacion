package animales;

public class Gato {

    private String nombre;
    private String raza;
    private double altura;
    private double peso;
    private String color;

    public Gato(String nombre, String raza, double altura, double peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
