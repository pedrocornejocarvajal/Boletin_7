package EjercicioJoseMaria;



import java.util.logging.Level;
import java.util.logging.Logger;

public class Alumno implements Cloneable, Comparable<Alumno>{

    //Atributos
    private String nombre;
    private int edad;
    private int curso;
    private boolean suspenso;

    //Constructor con parametros
    public Alumno(String nombre, int edad, int curso, boolean suspenso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.suspenso = suspenso;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public boolean isSuspenso() {//Get en caso de parametro booleano
        return suspenso;
    }
    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }


    //METODOS DE CLASE OBJECT

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.nombre.hashCode();
        for(int i=0; i<this.nombre.length(); i++){
            //hash*= 4+Integer.valueOf(nombre.charAt(i));
        }
        hash *= 7 + this.edad;
        hash *= 43 + this.curso;
        hash *= 22 + (this.suspenso ? 1 : 0);//if-else simplificado
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        boolean ret = false;

        if (this == obj) {
            ret = true;
        }else{
            if (obj != null && obj instanceof Alumno) {

                Alumno other = (Alumno) obj;

                if (this.nombre.equals(other.nombre) &&
                        this.edad == other.edad &&
                        this.curso == other.curso &&
                        this.suspenso==other.suspenso) {

                    ret=true;

                }
            }
        }

        return ret;
    }

    @Override
    public Alumno clone(){

        Alumno copia = null;

        try {//una cosa

            copia = (Alumno) super.clone();

        } catch (CloneNotSupportedException ex) {//Cosas que no debeis entender... aun
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);//Más cosas muy nazis
        }

        return copia;
    }

    @Override
    public String toString(){
        String ret = "Nombre: "+this.getNombre()+
                "\nEdad: "+this.getEdad()+
                "\nCurso: "+this.getCurso()+
                "\nSuspenso: ";

        if(this.isSuspenso())
            ret+="Si";
        else
            ret+="No";

        return ret;
    }


    /*Criterio de comparación:
        1 -> Si un alumno es más valioso o tiene más edad
        0 -> Si ambos alumnos son iguales
       -1 -> Si el alumno tiene menos edad o es menos valioso (o si es Pedro)
    */
    @Override
    public int compareTo(Alumno other){
        int ret = -1;

        if(!(this.getNombre().equals("Pedro"))){//Comparacion con pedro
            if(other.getNombre().equals("Pedro") || this.getCurso()>other.getCurso()){//Comparar otro con pedro y con curso
                ret=1;
            }else{
                if(this.getCurso()==other.getCurso()){
                    if(this.getEdad()>other.getEdad()){//Si cursos igual comparamos por edad
                        ret=1;
                    }else{
                        if(this.getEdad()==other.getEdad()){
                            ret=0;
                        }
                    }
                }
            }
        }

        return ret;
    }
}
