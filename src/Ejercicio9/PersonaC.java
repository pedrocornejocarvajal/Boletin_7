package Ejercicio9;

import java.util.Objects;

public class PersonaC implements Cloneable {
    private int  edad;
    private String nombre, dni;
    private PesoAlturaC pesoAlturaC;


    //Constructores
    public PersonaC(){
        this.dni="";
        this.edad=0;
        this.nombre = "";
        this.pesoAlturaC = new PesoAlturaC(0,0);
    }
    public PersonaC(String dni, int edad, String nombre, PesoAlturaC pesoAlturaC){
        this.dni=dni;
        this.edad=edad;
        this.nombre=nombre;
        this.pesoAlturaC = pesoAlturaC;
    }
//setter y getter
    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public PesoAlturaC getPesoAltura(){
        return this.pesoAlturaC;
     }

    public void setPesoAltura(PesoAlturaC pesoAlturaC) {
        this.pesoAlturaC = pesoAlturaC;
    }

    public Object cloneSup(){
        Object objeto = new Object();
        try{
            objeto=super.clone();
            }
        catch (CloneNotSupportedException e){
            System.out.println("no se puede clonar el objeto");
        }
        return objeto;
    }

    public Object cloneDeep(){
        PersonaC objeto = null;
        try{
            objeto=(PersonaC)super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("no se puede clonar el objeto");
        }
        objeto.pesoAlturaC = (PesoAlturaC) objeto.pesoAlturaC.clone();
        return (PersonaC)objeto;
    }

    @Override
    public String toString() {
        return "{" +
                "dni=" + dni +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", peso = " + pesoAlturaC +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesoAlturaC);
    }
}

