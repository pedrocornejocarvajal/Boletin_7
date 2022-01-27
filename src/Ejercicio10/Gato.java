package Ejercicio10;

public class Gato implements Comparable<Gato>{
    private String nombre;
    private String color;
    private String raza;
    private int edad;


    public Gato(String nombre, String color, String raza, int edad){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Gato gato) {
        return (this.nombre).compareTo(gato.getNombre());
    }
    public int compareTo2(Gato gato) {
        return this.edad-gato.edad;
    }
    public String toString(){
        return "Nombre: "+ this.nombre+ " Raza: "+ this.raza+ " Color: "+ this.color + " Edad: "+ this.edad;
    }
}
