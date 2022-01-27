package EjercicioJoseMaria;

/*
Tipo: ProductosCovid19
Propiedades (Atributos):
    -Basicas:
        Cadena(20) CodigoBarras C
        Cadena Nombre C
        Date FechaCaducidad C
        Entero Precio C,M
Funcionalidades (Metodos):
    -Fundamentales:
        -getCodigoBarras()
        -getNombre()
        -getFechaCaducidad()
        -getPrecio()
        -setPrecio(Entero)
    -Heredadas:
        -compareTo (ProductosCovid19)
        -toString()
 */

import static java.util.Calendar.*;
import java.util.GregorianCalendar;
import java.util.Objects;

public class ProductosCovid19 implements Cloneable, Comparable<ProductosCovid19>{

    //Atributos
    protected String  codigoBarras;
    protected String nombre;
    protected GregorianCalendar fechaCaducidad;
    protected float precio;

    //Constructor
    public ProductosCovid19(String codigoBarras, String nombre, int anho, int mes,int dia,  float precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.fechaCaducidad = new GregorianCalendar(anho, mes, dia);
        this.precio = precio;
    }

    //Getters y Setters
    public String getCodigoBarras(){
        return codigoBarras;
    }
    public String getNombre(){
        return nombre;
    }
    public GregorianCalendar getFechaCaducidad(){
        return fechaCaducidad;
    }
    public float getPrecio(){
        return precio;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaCaducidad(GregorianCalendar fechaCaducidad) {
        if(this.fechaCaducidad==null){
            this.fechaCaducidad = new GregorianCalendar();
        }

        this.fechaCaducidad = fechaCaducidad;
    }
    public void setPrecio(float nuevoPrecio){
        this.precio=nuevoPrecio;
    }

    //Metodos añadidos
    public int valoraCodigoBarras(){
        int valor= Integer. parseInt(this.getCodigoBarras());
        return valor;
    }

    public void incrementarFecha(int meses){
        this.fechaCaducidad.add(MONTH, meses);
    }

    //METODOS DE CLASE OBJECT

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + valoraCodigoBarras();
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.fechaCaducidad);
        hash = 37 * hash + Float.floatToIntBits(this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        boolean ret = false;

        if (this == obj) {
            ret = true;
        }else{
            if (obj != null && obj instanceof ProductosCovid19) {

                ProductosCovid19 other = (ProductosCovid19) obj;

                if (this.getCodigoBarras().equals(other.getCodigoBarras()) &&
                        this.getNombre().equals(other.getNombre()) &&
                        this.getFechaCaducidad().equals(other.getFechaCaducidad()) &&
                        this.getPrecio()==other.getPrecio()){
                    ret=true;
                }
            }
        }
        return ret;
    }

    @Override
    public ProductosCovid19 clone(){

        ProductosCovid19 copia = null;

        try{

            copia = (ProductosCovid19) super.clone();

            GregorianCalendar fechaCopia = new GregorianCalendar(this.fechaCaducidad.get(YEAR),
                    this.fechaCaducidad.get(MONTH),
                    this.fechaCaducidad.get(DAY_OF_MONTH));

            copia.fechaCaducidad=fechaCopia;

        } catch (CloneNotSupportedException ex) {//Cosas que no debeis entender... aun
            System.out.println("ERROR");//Más cosas muy nazis
        }

        return copia;
    }

    public ProductosCovid19 cloneSuperficial(){

        ProductosCovid19 copia = null;

        try{

            copia = (ProductosCovid19) super.clone();

        } catch (CloneNotSupportedException ex) {//Cosas que no debeis entender... aun
            System.out.println("ERROR");//Más cosas muy nazis
        }

        return copia;
    }

    @Override
    public String toString (){
        String precio ="" + this.getPrecio();
        boolean finPrecio=false;
        int i=0;
        String cadena ="Codigo de barras: " + this.getCodigoBarras() +
                "\nNombre: " + this.getNombre() +
                "\nFecha de caducidad: " + this.getFechaCaducidad().get(DAY_OF_MONTH) + "/" + this.getFechaCaducidad().get(MONTH) + "/" + this.getFechaCaducidad().get(YEAR) +
                "\nPrecio: ";
        while(!finPrecio && precio.length()>i){
            cadena+=precio.charAt(i);
            if(precio.charAt(i)=='.'){          //Caso en el que existen decimales pero solo 1
                if(i+2==precio.length()){ //Caso solo un decimal
                    cadena+=precio.charAt(i+1)+"0";
                }else{
                    cadena+=precio.charAt(i+1);
                    cadena+=precio.charAt(i+2);//Caso de más de un decimal (redondeo a la baja)
                }
                finPrecio=true;
            }
            i++;
        }
        return cadena+" €";
    }

    public int compareTo (ProductosCovid19 Producto){
        int comparacion;
        if (this.equals(Producto)){
            comparacion=0;
        }else{
            if (this.valoraCodigoBarras()<Producto.valoraCodigoBarras()){
                comparacion=1;
            }else{
                comparacion=-1;
            }
        }
        return comparacion;
    }

}

