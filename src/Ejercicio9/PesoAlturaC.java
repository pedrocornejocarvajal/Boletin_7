package Ejercicio9;

public class PesoAlturaC implements Cloneable{
    private int peso;
    private int altura;

    public PesoAlturaC(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Object clone(){
        Object objeto=null;
        try {
            objeto=super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("elemento no clonado");
        }
        return objeto;
    }

    public String toString(){
        return "peso "+ this.peso + " altura "+ this.altura;
    }
}
