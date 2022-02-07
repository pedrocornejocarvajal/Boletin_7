package Ejercicio4;

//enum Vocales {a,e,i,o,u,á, é, í, ó,ú,ü}

public class Texto {
    /**
     * variable estática con todas las vocales posibles
      */
    static final String VOCALES ="aeiouáéíóúü";
//la declaramos final para que no varíe el tamaño una vez que lo hayamos declarado
    private final int tamañoMax;
    private String texto="";

     //Constructor con longitud del texto
    public Texto (int tamañoMax){
        this.texto="";
        this.tamañoMax= tamañoMax;
    }
    //método getter
    public String getTexto(){
        return this.texto;
    }

    //añadir una cadena al principio si hay espacio
    public boolean añadirCadenaPpio(String cadena){
        boolean resultado=false;
        if (comprobacionDeLlenado(cadena)) {
            this.texto = cadena + this.texto;
            resultado=true;
        }
        return resultado;
    }
    //añadir una cadena al final si hay espacio
    public boolean añadirCadenaFinal(String cadena){
        boolean resultado=false;
        if (comprobacionDeLlenado(cadena)) {
            this.texto = this.texto + cadena;
            resultado=true;
        }
        return resultado;
    }

//Contar cuántas vocales hay en el texto.

    public int contarVocales() {
        int resultado = 0;

        for (int i = 0; i < this.texto.length(); i++) {
            if (esVocal(this.texto.charAt(i))) {
                resultado++;
            }
              }
        return resultado;
    }
public boolean esVocal(char c){
        c=Character.toLowerCase(c);
        boolean resultado = false;
        if (VOCALES.indexOf(c)!=-1){
            resultado=true;
         }
        Character caracter=c;

        return resultado;

}

private boolean comprobacionDeLlenado(String cadena){
        boolean terminar = false;
        int len = cadena.length();
        int textoLen = getTexto().length();
        if((tamañoMax - textoLen) >= len ){
            terminar = true;
        }
    return terminar;
}

}
